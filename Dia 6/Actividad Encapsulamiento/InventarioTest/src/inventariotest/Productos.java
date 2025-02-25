package inventariotest;

public class Productos {
     //Atributos privados
    private String codigo;
    private String nombre;
    private int cantidad;
    private double precio;
    
    //Constructor que inicializa los atributos
    public Productos(String codigo, String nombre, int cantidad, double precio) {
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
        if(cantidad < 0){
            System.out.println("La cantidad debe ser positiva.");
        }
        else{
            this.cantidad = cantidad;
        }
    }

    public double getPrecio() {
        return precio;
    }

    //Validacion de que el precio sea mayor a cero
    public void setPrecio(double precio) {
        if (precio <= 0){
            System.out.println("El precio debe ser mayor a cero."); 
        }
        else{
            this.precio = precio;
        }
    }
    
    //Metodo para actualizar el stock
    public void actualizarStock(int cantidad){
        if (this.cantidad + cantidad < 0){
            System.out.println("No hay stock suficiente.");
            
        }
        else{
            this.cantidad += cantidad;
        }
    }
    
    public void mostrarEstadoInv() {
        System.out.println("Producto: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Cantidad en stock: " + cantidad);
        System.out.println("Precio: $" + precio);
        System.out.println("*************************************");
    }
}
