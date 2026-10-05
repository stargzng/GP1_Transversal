package persistencia;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import entidades.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MateriaData {

    private Connection connection = null;

    public MateriaData(miConexion conexion) {
        this.connection = conexion.initConnection();
    }

    public void guardarMateria(Materia materia) {
        String sql = "INSERT INTO materia (nombre, estado) VALUES (?, ?)";

        try {
            PreparedStatement stm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            stm.setString(1, materia.getNombre());
            stm.setBoolean(2, materia.getEstado());

            int aux = stm.executeUpdate();
            ResultSet rs = stm.getGeneratedKeys();

            if (rs.next()) {
                materia.setId(rs.getInt(1)); // Asigna el ID auto-generado a la entidad
            }

            System.out.println("Se agregaron " + aux + " materias a la Base de Datos");
            JOptionPane.showMessageDialog(null, "Materia guardada con éxito!");

        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(null, "Error al guardar materia: " + exception.getMessage());
        }
    }

    public Materia buscarMateria(int id) {
        Materia materia = null;
        String sql = "SELECT * FROM materia WHERE idMateria = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int idMateria = rs.getInt("idMateria");
                String nombre = rs.getString("nombre");
                boolean estado = rs.getBoolean("estado");

                materia = new Materia(idMateria, nombre, estado);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar materia: " + ex.getMessage());
        }

        return materia;
    }
    
    public void actualizarMateria(int id, String nombre, boolean estado) {
        String sql = "UPDATE materia SET nombre = ?, estado = ? WHERE idMateria = ?";

        try {
            PreparedStatement pm = connection.prepareStatement(sql);
            pm.setString(1, nombre);
            pm.setBoolean(2, estado);
            pm.setInt(3, id);

            pm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Materia actualizada");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar materia: " + e.getMessage());
        }
    }
    public void altaMateria(int id) {
        String sql = "UPDATE materia SET estado = 1 WHERE idMateria = ?";

        try {
            PreparedStatement pm = connection.prepareStatement(sql);
            pm.setInt(1, id);

            pm.executeUpdate();
            JOptionPane.showMessageDialog(null, "alta de  materia correctamente!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se encontró una materia con el ID : " + e.getMessage());
        }
    }
    public void bajaMateria(int id) {
        String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ?";

        try {
            PreparedStatement pm = connection.prepareStatement(sql);
            pm.setInt(1, id);

            pm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Materia dada de baja!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se encontró una materia con el ID especificado: " + e.getMessage());
        }
    }
    public List<Materia> obtenerMaterias() {
        List<Materia> materias = new ArrayList<>();
        String sql = "SELECT * FROM `materia`";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("idMateria");
                String nombre = rs.getString("nombre");
                boolean estado = rs.getBoolean("estado");

                Materia materia = new Materia(id, nombre, estado);
                materias.add(materia);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar materias: " + ex.getMessage());
        }

        return materias;
    }
    public void eliminarMateria(int id) {
        String sql = "DELETE FROM materia WHERE idMateria = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);

            int e = ps.executeUpdate();
            System.out.println("Se eliminó " + e + " materia de la base de datos");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se encontró una materia con el ID especificado: " + e.getMessage());
        }
    }
}
    
    


