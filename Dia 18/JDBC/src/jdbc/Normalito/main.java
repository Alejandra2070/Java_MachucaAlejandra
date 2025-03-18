package jdbc.Normalito;

import java.util.List;

public class main {
    public static void main(String[] args) {
        UsuarioDAO userDAO = new UsuarioDAO();
        
        //Insertar usuario
        /*userDAO.insertUsuario("Pedrito", "pedrogomez.campuslands@gmail.com");
        userDAO.insertUsuario("Valentina", "valentina.campuslands@gmail.com");
        userDAO.insertUsuario("Zully", "zully.campuslands@gmail.com");*/
        
        //Mostrar usuarios
        List<String> listaUsuarios = userDAO.obtenerUsuarios();
        for(String usuario : listaUsuarios){
            System.out.println(usuario);
        }
        
        //Actualizar usuario
        /*userDAO.actualizarUsuario(3, "Jaime", "jaime@campuslands.com");
        listaUsuarios = userDAO.obtenerUsuarios();
        System.out.println("************************");
        for(String usuario : listaUsuarios){
            System.out.println(usuario);
        }*/
        
        //Eliminar usuarios
        //userDAO.eliminarUsuario(1);
        
        //Filtrar por id
        List<String> listaUsuariosFiltrado = userDAO.filtrarUsuarios(3);
        for(String usuario : listaUsuariosFiltrado){
            System.out.println(usuario);
        }
        userDAO.filtrarUsuarios(3);
    }
}
