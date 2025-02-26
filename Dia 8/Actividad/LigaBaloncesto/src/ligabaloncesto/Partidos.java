package ligabaloncesto;

public class Partidos {
    private String equipoLocal;
    private String equipoVisitante;
    private int cestasEquipoLocal=0;
    private int cestasEquipoVisitante=0;
    private String finalizacion = "En juego";
    private String fechaPartido;

    public Partidos() {}

    public Partidos(String equipoLocal, String equipoVisitante, String fechaPartido) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.fechaPartido = fechaPartido;
    } 

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public int getCestasEquipoLocal() {
        return cestasEquipoLocal;
    }

    public void setCestasEquipoLocal(int cestasEquipoLocal) {
        this.cestasEquipoLocal = cestasEquipoLocal;
    }

    public int getCestasEquipoVisitante() {
        return cestasEquipoVisitante;
    }

    public void setCestasEquipoVisitante(int cestasEquipoVisitante) {
        this.cestasEquipoVisitante = cestasEquipoVisitante;
    }

    public String getFinalizacion() {
        return finalizacion;
    }

    public void setFinalizacion(String finalizacion) {
        this.finalizacion = finalizacion;
    }

    public String getFechaPartido() {
        return fechaPartido;
    }

    public void setFechaPartido(String fechaPartido) {
        this.fechaPartido = fechaPartido;
    }
    
    //Resultado
    public void resultado(){
        System.out.println("El resultado del equipo local " + equipoLocal + " es de: " + cestasEquipoLocal + " puntos.");
        System.out.println("El resultado del equipo visitante " + equipoVisitante + "es de: " + cestasEquipoVisitante + " puntos.");
    }

    //Ganador
    public String ganador(){
        if(cestasEquipoLocal < cestasEquipoVisitante){
            System.out.println("El equipo ganador es: ");
            return equipoVisitante;
        }
        else if(cestasEquipoLocal > cestasEquipoVisitante){
            return equipoLocal;
        }
        else{
            return "Hubo un empate";
        }
    }
}
