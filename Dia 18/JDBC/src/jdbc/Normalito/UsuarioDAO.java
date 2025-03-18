package jdbc.Normalito;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    
    //ATRIBUTOS DE CONEXIÓN A LA BBDD
    //jdbc:mysql://host:puerto/basededatos
    private String URL = "jdbc:mysql://bjhia8yf7nejmxqu4tx1-mysql.services.clever-cloud.com:3306/bjhia8yf7nejmxqu4tx1";
    //jdbc:mysql://localhost:3306/miBaseDatos
    private String USUARIO = "ucqdvqwkmzzpbcbe";
    private String PASSWORD = "5ZAirlHDiG5Q2lmNtsnx";
    
    //Método para conectarnos a la BBDD
    private Connection conectar() throws SQLException{
        return DriverManager.getConnection(URL, USUARIO, PASSWORD);
    }
    
    //Crear (Insert)
    public void insertUsuario(String nombre, String email){
        String sql = "insert into usuarios (nombre, email) values (?,?);";
        try(
            Connection conexionInterna = conectar();
            PreparedStatement solicitud = conexionInterna.prepareStatement(sql)){
        
            //Asignando valores a las incógnitas
            solicitud.setString(1, nombre);
            solicitud.setString(2, email);
            
            //Ejecución de la solicitud
            solicitud.executeUpdate();
            System.out.println("Usuario ingresado de manera exitosa!");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    //Leer (SELECT)
    //select * from usuarios;
    public List<String> obtenerUsuarios(){
        String sql = "select * from usuarios;";
        List<String> listaUsuarios = new ArrayList<>();
        
        try(
            Connection conexionInterna = conectar();
            PreparedStatement solicitud = conexionInterna.prepareStatement(sql);
            ResultSet resultado = solicitud.executeQuery();
            ){
                while (resultado.next()){
                    listaUsuarios.add(resultado.getInt("id")+
                    " - " + resultado.getString("nombre") + " - "+
                    resultado.getString("email"));
                }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return listaUsuarios;
    }
    
    //Actualizar(Update)
    public void actualizarUsuario(int id, String nombre, String email){
        String sql = "update usuarios set nombre=?, email=? where id=?;";
        try(
            Connection conexionInterna = conectar();
            PreparedStatement solicitud = conexionInterna.prepareStatement(sql)){
        
            //Asignando valores a las incógnitas
            solicitud.setString(1, nombre);
            solicitud.setString(2, email);
            solicitud.setInt(3, id);
            
            //Ejecución de la solicitud
            int filas = solicitud.executeUpdate();
            if(filas > 0){
                System.out.println("************************");
                System.out.println("Usuario actualizado de manera exitosa!");
            }
            else{
                System.out.println("No se pudo actualizar el usuario con ID "+id);
            }
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    //Eliminar (delete)
    public void eliminarUsuario(int id){
        String sql = "delete from usuarios where id=?";
        try{
            Connection conexionInterna = conectar(); // Se establece la conexion con bd
            PreparedStatement solicitud = conexionInterna.prepareStatement(sql);
            solicitud.setInt(1, id);
            
            solicitud.executeUpdate();
            System.out.println("Usuario eliminado con éxito.");
        }
        catch(SQLException ex){
            System.out.println("Error al eliminar usuario.");
            ex.printStackTrace();
        }
    }
    
    //Filtrar por id
    public List<String> filtrarUsuarios(int ide){
        String sql = "select * from usuarios where id = " + ide;
        List<String> listaUsuariosFiltrado = new ArrayList<>();
        
        try(
            Connection conexionInterna = conectar();
            PreparedStatement solicitud = conexionInterna.prepareStatement(sql);
            ResultSet resultado = solicitud.executeQuery();
            ){
                while (resultado.next()){
                    listaUsuariosFiltrado.add(resultado.getInt("id")+
                    " - " + resultado.getString("nombre") + " - "+
                    resultado.getString("email"));
                }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return listaUsuariosFiltrado;
    }
}
