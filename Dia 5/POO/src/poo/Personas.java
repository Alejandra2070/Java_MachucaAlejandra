package poo;

public class Personas {
    
    //Creacion de atributos
    static int contId=0;
    int id_persona;
    String nombre;
    String direccion;
    static int contHost=0;
    int id_hospital;
    
    //Constructor compuesto
    public Personas(String nombre, String direccion) {
        contId = contId+1;
        this.id_persona = contId;
        this.nombre = nombre;
        this.direccion = direccion;
        contHost = contHost+1;
        this.id_persona = contHost;
    }
    
    //Uso de metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //Metodo ToString
    @Override
    public String toString() {
        return "Personas{" + "id_persona=" + id_persona + ", nombre=" + nombre + ", direccion=" + direccion + ", id_hospital=" + id_hospital + '}';
    }
}
