package ejercicio5;

//No cumple los principios:
//Principio Open/Closed
//Principio de sustitución de Liskov
//Principio de segregación de interfaces

public class Ejercicio5 { 

    public interface IOad { //escritura
    void Insert(Object entity);
    void Update(Object id, Object entity);
    void Delete(Object id);
    }
    
    public interface getT{ //lectura
        Object[] GetAll();
        Object GetById(Object id);
    }

    public abstract class FacturaOadDatosReadOnly implements getT {
        
        public Object[] GetAll() {
            return null; //no hay información
            // Obtener todas las facturas
        }
        public Object GetById(Object id) {
            return null;
            // Obtener factura por ID
        }
    }
}