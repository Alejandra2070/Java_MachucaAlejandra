package sistemaempleados;

import java.util.ArrayList;

public class SistemaEmpleados {

    public static void main(String[] args) {
        
        ArrayList<Empleados> listaEmpleados = new ArrayList<>();
        
        Empleados empleado1 = new Empleados("Alejandra", 5000000);
        Empleados empleado2 = new EmpleadoFijo("Alejita", 1000000);
        Empleados empleado3 = new EmpleadoHoras(5,"Aleja", 2000000);
        
        listaEmpleados.add(empleado1);
        listaEmpleados.add(empleado2);
        listaEmpleados.add(empleado3);
        
        empleado1.calcularBonificacion();
        empleado2.calcularBonificacion();
        empleado3.calcularBonificacion();
    }
    
}
