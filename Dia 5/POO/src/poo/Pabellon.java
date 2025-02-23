package poo;

public class Pabellon {
    
    //Creacion de atributos 
    static int contPab=0;
    int id_pabellon;
    String tipo;
    int capacidad;
    static int contDep=0;
    int id_departamento;
    static int contPer=0;
    int id_personal;

    //Constructor compuesto
    public Pabellon(String tipo, int capacidad) {
        contPab=contPab+1;
        this.id_pabellon = contPab;
        this.tipo = tipo;
        this.capacidad = capacidad;
        contDep = contDep+1;
        this.id_departamento = contDep;
        contPer = contPer+1;
        this.id_personal = contPer;
    }
    
    //Uso de metodos
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    //Metodo ToString
    @Override
    public String toString() {
        return "Pabellon{" + "id_pabellon=" + id_pabellon + "tipo=" + tipo + ", capacidad=" + capacidad + ", id_departamento=" + id_departamento + ", id_personal=" + id_personal + '}';
    }
}
