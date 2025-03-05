package solid.lsp;

class Vehiculo {
    public void mover(){
        System.out.println("El vehiculo se está moviendo.");
    }
}

class Coche extends Vehiculo{
    
    @Override
    public void mover() {
        System.out.println("El coche está conduciendo por la carretera.");
    } 
}

class Bici extends Vehiculo{

    @Override
    public void mover() {
        System.out.println("La bici está siendo pedaleada.");
    } 
}
