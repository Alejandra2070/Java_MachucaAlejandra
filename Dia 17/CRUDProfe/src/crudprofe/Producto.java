/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudprofe;

/**
 *
 * @author Uniminuto Tibu
 */
public class Producto {
    private int id;
    private String nombre;
    private double precio;

    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public int getId() {
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public double getPrecio(){
        return precio;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }

    @Override
    public String toString() {
        return "PR, " + id + "," + nombre + "," + precio;
    }
    
    public static Producto fromString(String string){
        String[] listaNueva = string.split(",");
        return new Producto(Integer.parseInt(listaNueva[1]), listaNueva[2], Double.parseDouble(listaNueva[3])); //parseInt para convertir de texto a número
    }
}
