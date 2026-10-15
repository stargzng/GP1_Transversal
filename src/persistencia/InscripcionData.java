package persistencia;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materia;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class InscripcionData {

    private Connection connection;

    public InscripcionData(miConexion miConexion) {
        connection = miConexion.initConnection();
    }

    public Inscripcion inscribirAlumno(Inscripcion cursada) {

        if (EstaInscripto(cursada.getAlumno(), cursada.getMateria())) {
            JOptionPane.showMessageDialog(null, "El alumno ya esta incripto en esa materia!");
            return null;
        }

        String SQL = "INSERT INTO `cursada`(`nota`, `asist`, `cursa`, `idAlumno`, `idMateria`) VALUES (?,?,?,?,?)";

        try {

            PreparedStatement ps = connection.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);

            ps.setDouble(1, cursada.getNota());
            ps.setDouble(2, cursada.getAsistencia());
            ps.setInt(3, cursada.getAño());
            ps.setInt(4, cursada.getAlumno().getId());
            ps.setInt(5, cursada.getMateria().getId());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                cursada.setIdCursada(rs.getInt(1));
            }

            JOptionPane.showMessageDialog(null, "Se inscribio al alumno correctamente \nId de cursada: " + cursada.getIdCursada());

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 2);
        }

        return cursada;
    }

    public void eliminarCursada(int idCursada) {

        String SQL = "DELETE FROM `cursada` WHERE idCursada = ?";

        try {

            PreparedStatement ps = connection.prepareStatement(SQL);
            ps.setInt(1, idCursada);

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Se elimino el registro de la cursada");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se encontro una cursada con el ID indicado! " + e.getMessage(), "Error", 2);
        }

    }

    public void editarCursada(int idCursada, double nota, double asistencia, int año, Alumno alumno, Materia materia) {

        String SQL = "UPDATE `cursada` SET `nota`= ?,`asist`= ?,`cursa`= ?,`idAlumno`= ?,`idMateria`= ? WHERE idCursada = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(SQL);
            ps.setDouble(1, nota);
            ps.setDouble(2, asistencia);
            ps.setInt(3, año);
            ps.setInt(4, alumno.getId());
            ps.setInt(5, materia.getId());
            ps.setInt(6, idCursada);

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Se actualizo el registro de cursada!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    public void cargarNotas(int nota, Alumno alumno, Materia materia) {

        if (!EstaInscripto(alumno, materia)) {
            JOptionPane.showMessageDialog(null, "No se encontro la inscripcion!");
            return;
        }

        String SQL = "UPDATE `cursada` SET nota = ? WHERE idAlumno = ? AND idMateria = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(SQL);
            ps.setInt(1, nota);
            ps.setInt(2, alumno.getId());
            ps.setInt(3, materia.getId());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Nota actualizada ✔");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Corrobore los campos ID");
        }

    }

    public ArrayList<Inscripcion> listarCursada(Alumno alumno) {

        String SQL = "SELECT cursada.nota, cursada.asist, cursada.cursa, materia.idMateria, materia.nombre, materia.estado  FROM `cursada` INNER JOIN `materia` INNER JOIN `alumno`ON materia.idMateria = cursada.idMateria AND alumno.idAlumno =cursada.idAlumno WHERE alumno.idAlumno = ?;";

        ArrayList<Inscripcion> cursadas = new ArrayList<>();

        try {

            PreparedStatement ps = connection.prepareStatement(SQL);
            ps.setInt(1, alumno.getId());

            ResultSet rs = ps.executeQuery();

            if (!rs.next()) {
                return null;
            }

            while (rs.next()) {
                double nota = rs.getDouble("nota");
                double asist = rs.getDouble("asist");
                int año = rs.getInt("cursa");
                int idMateria = rs.getInt("idMateria"); //para buscar la materia
                String nombreMateria = rs.getString("nombre");
                boolean estadoMateria = rs.getBoolean("estado");

                Materia materia = new Materia(idMateria, nombreMateria, estadoMateria);

                cursadas.add(new Inscripcion(nota, asist, año, alumno, materia));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        return cursadas;

    }

    public boolean EstaInscripto(Alumno alumno, Materia materia) {

        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM `cursada` WHERE idAlumno = ? AND idMateria = ?");
            ps.setInt(1, alumno.getId());
            ps.setInt(2, materia.getId());

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return true;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return false;

    }

}
