package sistemaempleados;

public class Empleados {
    
    //Atributos
    private String nombre;
    private double salario;
    
    //Constructor para inicializar los atributos
    public Empleados(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }
    
    public double calcularBonificacion(){
        double bonificacion = salario * 0.10;
        System.out.println("Tu salario es de " + salario);
        return bonificacion;
    }
    
}
