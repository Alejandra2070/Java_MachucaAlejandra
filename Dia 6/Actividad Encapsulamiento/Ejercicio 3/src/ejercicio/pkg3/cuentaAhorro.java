package ejercicio.pkg3;

public class cuentaAhorro extends cuentaBancaria {
    
    //Atributos
    private double tasaInteres;

    public cuentaAhorro(double saldo, double tasaInteres) {
        super(saldo);
        this.tasaInteres = tasaInteres;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }
    
    public void aplicarTasa(){
        double newSaldo = getSaldo() + getSaldo() * tasaInteres / 100;
        setSaldo(newSaldo);
        System.out.println("El nuevo saldo es de: " + getSaldo());
    }
    
    public double ObtenerTasa(){
        return tasaInteres;
    }
    
    
    
    
}
