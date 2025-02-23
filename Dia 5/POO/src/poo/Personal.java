package poo;

public class Personal extends Personas{
    
    //Creacion de atributos
    static int contPer=0;
    int id_personal;
    String tipo_trabajo;
    int salario;
    static int contDer=0;
    int id_departamento;

    //Constructor compuesto
    public Personal(String nombre, String direccion, String tipo_trabajo, int salario) {
        super(nombre, direccion);
        contPer = contPer+1;
        this.id_personal = contPer;
        this.tipo_trabajo = tipo_trabajo;
        this.salario = salario;
        contDer = contDer+1;
        this.id_departamento = contDer;  
    }

    //Uso de metodos
    public String getTipo_trabajo() {
        return tipo_trabajo;
    }

    public void setTipo_trabajo(String tipo_trabajo) {
        this.tipo_trabajo = tipo_trabajo;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    //Metodo ToString
    @Override
    public String toString() {
        return "Personal{" + "id_personal=" + id_personal + ", tipo_trabajo=" + tipo_trabajo + ", salario=" + salario + ", id_departamento=" + id_departamento + '}';
    }
}
