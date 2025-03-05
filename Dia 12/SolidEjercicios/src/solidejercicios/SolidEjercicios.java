package solidejercicios;

public class SolidEjercicios {

    public static void main(String[] args) {
        //Principios SOLID
        //Constituyen la base de la arquitectura y desarrollo de software
        
        //1. S-Single Responsability Principle (SRP) establece que una clase debe tener una única
        //responsabilidad, es decir, una sola razón para cambiar o sea debe estar enfocada en una sola tarea o funcionalidad.
        
        //2. O-Open/Closed Principle(OCP) establecen que las clases deben estar abiertas para su extensión,
        //pero cerradas para su modificación. Se deben poder agregar nuevas funcionalidades a na clase sin
        //modificar su código existente.
        
        //3. L-Liskov Sustitution Principle(LSP) los objetos de una clase derivada deben poder ser sustituidos
        //por objetos de su clase base sin afectar el correcto funcionamiento del programa. En conclusión, las subclases deben
        //ser capaces de manetener las propiedades y comportamientos de la clase padre.
        
        //4. I-Interface Segregation Principle(ISP) sugiere que se deben crear interfaces que sean específicas para un tipo
        //de cliente o una finalidad concreta. En lugar de tener una única interfaz que obligue a las clases a 
        //implementar muchos métodos que no utilizarán, es preferible contar con muchas interfaces que definan un número reducido
        //de métodos, cada una enfocada en una funcionalidad específica.
        
        //5. D-Dependency Inversion Principle depende de abstracciones, no de clases concretas. Según este principio
        //los módulos de alto nivel no deben depender de los módulos de bajo nivel; ambos deben depender de abstracciones.
    }
    
}
