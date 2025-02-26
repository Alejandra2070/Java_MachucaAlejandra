package sistemaempleados;

public class SistemaEmpleados {

    public static void main(String[] args) {
        
        Empleados [] listaEmpleados = new Empleados [3];
        
        listaEmpleados [0] = new Empleados("Alejandra", 5000000);
        listaEmpleados [1] = new EmpleadoFijo("Alejita", 1000000);
        listaEmpleados [2] = new EmpleadoHoras(5,"Aleja", 2000000);
        
        for (Empleados i: listaEmpleados){
            System.out.println("Nombre: " + i.getNombre());
            System.out.println("Bonificacion: " + i.calcularBonificacion());
        }
    }
    
}
