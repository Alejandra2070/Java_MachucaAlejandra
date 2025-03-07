package patronesdiseño.Factory;

//Este atrón define una interfaz para crear obejtos pero permite a las subclases decidir qué
//clase concreta instanciar. Se usa para evitar la creación directa de objetos con new

// Interfaz Producto
interface Producto{
    void usar();
}

// Implementaciones concretas
class ProductoA implements Producto{
    public void usar(){
        System.out.println("Usando producto A");
    }
}

class ProductoB implements Producto{
    public void usar(){
        System.out.println("Usando proucto B");
    }
}

public class Factory{
    //Fábrica con el método Factory
    class Factory2 {
        public static Producto crearProducto(String tipo){
            if (tipo.equalsIgnoreCase("A")){
                return new ProductoA();
            }
            else if (tipo.equalsIgnoreCase("B")){
                return new ProductoB();
            }
            throw new IllegalArgumentException("Tipo desconocido");
        }
    }
    //Uso
    public static void main(String [] args){
        Producto p1 = Factory2.crearProducto("A");
        p1.usar();
        
        Producto p2 = Factory2.crearProducto("B");
        p2.usar();
    }
}

