/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_t2;

/**
 *
 * @author Uniminuto Tibu
 */
public class MiClase {
    //Atributos de la clase
    //Son variables que representan características o propiedades
    //de las clases, las cuales pueden tener datos almacenados en cada
    //objeto de la clase.
    
    String atributo1;
    int atributo2;
    float atributo3;
    
    //Constructores
    //Son métodos especiales para crear e inicializar objetos de la clase.
    
    //1. Constructor Vacío: Una manera de instanciar la clase sin ninguna acción.
    
    public MiClase(){}
    
    //2. Constructor Compuesto: una manera de instanciar la clase con uno o varios de sus
    //atributos puestos
    
    public MiClase(String atributo1, int atributo2, float atributo3){
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        this.atributo3 = atributo3;
    }
    
    //Métodos de la clase
    //Son funciones que definen el comportamiento de la clase.
    
    public void metodo1(){ 
        //Sin parámetros y sin retorno
    }
    
    public int metodo2(){
        return 1; //Sin parámetros y con retorno
    }
    
    public void metodo3(String a){
        System.out.println(a);//Con parámetros y sin retorno
    }
    
    public int metodo4(int a){
        return a;//Con parámetros y con retorno
    }
    
    //Método ToString
    //Es un método que sobreescribe el metodo por default 'toString', con el fin de
    //imprimir en consola una salida personalizada.

    @Override
    public String toString() {
        return "MiClase{" + "atributo1=" + atributo1 + ", atributo2=" + atributo2 + ", atributo3=" + atributo3 + '}';
    }

    
}
