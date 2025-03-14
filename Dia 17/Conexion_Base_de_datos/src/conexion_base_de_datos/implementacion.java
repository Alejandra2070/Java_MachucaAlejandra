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
                /*System.out.println("Ingresa la siguiente información: ");
                System.out.println("1. Id: ");
                int ide = scanner.nextInt();
                System.out.println("2. Nombre del perfume: ");
                scanner.nextLine();
                String name = scanner.nextLine();
                System.out.println("3. Precio: ");
                int price = scanner.nextInt();
                System.out.println("4. Cantidad: ");
                int cant = scanner.nextInt();*/

                Perfume per2 = new Perfume();
                per2.añadirDatos(4, "Natura", 45000, 4);
                /*per2.añadirDatos(ide, name, price, cant);*/

                break;

            case 3:
                Perfume per3 = new Perfume();
                per3.actualizar(1,"Natura", 45000, 4);
                break;

            case 4:
                Perfume per4 = new Perfume();
                per4.eliminar(4);
                break;

            case 5:
                System.out.println("***************************************************************");
                System.out.println("Muchas gracias por utilizar nuestro programa. Vuelve pronto! :D");
                System.out.println("***************************************************************");
                break;     
        }           
    }
}