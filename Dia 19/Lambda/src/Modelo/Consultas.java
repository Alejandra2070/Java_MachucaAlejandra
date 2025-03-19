package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Consultas extends Conexion {
    
    public boolean agregar(Usuarios user){
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
    
    public boolean actualizar(Usuarios user){
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
    
    public boolean eliminar(Usuarios user){
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
    
    public boolean obtener(Usuarios user){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection cx = getConexion();
        
        String sql = "select * from usuarios where id=?";
        
        try{
            ps = cx.prepareStatement(sql);
            ps.setInt(1, user.getId());
            rs = ps.executeQuery();
            
            if (rs.next()){
                user.setNombre(rs.getString("nombre"));
                user.setEmail(rs.getString("email"));
                return true;
            }
            return false;
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
