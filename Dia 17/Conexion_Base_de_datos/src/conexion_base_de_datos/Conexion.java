package conexion_base_de_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Conexion {
    String bd="Ejercicio";
    String url="jdbc:mysql://localhost:3306/";
    String user="root";
    String password="campus2023";
    String driver="com.mysql.cj.jdbc.Driver";
    Connection cx;
    
    public Conexion(){}
    
    public Connection conectar(){
        try {
            Class.forName(driver);
            cx=DriverManager.getConnection(url+bd,user,password);
            System.out.println("Se conectó a BD "+bd);
        } catch (ClassNotFoundException |SQLException ex) {
            System.out.println("No se conectó a BD "+bd);
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return cx;
        
    }
    
    public void desconectar(){
        try{
            cx.close();
        }
        catch(SQLException ex){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
