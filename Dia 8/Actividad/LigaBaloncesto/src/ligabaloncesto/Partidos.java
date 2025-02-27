package ligabaloncesto;

public class Partidos {
    private String equipoLocal;
    private String equipoVisitante;
    private int cestasEquipoLocal;
    private int cestasEquipoVisitante;
    private String finalizacion;
    private String fechaPartido;

    public Partidos() {}

    public Partidos(String equipoLocal, String equipoVisitante, String fechaPartido) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.cestasEquipoLocal = 0;
        this.cestasEquipoVisitante = 0;
        this.fechaPartido = fechaPartido;
        this.finalizacion = "En juego";
    }
    
    //Puntos local
    public void puntoL(int puntosL){
        if(finalizacion.equals("En juego")){
            cestasEquipoLocal+=puntosL;
        }
    }
    
    //Puntos visitante
    public void puntoV(int puntosV){
        if(finalizacion.equals("En juego")){
            cestasEquipoVisitante+=puntosV;
        }
    }
    
    //Ganador
    public String ganador(){
        if(cestasEquipoLocal < cestasEquipoVisitante){
            System.out.println("El equipo ganador es: " +equipoVisitante);
        }
        else if(cestasEquipoLocal > cestasEquipoVisitante){
            System.out.println("El equipo ganador es: " +equipoLocal);
        }
        else{
            return "Hubo un empate";
        }
        return "Felicidades al ganador!!";
    }
    
    //Si es empate
    public void finPartido(){
        if(cestasEquipoLocal==cestasEquipoVisitante){
            System.out.println("El partido no puede finalizar porque es un empate.");
        }
        else{
            finalizacion="Finalizo el partido";
        }
    }
    
    //Mostrar informacion
    public String mostrarInfo(){
        System.out.println("Informacion de los partidos: ");
        System.out.println("El equipo local " +equipoLocal + " obtuvo "+cestasEquipoLocal +" puntos VS el equipo visitante " +equipoVisitante +" obtuvo "+cestasEquipoVisitante+" puntos.");
        return "El equipo ganador es: " + ganador();
    }
}
