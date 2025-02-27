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
        System.out.println("El ganador fue: ");
        return ganador();
    }
}
