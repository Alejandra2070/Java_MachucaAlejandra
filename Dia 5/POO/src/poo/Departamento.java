package poo;

public class Departamento {
    
    //Creacion de atributos
    static int contDer = 0;
    int id_departamento;
    String tipo;
    static int contP = 0;
    int id_personal;

    //Constructor compuesto
    public Departamento(String tipo) {
        contDer = contDer +1;
        this.id_departamento = contDer;
        this.tipo = tipo;
        contP = contP +1;
        this.id_personal = contP;
    }

    //Uso de metodos
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //Metodo ToString
    @Override
    public String toString() {
        return "Departamento{" + "id_departamento=" + id_departamento + ", tipo=" + tipo + ", id_personal=" + id_personal + '}';
    } 
}
