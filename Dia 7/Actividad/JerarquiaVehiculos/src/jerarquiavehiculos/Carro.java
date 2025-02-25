package jerarquiavehiculos;

public class Carro extends Vehiculo{
    private int numeroPuertas;

    public Carro(int numeroPuertas, String marca, String modelo) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Numero de puertas: " + numeroPuertas);
    }
}
