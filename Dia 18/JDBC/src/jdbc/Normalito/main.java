package jdbc.Normalito;

import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        UsuarioDAO userDAO = new UsuarioDAO();
        
        boolean salir = true;
        
        System.out.println("------- Menú -------");
        
        while(salir){
            System.out.println("1. Agregar usuarios.");
            System.out.println("2. Mostrar usuarios.");
            System.out.println("3. Actualizar usuarios.");
            System.out.println("4. Eliminar usuarios.");
            System.out.println("5. Filtrar usuarios por id.");
            System.out.println("6. Salir");
            System.out.println("Elige una de las opciones: ");
            int opc = scanner.nextInt();

            switch(opc){
                case 1:
                    System.out.println("---- Agregar usuarios ---");
                    System.out.println("Ingresa el nombre: ");
                    scanner.nextLine();
                    String nombre = scanner.nextLine();

                    System.out.println("Ingresa el email: ");
                    String email = scanner.nextLine();

                    userDAO.insertUsuario(nombre, email);
                break;

                case 2:
                    System.out.println("---- Lista de usuarios ----");
                    List<String> listaUsuarios = userDAO.obtenerUsuarios();
                    for(String usuario : listaUsuarios){
                        System.out.println(usuario);
                    }
                break;

                case 3:
                    System.out.println("---- Actualizar usuarios ----");
                    System.out.println("Ingresa el id del usuario que quieres actualizar: ");
                    int ide3 = scanner.nextInt();

                    System.out.println("Ingresa el nuevo nombre: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();

                    System.out.println("Ingresa el nuevo email: ");
                    String mail = scanner.nextLine();

                    userDAO.actualizarUsuario(ide3, name, mail);
                    listaUsuarios = userDAO.obtenerUsuarios();
                    System.out.println("************************");
                    for(String usuario : listaUsuarios){
                        System.out.println(usuario);
                    }
                break;

                case 4:
                    System.out.println("---- Eliminar usuarios ----");
                    System.out.println("Ingresa el id del usuario que quieres eliminar: ");
                    int ide4 = scanner.nextInt();
                    userDAO.eliminarUsuario(ide4);
                break;

                case 5:
                    System.out.println("---- Filtrar usuarios ----");
                    System.out.println("Ingresa el id que quieres buscar: ");
                    int ide5 = scanner.nextInt();

                    List<String> listaUsuariosFiltrado = userDAO.filtrarUsuarios(ide5);
                    for(String usuario : listaUsuariosFiltrado){
                        System.out.println(usuario);
                    }
                break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    salir = false;
                    break;
            }
        }
        
            
        
        //Mostrar usuarios
        /*List<String> listaUsuarios = userDAO.obtenerUsuarios();
        for(String usuario : listaUsuarios){
            System.out.println(usuario);
        }*/
        
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
        /*List<String> listaUsuariosFiltrado = userDAO.filtrarUsuarios(3);
        for(String usuario : listaUsuariosFiltrado){
            System.out.println(usuario);
        }
        userDAO.filtrarUsuarios(3);*/
    }
}
