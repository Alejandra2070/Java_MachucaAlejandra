package dia.pkg6;

public class CuentaBancaria {
    
    //Atributos
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public CuentaBancaria() {}

    public double getSaldo() {
        return saldo;
    }
    
    //Setter personalizado para "saldo"
    public void depositar(double cantidad){
        if (cantidad > 0){
            saldo = saldo + cantidad;
            System.out.println("El deposito fue realizado.!! :yay:");
        }
        else{
            System.out.println("La cantidad a depositar debe ser positiva. :sadfeis:");
        }
    }
    
    //Metodo para retirar platita con validacion
    
    public void retirar(double cantidad){
        if(cantidad > 0 && cantidad <= saldo){
            saldo = saldo - cantidad;
            System.out.println("Su retiro fue realizado!!! :happyfeis:");
        }
        else if(cantidad > saldo){
            System.out.println("No tienes los fondos suficientes :sadfeis:");
        }
        else{
            System.out.println("Debes ingresar una cantidad positiva.");
        }
    }
}
