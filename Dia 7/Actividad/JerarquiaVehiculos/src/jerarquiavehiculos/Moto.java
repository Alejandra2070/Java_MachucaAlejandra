package jerarquiavehiculos;

public class Moto extends Vehiculo{
    private String tipoManubrio;

    public Moto(String tipoManubrio, String marca, String modelo) {
        super(marca, modelo);
        this.tipoManubrio = tipoManubrio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("********* Motos *********");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Tipo de manubrio: " + tipoManubrio);
    }
}
