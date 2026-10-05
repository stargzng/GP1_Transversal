package persistencia;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class miConexion {

    private String URL;
    private String usr;
    private String pass;
    private static Connection connection = null;

    public miConexion(String URL, String usr, String pass) {
        this.URL = URL;
        this.usr = usr;
        this.pass = pass;
    }

    public Connection initConnection() {

        if (connection == null) {

            try {
                
                Class.forName("com.mysql.jdbc.Driver");//carga el driver
                
                connection = DriverManager.getConnection(URL, usr, pass); //el driver inicia la conexion

            } catch (SQLException ex) { //atrapa la exception en caso de que no se pueda establecer la coneccion con la BD
                JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion " + ex); 
                
            } catch (ClassNotFoundException ex) { //atrapa la exception en caso de que el driver este mas escrito o no se encuentra
                JOptionPane.showMessageDialog(null, "No se pudo cargar el Driver de conexion");
            }       
        }
        return connection; //finalmente devuelve la Connection.
    }
}
