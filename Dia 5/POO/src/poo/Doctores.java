package poo;

public class Doctores {
    
    //Creacion de atributos
    static int contD=0;
    int id_doctor;
    String cargo;
    String nombre_equipo;
    String nombre_lider;

    //Constructor compuesto
    public Doctores(int id_doctor, String cargo, String nombre_equipo, String nombre_lider) {
        contD = contD+1;
        this.id_doctor = contD;
        this.cargo = cargo;
        this.nombre_equipo = nombre_equipo;
        this.nombre_lider = nombre_lider;
    }

    //Metodo ToString
    @Override
    public String toString() {
        return "Doctores{" + "id_doctor=" + id_doctor + ", cargo=" + cargo + ", nombre_equipo=" + nombre_equipo + ", nombre_lider=" + nombre_lider + '}';
    }
}
