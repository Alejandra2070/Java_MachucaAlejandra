package jerarquiavehiculos;

public class Vehiculo {
    
    //Atributos
    private String marca;
    private String modelo;
    
    //Constructor para inicializar los atributos
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    public void mostrarDetalles(){
        System.out.println("Marca del vehículo: " + marca);
        System.out.println("Modelo del vehículo: " + modelo);
    }
}
