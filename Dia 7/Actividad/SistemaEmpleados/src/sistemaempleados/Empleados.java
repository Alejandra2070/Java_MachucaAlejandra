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

    public double getSalario() {
        return salario;
    }
    
    public void calcularBonificacion(){
        double bonificacion = salario * 0.10;
        System.out.println("Tu salario es de " + salario + " y tu bonificación es de: " + bonificacion);
    }
    
}
