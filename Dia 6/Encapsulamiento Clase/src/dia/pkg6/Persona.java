package dia.pkg6;

public class Persona {
    
    //Atributos
    private String nombre;
    private int edad;

    //Constructores
    public Persona() {}

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    //Getter y Setters
    //Son métodos que permiten obtener o modificar atributos privados de una clase.
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre+" Tibu";
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0){
            this.edad = edad;
        }
        else{
            System.out.println("La edad no es valida. Debe ser mayor a cero");
        }
        
    }
    
    
}
