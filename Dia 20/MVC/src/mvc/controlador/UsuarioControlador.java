package mvc.controlador;

import java.util.ArrayList;
import java.util.List;
import mvc.modelo.UsuarioDAO;
import mvc.vista.UsuarioVista;
import java.util.Scanner;
import mvc.modelo.Usuario;

public class UsuarioControlador {
    
    private UsuarioDAO usuarioDAO;
    private UsuarioVista usuarioVista;
    private Scanner scanner;

    public UsuarioControlador(UsuarioDAO usuarioDAO, UsuarioVista usuarioVista) {
        this.usuarioDAO = usuarioDAO;
        this.usuarioVista = usuarioVista;
        this.scanner = scanner = new Scanner(System.in);
    }
    
    public void iniciar(){
        while(true){
            System.out.println("------ Menú principal ------");
            System.out.println("1. Crear usuario.");
            System.out.println("2. Actualizar usuario.");
            System.out.println("3. Eliminar usuario.");
            System.out.println("4. Listar usuarios por id.");
            System.out.println("5. Listar usuarios.");
            System.out.println(":");
            int opcion = scanner.nextInt();
            
            switch(opcion){
                case 1:
                    Usuario newUsuario = usuarioVista.agregarUsuario();
                    usuarioDAO.agregar(newUsuario);
                    System.out.println("Usuario agregado!");
                break;
                
                case 2:
                    Usuario newUsuario2 = usuarioVista.actualizarUsuario();
                    usuarioDAO.actualizar(newUsuario2);
                    System.out.println("Usuario actualizado!");
                break;
                
                case 3:
                    Usuario newUsuario3 = usuarioVista.eliminarUsuario();
                    usuarioDAO.eliminar(newUsuario3);
                    System.out.println("Usuario eliminado!");
                break;
                
                case 4:
                    List<String> listaUsuarios = new ArrayList<>();
                    Usuario newUsuario4 = usuarioVista.listarUsuarioId();
                    listaUsuarios = usuarioDAO.obtenerUsuarioID(newUsuario4);
                    for(String usuario : listaUsuarios){
                        System.out.println(usuario);
                    }
                    System.out.println("Lista de usuarios: ");
                break;
                
                case 5:
                    List<String> listaUsuarios2 = new ArrayList<>();
                    listaUsuarios = usuarioDAO.obtenerUsuario();
                    for(String usuario : listaUsuarios){
                        System.out.println(usuario);
                    }
                    System.out.println("Lista de usuarios: ");
            }
        }
    } 
}
