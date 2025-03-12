package hilos.Explicacion2;

public class main {

    public static void main(String[] args) {
        Counter contador1 = new Counter();
        Counter contador2 = new Counter();

        contador1.start();
        contador2.start();

        System.out.println("Valor del contador final 1: " + contador1.value());
        System.out.println("Valor del contador final 2: " + contador2.value());
    }
}