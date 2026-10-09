package persistencia;

import java.sql.Statement;
import java.sql.ResultSet;
import entidades.Alumno;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AlumnoData {

    private Connection connection = null;

    public AlumnoData(miConexion conexion) {
        this.connection = conexion.initConnection();
    }

    public void guardarAlumno(Alumno a) { //DNI, NOMBRE, FECHA NAC, ACTIVO
        String sql = "INSERT INTO `alumno` (dni, nombre, fecNac, activo ) VALUES (?, ?, ?, ?)";

        try {

            PreparedStatement stm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); //guarda el Id auto incrementado...

            stm.setInt(1, a.getDni());
            stm.setString(2, a.getNombre());
            stm.setDate(3, Date.valueOf(a.getFechaNac())); //convertimos el LocalDate en un Date
            stm.setBoolean(4, a.getActivo());

            int aux = stm.executeUpdate();

            ResultSet rs = stm.getGeneratedKeys();

            if (rs.next()) {
                a.setId(rs.getInt(1)); //se le setea el id autogenerado por la BD...
            }
            JOptionPane.showMessageDialog(null, "Alumno creado con exito");
            System.out.println("se agregaron " + aux + " alumnos a la Base de Datos");

        } catch (SQLException exception) {
            exception.printStackTrace();
            JOptionPane.showMessageDialog(null, exception.getMessage());
        }

    }

    public Alumno buscarAlumno(int ID) {

        Alumno al = null;
        String sql = "SELECT * FROM `alumno` WHERE idAlumno= ? ";

        try {

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, ID);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("idAlumno");
                int dni = rs.getInt("dni");
                String nombre = rs.getString("nombre");
                LocalDate nac = rs.getDate("fecNac").toLocalDate();
                boolean activo = rs.getBoolean("activo");

                al = new Alumno(id, dni, nombre, nac, activo);
                JOptionPane.showMessageDialog(null, "Alumno encontrado con exito");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        return al;

    }

    public void eliminarAlumno(int ID) {

        String sql = "DELETE FROM `alumno` WHERE idAlumno = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, ID);

            JOptionPane.showMessageDialog(null, "Alumno eliminado con exito");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se encontró un alumno con el ID especificado " + e.getMessage());
        }
    }

    public void altaAlumno(int ID) {

        String SQL = "UPDATE `alumno` SET `activo`=1 WHERE `idAlumno`=?";

        try {
            PreparedStatement pm = connection.prepareStatement(SQL);
            pm.setInt(1, ID);

            pm.executeUpdate();

            JOptionPane.showMessageDialog(null, "Se dio de alta al alumno correctamente!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se encontro un alumno con el id especificado!" + e.getMessage());
        }

    }

    public void bajaAlumno(int ID) {

        String SQL = "UPDATE `alumno` SET `activo`=0 WHERE `idAlumno`=?";

        try {

            PreparedStatement pm = connection.prepareStatement(SQL);
            pm.setInt(1, ID);

            pm.executeUpdate();

            JOptionPane.showMessageDialog(null, "Alumno dado de baja exitosamente!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se encontro un alumno con el ID especificado!" + e.getMessage());
        }

    }

    public void actualizarDatos(int ID, int DNI, String Nombre, LocalDate fechaNacimiento, boolean activo) {

        String SQL = "UPDATE `alumno` SET `dni`=?, `nombre`=?, `fecNac`=?, `activo`=? WHERE `idAlumno`=?";

        try {
            PreparedStatement pm = connection.prepareStatement(SQL);
            pm.setInt(1, DNI);
            pm.setString(2, Nombre);
            pm.setDate(3, Date.valueOf(fechaNacimiento));
            pm.setBoolean(4, activo);
            pm.setInt(5, ID);

            pm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Alumno actualizado con exito!");

        } catch (SQLException E) {
            JOptionPane.showMessageDialog(null, "Datos ingresados invalidos!");
        }
    }

    public List<Alumno> ListarAlumnos() {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        String SQL = "SELECT * FROM `alumno`";

        try {
            PreparedStatement ps = connection.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("idAlumno");
                String nombre = rs.getString("nombre");
                int dni = rs.getInt("dni");
                LocalDate fechaNac = rs.getDate("fecNac").toLocalDate();
                boolean activo = rs.getBoolean("activo");

                Alumno alumno = new Alumno(id, dni, nombre, fechaNac, activo);
                alumnos.add(alumno);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encontraron alumnos");
        }

        return alumnos;
    }
}
