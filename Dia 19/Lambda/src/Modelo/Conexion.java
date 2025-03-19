package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    Connection cx;
    
    String url = "jdbc:mysql://bjhia8yf7nejmxqu4tx1-mysql.services.clever-cloud.com:3306/bjhia8yf7nejmxqu4tx1";
    String user = "ucqdvqwkmzzpbcbe";
    String password = "5ZAirlHDiG5Q2lmNtsnx";
    
    public Connection getConexion(){
        try{
            cx = DriverManager.getConnection(url, user, password);
            System.out.println("Se conectó a BBDD");
        }
        catch(SQLException e){
            System.out.println("No se conectó a BBDD");
        }
        return cx;
    }
}
