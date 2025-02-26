package ligabaloncesto;

public class PartidosPlayOffs extends Partidos{
    
    private int jornada;
    private String tipoRonda;

    public PartidosPlayOffs(int jornada, String tipoRonda) {
        this.jornada = jornada;
        this.tipoRonda = tipoRonda;
    }

    public PartidosPlayOffs(int jornada, String tipoRonda, String equipoLocal, String equipoVisitante, String fechaPartido) {
        super(equipoLocal, equipoVisitante, fechaPartido);
        this.jornada = jornada;
        this.tipoRonda = tipoRonda;
    }

    @Override
    public String toString() {
        return "PartidosPlayOffs{" + "jornada=" + jornada + ", tipoRonda=" + tipoRonda + '}';
    }

    @Override
    public String ganador() {
        return super.ganador();
    } 
    
}
