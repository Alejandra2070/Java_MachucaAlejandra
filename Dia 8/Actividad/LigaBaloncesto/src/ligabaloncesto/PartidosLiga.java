package ligabaloncesto;

public class PartidosLiga extends Partidos{
    private int jornada;
    private String tipoRonda;

    public PartidosLiga(int jornada, String tipoRonda) {
        this.jornada = jornada;
        this.tipoRonda = tipoRonda;
    }

    public PartidosLiga(int jornada, String tipoRonda, String equipoLocal, String equipoVisitante, String fechaPartido) {
        super(equipoLocal, equipoVisitante, fechaPartido);
        this.jornada = jornada;
        this.tipoRonda = tipoRonda;
    }

    @Override
    public String toString() {
        return "PartidosLiga{" + "jornada=" + jornada + ", tipoRonda=" + tipoRonda + '}';
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
