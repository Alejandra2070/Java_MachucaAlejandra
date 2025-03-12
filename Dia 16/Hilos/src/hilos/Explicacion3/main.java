package hilos.Explicacion3;

public class main {
    public static void main(String[] args) {
        PingPongSincronizado p1 = new PingPongSincronizado("H");
        PingPongSincronizado p2 = new PingPongSincronizado("O");
        PingPongSincronizado p3 = new PingPongSincronizado("L");
        PingPongSincronizado p4 = new PingPongSincronizado("A");
        
        p1.start();
        p2.start();
        p3.start();
        p4.start();
    }
    
}
