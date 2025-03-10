package patronesdiseñocreacionales.Bridge;

//Bridge (Puente de la 9na)
//Separa una abstracción de su implementación para que ambas puedan evolucionar independientemente

//Ejemplo
//Diferentes formas geométricas que puede ser dibujados de distintas maneras(rojo o azul)

public class main {
    //Interfaz para la implementación
    interface Color{
        void applyColor();
    }
    
    //Implementacione concretas
    static class RedColor implements Color{
        public void applyColor(){
            System.out.println("Aplicando color rojo.");
        }
    }
    
    static class BlueColor implements Color{
        public void applyColor(){
            System.out.println("Aplicando color azul.");
        }
    }
    
    //Clase base que usa una implementación
    static abstract class Shape{
        protected Color color;
        
        public Shape(Color color){
            this.color = color;
        }
        
        abstract void draw();
    }
    
    //Subclase con una implementación diferente
    static class Circle extends Shape{
        public Circle(Color color){
            super(color);
        }
        
        public void draw(){
            System.out.println("Dibujando circulo");
            color.applyColor();
        }
    }
    
    //Uso del patrón Bridge
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedColor());
        Shape blueCircle = new Circle(new BlueColor());

        redCircle.draw();
        blueCircle.draw();
    }
}
