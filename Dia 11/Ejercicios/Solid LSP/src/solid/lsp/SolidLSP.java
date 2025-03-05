package solid.lsp;

public class SolidLSP {
    
    public static void moverVehiculo(Vehiculo vehiculo){
        vehiculo.mover();
    }

    public static void main(String[] args) {
        Vehiculo coche = new Coche();
        Vehiculo bici = new Bici();
        
        moverVehiculo(coche);
        moverVehiculo(bici);
    }
    
}
