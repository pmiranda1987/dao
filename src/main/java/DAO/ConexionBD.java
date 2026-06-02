
package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
       
    protected Connection conexion;
    private final String url = "jdbc:sqlserver://localhost:1433;databaseName=Universidad;trustServerCertificate=true";
    private final String user = "sa";
    private final String password = "Alumno123";
    
    
    public void conectar () throws Exception{
        try{
            conexion = DriverManager.getConnection(url, user, password);
            Class.forName(url);
            
        }
        catch (Exception e){
            throw e;
        }
    }
    
    public void cerrar () throws SQLException{
        if (conexion !=null && !conexion.isClosed()){
            conexion.close();
        }
    }
    
   
  
    
}
