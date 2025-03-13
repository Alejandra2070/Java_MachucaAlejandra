/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia.ArchivoSimple;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class PersistenciaFile {
    private static final String nombre_archivo = "./src/persistencia/ArchivoSimple/data.txt";
    
    //Método para guardar
    public static void guardarDatos(String contenido){
        try(FileWriter guardar = new FileWriter(nombre_archivo)){
            guardar.write(contenido);
            System.out.println("Datos fueron guardados de manera correcta!");
        }
        catch(IOException e){
            System.out.println("Error al momento de guardar: "+ e.getMessage());
        }
    }
    
    public static void leerDatos(){
        try(BufferedReader lector = new BufferedReader(new FileReader(nombre_archivo))){
            String linea;
            System.out.println("Contenido del archivo: ");
            while((linea = lector.readLine()) !=null){
                System.out.println(linea);
            }
        }
        catch(IOException e){
            System.out.println("Error al momento de importar el archivo");
        }
    }
}
