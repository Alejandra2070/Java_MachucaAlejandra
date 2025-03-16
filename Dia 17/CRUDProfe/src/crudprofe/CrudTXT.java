package crudprofe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CrudTXT {
    private static String archivo = "./src/crudprofe/data.txt";
    private static List<Persona> personas = new ArrayList<>();
    private static List<Producto> productos = new ArrayList<>();
    
    public static void cargarDatos(){
        personas.clear();
        productos.clear();
        try(BufferedReader reader = new BufferedReader(new FileReader(archivo))){
            String linea;
            while((linea = reader.readLine())!=null){
                if(linea.startsWith("P,")){
                    personas.add(Persona.fromString(linea));
                }
                else if(linea.startsWith("PR,")){
                    productos.add(Producto.fromString(linea));
                }
            }
        }
        catch(Exception e){
            System.out.println("No se puede cargar el archivo. Se procede a crear uno nuevo.");
        }
    }
    
    public static void ListarPersonas(){
        if(personas.isEmpty()){
            System.out.println("No se puede listar las personas porque no hay.");
        }
        else{
            for(Persona persona : personas){
                System.out.println(personas);
            }
        }
    }
    
    public static void ListarProductos(){
        if(productos.isEmpty()){
            System.out.println("No se puede listar los productos porque no hay.");
        }
        else{
            for(Producto productos : productos){
                System.out.println(productos);
            }
        }
    }
    
    public static void guardarDatos() {
        try (FileWriter writer = new FileWriter(archivo)) {
            for (Persona p : personas) {
                writer.write(p.toString() + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error al guardar datos: " + e.getMessage());
        }
    }
    
    public static void guardarDatosProductos() {
        try (FileWriter writer = new FileWriter(archivo)) {
            for (Producto p : productos) {
                writer.write(p.toString() + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error al guardar datos: " + e.getMessage());
        }
    }

    // Crear
    public static void agregarPersona(int id, String nombre, int edad) {
        personas.add(new Persona(id, nombre, edad));
        guardarDatos();
    }
    
    public static void agregarProducto(int id, String nombre, double precio) {
        productos.add(new Producto(id, nombre, precio));
        guardarDatosProductos();
    }

    // Actualizar
    public static void actualizarPersona(int id, String nuevoNombre, int nuevaEdad) {
        for (Persona p : personas) {
            if (p.getId() == id) {
                p.setNombre(nuevoNombre);
                p.setEdad(nuevaEdad);
                guardarDatos();
                return;
            }
        }
        System.out.println("Persona con ID " + id + " no encontrada.");
    }
    
    public static void actualizarProducto(int id, String nuevoNombre, double precio) {
        for (Producto p : productos) {
            if (p.getId() == id) {
                p.setNombre(nuevoNombre);
                p.setPrecio(precio);
                guardarDatosProductos();
                return;
            }
        }
        System.out.println("Producto con ID " + id + " no encontrado.");
    }

    // Eliminar
    public static void eliminarPersona(int id) {
        personas.removeIf(p -> p.getId() == id);
        guardarDatos();
    } 
    
    public static void eliminarProducto(int id) {
        productos.removeIf(p -> p.getId() == id);
        guardarDatosProductos();
    } 
}
