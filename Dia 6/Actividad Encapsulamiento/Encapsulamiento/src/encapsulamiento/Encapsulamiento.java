package encapsulamiento;

public class Encapsulamiento {

    public static void main(String[] args) {
        
        //Ejercicio 1
        Empleado e = new Empleado();
        
        e.setNombre("Aleja");
        e.setSalario(0);
        System.out.println(e.getSalario());//para obtener el salario y hacer la validacion
        e.mostrarInformacion(); //para mostrar la informacion
    }
    
}
