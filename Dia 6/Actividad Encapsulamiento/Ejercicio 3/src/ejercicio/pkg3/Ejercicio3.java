package ejercicio.pkg3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("************************************************");
        System.out.println("Ingresa el saldo de tu cuenta: ");
        System.out.println("************************************************");
        double saldo = scanner.nextInt();
        
        System.out.println("************************************************");
        System.out.println("Ingresa la tasa de interes: ");
        System.out.println("************************************************");
        double tasaInteres = scanner.nextInt();
        System.out.println("************************************************");
        
        cuentaAhorro ca = new cuentaAhorro(saldo, tasaInteres);
        
        System.out.println("Saldo: " + ca.obtenerSaldo());
        
        System.out.println("****************************************************");
        System.out.println("Ingresa la cantidad de dinero que deseas depositar: ");
        System.out.println("****************************************************");
        double monto = scanner.nextInt();
        System.out.println("************************************************");
        
        ca.depositar(monto);
        
        System.out.println("************************************************");
        System.out.println("El saldo despues del deposito es de: " + ca.obtenerSaldo());
        System.out.println("************************************************");
        System.out.println("Ingresa el monto a retirar: ");
        System.out.println("************************************************");
        
        double r = scanner.nextInt();
        
        ca.retirar(r);
        System.out.println("************************************************");
        System.out.println("El saldo despues del retiro es de: " + ca.obtenerSaldo());
        System.out.println("************************************************");
        
        ca.aplicarTasa();
        System.out.println("***************************************************************");
        System.out.println("El saldo despues de aplicar la tasa de interes es de: " + ca.obtenerSaldo());
        System.out.println("***************************************************************");
    }
}
