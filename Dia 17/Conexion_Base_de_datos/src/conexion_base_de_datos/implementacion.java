package conexion_base_de_datos;

/*import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;*/

import java.sql.*;
import java.util.Scanner;

public class implementacion {
    
    public static void main(String[] args) throws SQLException {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("----------Bienvenido---------");
        System.out.println("*****************************");
        System.out.println("             Menú            ");
        System.out.println("*****************************");
        boolean salir = false;
        while (salir == false){
            System.out.println("1. Ver perfumes.");
            System.out.println("2. Agregar perfumes.");
            System.out.println("3. Actualizar perfumes.");
            System.out.println("4. Eliminar perfumes.");
            System.out.println("5. Salir.");
            System.out.println("Elige una de nuestras opciones: ");
            int opc = scanner.nextInt();

            switch(opc){
                case 1:

                    Perfume per = new Perfume();
                    per.mostrarDatos();

                    break;

                case 2:
                    System.out.println("Ingresa la siguiente información: ");
                    System.out.println("1. Nombre del perfume: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    System.out.println("2. Precio: ");
                    int price = scanner.nextInt();
                    System.out.println("3. Cantidad: ");
                    int cant = scanner.nextInt();

                    Perfume per2 = new Perfume();
                    per2.añadirDatos(name, price, cant);

                    break;

                case 3:
                    System.out.println("1. Ingresa el id: ");
                    int d = scanner.nextInt();
                    System.out.println("2. Ingresa el nuevo nombre: ");
                    scanner.nextLine();
                    String n = scanner.nextLine();
                    System.out.println("3. Ingresa el nuevo precio: ");
                    int p = scanner.nextInt();
                    System.out.println("4. Ingresa la nueva cantidad: ");
                    int c = scanner.nextInt();
                    Perfume per3 = new Perfume();
                    per3.actualizar(n, p, c, d);
                    break;

                case 4:
                    System.out.println("Ingresa el id del perfume que quieres eliminar: ");
                    int i = scanner.nextInt();
                    Perfume per4 = new Perfume();
                    per4.eliminar(i);
                    break;

                case 5:
                    System.out.println("***************************************************************");
                    System.out.println("Muchas gracias por utilizar nuestro programa. Vuelve pronto! :D");
                    System.out.println("***************************************************************");
                    salir = true;
                    break;
            }
        }
             
                  
    }
}