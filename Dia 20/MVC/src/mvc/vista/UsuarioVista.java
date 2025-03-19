package mvc.vista;

import java.util.List;
import java.util.Scanner;
import mvc.modelo.Usuario;

public class UsuarioVista {
    Scanner scanner = new Scanner(System.in);
    public void mostrarUsuarios(List<Usuario> usuarios){
        System.out.println("Lista de usuarios: ");
        for(Usuario u : usuarios){
            System.out.println(u);
        }
    }
    
    public Usuario agregarUsuario(){
        System.out.println("Datos para nuevo usuario");
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Email: ");
        String email = scanner.nextLine();
        return new Usuario(nombre, email);
    }
    
    public Usuario actualizarUsuario(){
        System.out.println("Ingresa el id que quieres actualizar: ");
        int ide = scanner.nextInt();
        System.out.println("Nombre: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Email: ");
        String mail = scanner.nextLine();
        return new Usuario(ide, name, mail);
    }
    
    public Usuario eliminarUsuario(){
        System.out.println("Ingresa el id que quieres eliminar: ");
        int ide1 = scanner.nextInt();
        return new Usuario(ide1);
    }
    
    public Usuario listarUsuarioId(){
        System.out.println("Ingresa el id: ");
        int ide2 = scanner.nextInt();
        return new Usuario(ide2);
    }
    
}
