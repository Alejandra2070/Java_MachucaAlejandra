package poo;

import java.time.LocalDate;
import java.time.Period;

public class Pacientes {
    
    //Creacion de atributos
    static int contPac = 1;
    int id_paciente;
    String fecha_nacimiento;
    LocalDate fecha_vinculacion;
    String diagnostico;
    int edad;
    static int contPab = 1;
    int id_pabellon;
    static int contHos = 1;
    int id_hospital;
    static int contPer = 1;
    int id_persona;

    //Constructor compuesto
    public Pacientes(String fecha_nacimiento, String diagnostico) {
        contPac = contPac +1;
        this.id_paciente = contPac;
        this.fecha_nacimiento = fecha_nacimiento;
        this.fecha_vinculacion = LocalDate.now();
        this.diagnostico = diagnostico;
        
        LocalDate fecha = LocalDate.parse(fecha_nacimiento);
        
        this.edad = calcular(fecha, fecha_vinculacion);
        contPab = contPab +1;
        this.id_pabellon = contPab;
        contHos = contHos +1;
        this.id_hospital = contHos;
        contPer = contPer +1;
        this.id_persona = contPer;
    }
    
    public int calcular(LocalDate fecha, LocalDate fecha_vinculacion){
        Period periodo = Period.between(fecha, fecha_vinculacion);
        return periodo.getYears();
    }

    //Metodo ToString
    @Override
    public String toString() {
        return "Pacientes{" + "id_paciente=" + id_paciente + ", fecha_nacimiento=" + fecha_nacimiento + ", fecha_vinvulacion=" + fecha_vinculacion + ", diagnostico=" + diagnostico + ", edad=" + edad + ", id_pabellon=" + id_pabellon + ", id_hospital=" + id_hospital + ", id_persona=" + id_persona + '}';
    }
}
