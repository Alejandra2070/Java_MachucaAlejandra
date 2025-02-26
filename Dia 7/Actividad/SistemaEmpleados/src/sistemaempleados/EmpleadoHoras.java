package sistemaempleados;

public class EmpleadoHoras extends Empleados{
    private int horasTrabajadas;

    public EmpleadoHoras(int horasTrabajadas, String nombre, double salario) {
        super(nombre, salario);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularBonificacion() {
        int totalHoras = horasTrabajadas * 15000;
        double bonificacion = getSalario() * 0.10 + totalHoras;
        return bonificacion;
    }
    
    
}
