package ejercicios_hilos;

import java.time.LocalDateTime;

public class Ejercicios_hilos {

    public static void main(String[] args) {
        System.out.println("Hola soy el hilo principal." + LocalDateTime.now());
        Ejercicio1 ej1 = new Ejercicio1(); //crea una clase nueva de tipo hilo
        ej1.start(); //la llama al método start
         
        EjecutarEj1 eje1 = new EjecutarEj1(); //creé un ejecutable de ejemplo
        Thread thread = new Thread(eje1); //inicializa otro Thread
        thread.start(); //inicializa el ejecutable en segundo plano
        System.out.println("Adiós soy el hilo principal." + LocalDateTime.now());
    }
}