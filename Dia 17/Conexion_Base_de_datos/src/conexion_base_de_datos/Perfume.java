package conexion_base_de_datos;

import java.sql.*;

public class Perfume {
    
    public void mostrarDatos(){
        String query="select * from perfumes;";
        try {
           Connection con=Conexion.conectar(); // Se establece la conexion con bd
           PreparedStatement ps=con.prepareStatement(query);// Se prepara el comando a realizar
           ResultSet rs=ps.executeQuery();
           while (rs.next()){// el bucle se va a ejecutar mientras que rs tenga registros
               int id=rs.getInt("id");
               String nombre=rs.getString("nombre");
               String precio=rs.getString("precio");
               int cantidad=rs.getInt("cantidad");
               System.out.println("id: "+ id + "\nNombre: "+ nombre + "\nPrecio: " + precio+ "\nCantidad: " + cantidad);
            }
        }
        catch (SQLException ex){
          System.out.println("Error al leer los datos");
          ex.printStackTrace();
        }    
    }
    
    public void añadirDatos( int id, String nombre, int precio, int cantidad){
        String query = "insert into perfumes (id, nombre, precio, cantidad) VALUES (?, ?, ?, ?, ?)";
        try{
            Connection con = Conexion.conectar();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ps.setString(2,nombre);
            ps.setInt(3, precio);
            ps.setInt(4, cantidad);
            
            ps.executeUpdate();
            System.out.println("Dato insertado con éxito.");
        }
        catch(SQLException ex){
            System.out.println("Error al insertar dato.");
            ex.printStackTrace();
        }
    }
    
    public void actualizar(int id, String nombre, int precio, int cantidad){
        String query = "update perfumes set nombre=? set precio=? set cantidad=? where id=?";
        try{
            Connection con = Conexion.conectar();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ps.setString(2,nombre);
            ps.setInt(3, precio);
            ps.setInt(4, cantidad);
            
            ps.executeUpdate();
            System.out.println("Dato actualizado con éxito.");
        }
        catch(SQLException ex){
            System.out.println("Error al actualizar dato.");
            ex.printStackTrace();
        }
    }
    
    public void eliminar(int id){
        String query = "delete from perfumes set nombre set precio set cantidad=? where id=?";
        try{
            Connection con = Conexion.conectar();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            
            ps.executeUpdate();
            System.out.println("Dato eliminado con éxito.");
        }
        catch(SQLException ex){
            System.out.println("Error al eliminar dato.");
            ex.printStackTrace();
        }
    }
    
}
