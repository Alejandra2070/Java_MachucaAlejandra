package jerarquiavehiculos;

public class JerarquiaVehiculos {

    public static void main(String[] args) {
        Carro carro1 = new Carro(4, "Toyota", "2025");
        carro1.mostrarDetalles();
        
        Moto moto1 = new Moto("Tracker", "Yamaha", "XT 500");
        moto1.mostrarDetalles();
    }
    
}
