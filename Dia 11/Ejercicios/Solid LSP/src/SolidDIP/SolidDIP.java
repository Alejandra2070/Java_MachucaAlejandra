package SolidDIP;

public class SolidDIP {
    public static void main(String[] args) {
        MetodoPago metodoPago = new pagoNequi();
        ProcesadorPagos procesador = new ProcesadorPagos(metodoPago);
        procesador.procesarPago();
    }
}
