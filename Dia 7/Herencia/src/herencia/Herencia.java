package herencia;

public class Herencia {

    public static void main(String[] args) {
        
        //Herencia
        
        //Es un mecanismo que permite crear nuevas clases
        //a partir de clases existentes. La clase que se
        //hereda se denomina superclase o clase base, donde 
        //la nueva clase se conoce como subclase o clase derivada.
        
        //Características
        
        //1. Reutilización de código: Las subclases heredan atributos y métodos de la superclase, 
        //evitando así la duplicación de código.
        
        //2. Jerarquía de clases: Permite organizar y estructurar el código en una 
        //jerarquía lógica.
        
        //3. Extensibilidad: Se pueden agregar o modificar funcionlidades en la 
        //subclase sin afectar la superclase.
        
        Perro perro1 = new Perro("Lucas");
        perro1.hacerSonido();
        perro1.moverCola();
        
        //Polimorfismo
        //El polimorfismo permite que un objeto se comporte de
        //diferentes maneras según el contexto. En Java, esto se traduce
        //en que una variable de un tipo de referencia (por ejemplo, la superclase)
        //pueda referenciar a objetos de cualquier subclase.
        
        Animal miAnimal = new Perro("Firulais");
        
        //Aunque la variable es de tipo animal, se invoca el método sobreescrito en Perro
        miAnimal.hacerSonido();
        
        //Para acceder a métodos específicos de Perro, es necesario realizar un casting
        if (miAnimal instanceof Perro){
            Perro miPerro = (Perro) miAnimal;
            miPerro.moverCola();
        }
    }
    
}
