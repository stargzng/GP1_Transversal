
package persistencia;

import com.mysql.jdbc.Connection;


public class MateriaData {
    private Connection connection = null;

    public MateriaData(miConexion conexion) {
        this.connection = (Connection) conexion.initConnection();
    }
    
    
}
