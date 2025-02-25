package sistemaempleados;

public class EmpleadoFijo extends Empleados {

    public EmpleadoFijo(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public void calcularBonificacion() {
        double bonificacion = getSalario() * 0.20;
        System.out.println("Tu salario es de: " + getSalario() + " y tu bonificacion es de: " + bonificacion);
    }
    
    
}
