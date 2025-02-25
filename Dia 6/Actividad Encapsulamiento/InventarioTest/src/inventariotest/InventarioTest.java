/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventariotest;

public class InventarioTest {

    public static void main(String[] args) {
        Productos prod1 = new Productos("A123", "Lili Pink", 60, 50.000);
        Productos prod2 = new Productos("B123", "Channel", 60, 70.000);
        
        //Estado inicial del inventario
        System.out.println("Estos son nuestros productos y su inventario: ");
        System.out.println("*************************************");
        prod1.mostrarEstadoInv();
        prod2.mostrarEstadoInv();
        
        //Restando cantidad de stock
        prod1.actualizarStock(-10);
        
        //Sumando cantidad de stock
        prod2.actualizarStock(15);
        
        //Cantidad en stock insuficiente
        prod2.actualizarStock(-10);
        
        System.out.println("****************************************************");
        System.out.println("Se realizó una venta. Este es el stock actualizado: ");
        System.out.println("****************************************************");
        prod1.mostrarEstadoInv();
        prod2.mostrarEstadoInv();
    }
    
}
