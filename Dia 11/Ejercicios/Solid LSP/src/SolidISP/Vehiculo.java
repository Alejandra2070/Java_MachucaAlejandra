package SolidISP;

interface VehiculoVolador{
    void volar();
}

interface VehiculoNavegante{
    void navegar();
}

class Avion implements VehiculoVolador{
    @Override
    public void volar(){
        System.out.println("El avión está volando por el aire.");
    }
}

class Barco implements VehiculoNavegante{
    @Override
    public void navegar(){
        System.out.println("El barco está navegando por el mar.");
    }
}
