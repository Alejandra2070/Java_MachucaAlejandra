package conexion_base_de_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Conexion {
    static String bd="Ejercicio";
    static String url="jdbc:mysql://localhost:3306/";
    static String user="root";
    static String password="Alejandra";
    static String driver="com.mysql.cj.jdbc.Driver";
    
    public Conexion(){};
    
    public static Connection conectar(){
        Connection cx = null;
        try {
            Class.forName(driver);
            cx=DriverManager.getConnection(url+bd, user, password);
            /*System.out.println("Se conectó a BD "+bd);*/
        } catch (ClassNotFoundException |SQLException ex) {
            System.out.println("No se conectó a BD "+bd);
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return cx;
        
    }
    
    /*public void desconectar(){
        try{
            cx.close();
        }
        catch(SQLException ex){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
}
