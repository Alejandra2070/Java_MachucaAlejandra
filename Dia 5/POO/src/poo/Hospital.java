package poo;

public class Hospital {
    
    //Creacion de atributos
    int id_hospital;
    int id_departamento;
    int id_personal;
    int id_paciente;
    int id_pabellon;

    //Constructor compuesto
    public Hospital(int id_hospital, int id_departamento, int id_personal, int id_paciente, int id_pabellon) {
        this.id_hospital = id_hospital;
        this.id_departamento = id_departamento;
        this.id_personal = id_personal;
        this.id_paciente = id_paciente;
        this.id_pabellon = id_pabellon;
    }

    //Metodo ToString
    @Override
    public String toString() {
        return "Hospital{" + "id_hospital=" + id_hospital + ", id_departamento=" + id_departamento + ", id_personal=" + id_personal + ", id_paciente=" + id_paciente + ", id_pabellon=" + id_pabellon + '}';
    }
}
