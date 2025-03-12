package ejercicios_hilos;

import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

public class EjecutarEj1 implements Runnable{ 
    @Override
    public void run(){
        try{
            int randomNum = ThreadLocalRandom.current().nextInt(2000, 5000 + 1);
            System.out.println("Holaaa soy un ejecutable" + LocalDateTime.now());
            Thread.sleep(randomNum);
            System.out.println("Adios soy un ejecutable" + LocalDateTime.now());
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
