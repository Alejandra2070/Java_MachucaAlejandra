package SolidDIP;

interface MetodoPago{
    void realizarPago();
}

class ProcesadorPagos{ //Clase de alto nivel
    private MetodoPago metodoPago;
    
    public ProcesadorPagos(MetodoPago metodoPago){
        this.metodoPago = metodoPago;
    }
    
    public void procesarPago(){
        metodoPago.realizarPago();
    }
}

class PagoTarjeta implements MetodoPago{ //clase de bajo nivel
    @Override
    public void realizarPago(){
        System.out.println("Pago realizado con tarjeta.");
    }
}

class pagoNequi implements MetodoPago{
    @Override
    public void realizarPago(){
        System.out.println("Pago realizado mediante Nequi.");
    }
}
