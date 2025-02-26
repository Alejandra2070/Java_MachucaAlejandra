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

    public int getJornada() {
        return jornada;
    }

    public void setJornada(int jornada) {
        this.jornada = jornada;
    }

    public String getTipoRonda() {
        return tipoRonda;
    }

    public void setTipoRonda(String tipoRonda) {
        this.tipoRonda = tipoRonda;
    }
    
    //public void mostrar()

    @Override
    public String toString() {
        return "PartidosLiga{" + "jornada=" + jornada + ", tipoRonda=" + tipoRonda + '}';
    }

    @Override
    public String ganador() {
        return super.ganador();
    } 
}
