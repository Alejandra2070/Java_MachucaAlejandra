package encapsulamiento;

public class Empleado {
    //Atributos 
    private String nombre;
    private int id;
    private double salario;

    public Empleado() {}

    
    //Constructor que inicializa todos los atributos
    public Empleado(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }
    
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }
    
    //Setter con validacion
    public void setSalario(double salario) {
        if(salario > 0){
            this.salario = salario;
        }
        else if(salario <= 0){
            System.out.println("El salario debe ser positivo.");
        }
    }
    
    //Metodo para mostrar la informacion
    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Id: " + id);
        System.out.println("Salario: " + salario);
    }
}
