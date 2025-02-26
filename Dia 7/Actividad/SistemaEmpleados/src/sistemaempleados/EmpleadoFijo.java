package sistemaempleados;

public class EmpleadoFijo extends Empleados {

    public EmpleadoFijo(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public double calcularBonificacion() {
        double bonificacion = getSalario() * 0.20;
        System.out.println("Tu salario es de: " + getSalario());
        return bonificacion;
    }
    
    
}
