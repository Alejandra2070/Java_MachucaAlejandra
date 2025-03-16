/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crudprofe;

import static crudprofe.CrudTXT.*;
import java.util.Scanner;

public class CRUDProfe {

    public static void main(String[] args) {
        
        cargarDatos();
        Scanner sc = new Scanner(System.in);
        
        int opcion;

        do {
            System.out.println("\n--- CRUD ---");
            System.out.println("1. Agregar Persona");
            System.out.println("2. Listar Personas");
            System.out.println("3. Actualizar Persona");
            System.out.println("4. Eliminar Persona");
            System.out.println("5. Agregar productos");
            System.out.println("6. Listar productos.");
            System.out.println("7. Actualizar productos.");
            System.out.println("8. Eliminar productos.");
            System.out.println("9. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // Limpiar buffer
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Edad: ");
                    int edad = sc.nextInt();
                    agregarPersona(id, nombre, edad);
                    guardarDatos();
                    break;

                case 2:
                    ListarPersonas();
                    break;

                case 3:
                    System.out.print("ID de la persona a actualizar: ");
                    int idActualizar = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = sc.nextLine();
                    System.out.print("Nueva edad: ");
                    int nuevaEdad = sc.nextInt();
                    actualizarPersona(idActualizar, nuevoNombre, nuevaEdad);
                    guardarDatos();
                    break;

                case 4:
                    System.out.print("ID de la persona a eliminar: ");
                    int idEliminar = sc.nextInt();
                    eliminarPersona(idEliminar);
                    guardarDatos();
                    break;
                
                case 5:
                    System.out.print("ID: ");
                    int id2 = sc.nextInt();
                    sc.nextLine(); // Limpiar buffer
                    System.out.print("Nombre: ");
                    String nombre2 = sc.nextLine();
                    System.out.print("Precio: ");
                    int precio = sc.nextInt();
                    agregarProducto(id2, nombre2, precio);
                    guardarDatosProductos();
                    break;
                    
                case 6:
                    ListarProductos();
                    break;
                
                case 7:
                    System.out.print("ID del producto a actualizar: ");
                    int idActualizar2 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre2 = sc.nextLine();
                    System.out.print("Nuevo precio: ");
                    double nuevoPrecio = sc.nextDouble();
                    actualizarProducto(idActualizar2, nuevoNombre2, nuevoPrecio);
                    guardarDatosProductos();
                    break;
                    
                case 8:
                    System.out.print("ID del producto a eliminar: ");
                    int idEliminar2 = sc.nextInt();
                    eliminarProducto(idEliminar2);
                    guardarDatosProductos();
                    break;
                case 9:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 9);

        sc.close();
    }
    
}
