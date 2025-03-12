package ejercicios_hilos;

import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

public class Ejercicio1 extends Thread{

    @Override
    public void run() {
        try{
            int randomNum = ThreadLocalRandom.current().nextInt(2000, 5000);
            System.out.println("Holaaa soy un hilo" + LocalDateTime.now());
            Thread.sleep(randomNum);
            System.out.println("Adios soy un hilo" + LocalDateTime.now());
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
     
}
