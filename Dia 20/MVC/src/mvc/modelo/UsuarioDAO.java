package mvc.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO{
    
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
    
    public boolean agregar(Usuario user){
        PreparedStatement ps = null;
        Connection cx = getConexion();
        
        String sql = "insert into usuarios (nombre, email) values (?,?)";
        
        try{
            ps = cx.prepareStatement(sql);
            ps.setString(1, user.getNombre());
            ps.setString(2, user.getEmail());
            ps.execute();
            return true;
        }
        catch(SQLException e){
            System.err.println(e);
            return false;
        }
        finally{
            try{
                cx.close();
            }
            catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    
    public boolean actualizar(Usuario user){
        PreparedStatement ps = null;
        Connection cx = getConexion();
        
        String sql = "update usuarios set nombre=?, email=? where id=?";
        
        try{
            ps = cx.prepareStatement(sql);
            ps.setString(1, user.getNombre());
            ps.setString(2, user.getEmail());
            ps.setInt(3, user.getId());
            ps.execute();
            return true;
        }
        catch(SQLException e){
            System.err.println(e);
            return false;
        }
        finally{
            try{
                cx.close();
            }
            catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    
    public boolean eliminar(Usuario user){
        PreparedStatement ps = null;
        Connection cx = getConexion();
        
        String sql = "delete from usuarios where id=?";
        
        try{
            ps = cx.prepareStatement(sql);
            ps.setInt(1, user.getId());
            ps.execute();
            return true;
        }
        catch(SQLException e){
            System.err.println(e);
            return false;
        }
        finally{
            try{
                cx.close();
            }
            catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    
    public List<String> obtenerUsuarioID(Usuario user){
        String sql =" select * from usuarios where id=?";
        List<String> ListaUsuario = new ArrayList<>();
        try{
            Connection cx = getConexion();
            PreparedStatement solicitud =cx.prepareStatement(sql);
            solicitud.setInt(1, user.getId());
            ResultSet resultado = solicitud.executeQuery();
            while(resultado.next()){
                ListaUsuario.add(resultado.getInt("id")
                        + " - "+ resultado.getString("nombre")+ " - " 
                                +resultado.getString("email"));
            }
            
        }catch(SQLException e){
        
            e.printStackTrace();
        }
        return ListaUsuario;
       
    }
    
    public List<String> obtenerUsuario(){
        String sql =" select * from usuarios";
        List<String> ListaUsuario = new ArrayList<>();
        try{
            Connection cx = getConexion();
            PreparedStatement solicitud =cx.prepareStatement(sql);
            ResultSet resultado = solicitud.executeQuery();
            while(resultado.next()){
                ListaUsuario.add(resultado.getInt("id")
                        + " - "+ resultado.getString("nombre")+ " - " 
                                +resultado.getString("email"));
            }
            
        }catch(SQLException e){
        
            e.printStackTrace();
        }
        return ListaUsuario;
       
    }
}
