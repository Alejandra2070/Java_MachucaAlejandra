package SolidISP;

public class SolidISP{
    public static void main(String[] args) {
        VehiculoVolador avion = new Avion();
        VehiculoNavegante barco = new Barco();
        
        avion.volar();
        barco.navegar();
    }
}
