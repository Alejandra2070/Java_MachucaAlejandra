package dia.pkg6;

public class Dia6 {
    
    //ENCAPSULAMIENTO
        //Se refiere a la restricción del acceso directo a algunos
        //de los componentes de un objeto, especialmente los atributos, con el fin
        //de prevenir modificaciones no autorizadas.
    
    public static void main(String[] args) {
        
        Persona p1 = new Persona();
        p1.setNombre("Alejandra");
        p1.setEdad(0);
        System.out.println(p1.getEdad());
        
        CuentaBancaria c1 = new CuentaBancaria("JEFBOBFNGR", 10000000);
        System.out.println((int) c1.getSaldo()); //mostrar la cantidad de saldo en la cuenta bancaria
        
        c1.depositar(2500000);//se agregó mas saldo a la cuenta bancaria
        System.out.println((int)c1.getSaldo());//se muestra lo qu se agregó más lo que había en la cuenta
        
        c1.retirar(900000);//se retira la cantidad de dinero necesaria
        System.out.println((int)c1.getSaldo());//se muestra cuanto dinero quedó en la cuenta bancaria
        
    }
    
}
