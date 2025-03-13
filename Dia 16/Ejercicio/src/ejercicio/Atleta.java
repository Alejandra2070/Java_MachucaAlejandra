package ejercicio;

import java.util.Random;

public class Atleta extends Thread{
    private String atleta;

    public Atleta(String atleta) {
        this.atleta = atleta;
    }
    
    public void run(){
        synchronized (getClass()){
            try{
                Random random = new Random();
                System.out.println("El " + atleta + " inició la carrera.");
                int testigo = random.nextInt(9000)+2000;
                Thread.sleep(testigo);
                System.out.println("El " + atleta + " finalizó la ronda con un tiempo de "+(testigo / 1000)+" segundos.");
                
                getClass().notifyAll();
                try{
                    getClass().wait();
                }
                catch(InterruptedException e){
                    getClass().notifyAll();
                }
            }
            catch(InterruptedException e){
                getClass().notifyAll();
            }
            getClass().notifyAll();
        }
    }
    
    
}
