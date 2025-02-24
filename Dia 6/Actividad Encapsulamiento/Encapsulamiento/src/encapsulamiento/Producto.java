package encapsulamiento;

public class Producto { 
    
    //Atributos privados
    private String codigo;
    private String nombre;
    private int cantidad;
    private double precio;
    
    //Constructor que inicializa los atributos
    public Producto(String codigo, String nombre, int cantidad, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    //Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    //Validacion de que la cantidad sea positiva
    public void setCantidad(int cantidad) {
        if(cantidad > 0){
            this.cantidad = cantidad;
        }
        else if(cantidad < 0){
            System.out.println("La cantidad debe ser positiva.");
        }
    }

    public double getPrecio() {
        return precio;
    }

    //Validacion de que el precio sea mayor a cero
    public void setPrecio(double precio) {
        if (precio > 0){
            this.precio = precio;
        }
        else if(precio < 0){
            System.out.println("El precio debe ser mayor a cero.");
        }
        
    }
    
    //Metodo
    public void actualizarStock(int cantidad){
        
    }
    
}
