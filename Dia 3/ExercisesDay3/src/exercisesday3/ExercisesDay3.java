package exercisesday3;

import java.util.Scanner;

public class ExercisesDay3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int ejercicio = scanner.nextInt();
        
        switch(ejercicio){
            
            case 1: //Escribe un programa para imprimir todos los números naturales del 1 al n.  
                
                System.out.println("Hasta que numero quieres contar?: ");
                int num = scanner.nextInt();
                scanner.nextLine();
                
                for(int i = 1; i <= num; i++){
                    System.out.println(i);
                }
                break;
                
            case 2: //Escribe un programa para imprimir todos los números naturales en orden inverso
                
                System.out.println("Hasta que numero quieres contar?: ");
                int num2 = scanner.nextInt();
                
                for(int x = num2; x >= 1; x--){
                    System.out.println(x);
                }
                break;
                
            case 3: //Escribe un programa para imprimir tablas de multiplicar.
                
                for (int i = 1; i <= 10; i ++){
                    System.out.println("Tabla de multiplicar del: " + i);
                    for (int x = 1; x <= 10; x ++){
                        System.out.println(i + " X " + x + " = " + (i * x));
                    }
                    System.out.println();
                }
                break;
                
            case 4: //Escribe un programa para imprimir tablas de multiplicar en orden inverso. 
                for (int i = 10; i >= 1; i --){
                    System.out.println("Tabla de multiplicar del: " + i);
                    for (int x = 1; x <= 10; x ++){
                        System.out.println(i + " X " + x + " = " + (i * x));
                    }
                    System.out.println();
                }
                break;
                
            case 5: //Escribe un programa para imprimir todas las letras del alfabeto de la 'a' a la 'z'.  
                
                for(char letra = 'a'; letra <= 'z'; letra++){
                    System.out.println(letra);}
                break;
                
            case 6: //Escribe un programa para imprimir el alfabeto en orden inverso, de la 'Z' a la 'A'. 
                
                for(char letra = 'Z'; letra >= 'A'; letra--){
                    System.out.println(letra);
                }
                break;
                
            case 7: //Escribe un programa para imprimir todos los números pares entre 1 y 100.
                
                int num3;
                for(num3 = 1; num3 <= 100; num3++){
                    if(num3 % 2 == 0){
                        System.out.println(num3);
                    }
                }
                break;
                
            case 8: //Escribe un programa para imprimir todos los números impares entre 1 y 100.   
                int num4;
                for(num4 = 1; num4 <= 100; num4++){
                    if(num4 % 2!= 0){
                        System.out.println(num4);
                    }
                }
                break;
                
            case 9: //Escribe un programa para encontrar la suma de todos los números naturales entre 1 y n.  
                System.out.println("Hasta donde quieres contar?: ");
                int num5 = scanner.nextInt();
                int resultado = 0;
                
                for(int i = 1; i <= num5; i++){
                    System.out.println(i);
                    resultado += i;
                }
                
                System.out.println("La suma de todos los numeros es de: " + resultado);
                break;
                
            case 10: // Escribe un programa para encontrar la suma de todos los números pares entre 1 y n. 
                
                System.out.println("Hasta donde quieres contar?: ");
                int num6 = scanner.nextInt();
                int resultado2 = 0;
                
                for(int i = 1; i <= num6; i++){
                    System.out.println(i);
                    if(i%2==0){
                        resultado2 += i;
                    }
                }
                System.out.println("La suma de solo los numeros pares es de: " + resultado2);
                break;
                
            case 11: //Escribe un programa para encontrar la suma de todos los números impares entre 1 y n. 
                
                System.out.println("Hasta donde quieres contar?: ");
                int num7 = scanner.nextInt();
                int resultado3 = 0;
                
                for(int i = 1; i <= num7; i++){
                    System.out.println(i);
                    if(i%2!=0){
                        resultado3 += i;
                    }
                }
                System.out.println("La suma de solo los numeros impares es de: " + resultado3);
                break;
                
            case 12: //Escribe un programa para imprimir los valores ASCII.  
                
                for(int i = 1; i < 255; i++){
                    System.out.println("Valor ASCII: " + i + " Caracter => " + (char)i);
                }
                break;
                
            case 13: //Escribe un programa para encontrar el factorial de cualquier número. 
                
                System.out.println("Ingresa un numero para obtener su factorial: ");
                int num8 = scanner.nextInt();
                
                long factorial = 1;
                
                for(int i = 1; i <= num8; i++){
                    factorial *= i;
                }
                System.out.println("El factorial de " + num8 + " es: " + factorial);
                break;
                
            case 14: //Escribe un programa para calcular el valor de un número elevado a la potencia de otro.  
                
                System.out.println("Ingresa el numero base: ");
                int base = scanner.nextInt();
                
                System.out.println("Ingresa el numero exponente: ");
                int expt = scanner.nextInt();
                
                long result = 1;
                
                for(int i = 1; i <= expt; i++){
                    result *= base;
                }
                System.out.println("El numero base " + base + " elevado a la potencia de " + expt + " es: " + result);
                break;
                
            case 15: //Escribe un programa para invertir los dígitos de un número dado. 
                
                System.out.println("Ingresa un numero de dos o mas cifras: ");
                int num9 = scanner.nextInt();
                int num10 = 0;
                
                while(num9!=0){
                    num10 = num10 *10 + num9 % 10;
                    num9 /= 10;
                }
                System.out.println(num10);
                break;
                
            case 16: //Escribe un programa para calcular la suma de los dígitos de un número.  
                
                System.out.println("Ingresa un numero de dos o mas cifras: ");
                int nums = scanner.nextInt();
                
                int sumita = 0;
                
                while(nums != 0){
                    int digito = nums % 10;
                    sumita += digito;
                    nums /= 10;
                }
                System.out.println("La suma de los digitos es de: " + sumita);
                break;
                
            case 17: //Escribe un programa para verificar si un número dado es primo o no.   
                
                System.out.println("Ingresa un numero para saber si es primo o no: ");
                int primo = scanner.nextInt();
                boolean primito = true;
                if (primo < 2){
                    primito = false;
                }
                for(int i = 2; i < primo; i++){
                    if(primo % i == 0){
                        primito = false;
                        break;
                    }
                }
                if(primito){
                    System.out.println(primo + " es un numero primo");
                }
                else{
                    System.out.println(primo + " no es un numero primo");
                }
                break;
                
            case 18: //Escribe un programa para calcular el MCD (Máximo Común Divisor) de dos números dados. 
                
                
                
            case 19: // Escribe un programa que permita ingresar números hasta que el usuario lo desee y, al final, 
                     //muestre la cantidad de números positivos, negativos y ceros ingresados.  
                
                int contPost = 0;
                int contNeg = 0;
                int contCeros = 0;
                
                while(true){
                    System.out.println("Ingresa un numero: ");
                    int nums1 = scanner.nextInt();
                    scanner.nextLine();
                    
                    if(nums1 < 0){
                        contNeg++;
                        break;
                    }
                    if(nums1 > 0){
                        contPost++;
                    }
                    else{
                        contCeros++;
                    }
                }
                System.out.println("Numeros positivos: " + contPost);
                System.out.println("Numeros negativos: " + contNeg);
                System.out.println("Numeros ceros: " + contCeros);
                break;
                
            case 20: //Escribe un programa que permita ingresar números hasta que el usuario lo desee y, al final, 
                     //muestre el número más grande y el más pequeño ingresado. 
                
                boolean numerito = true;
                int numMenor = Integer.MIN_VALUE;
                int numMayor = Integer.MAX_VALUE;
                
                while(true){
                    System.out.println("Ingresa un numero(Si quieres terminar ingresa 0): ");
                    int nums2 = scanner.nextInt();
                    
                    if(nums2 == 0){
                        break;
                    }
                    if(numerito){
                        numMayor = nums2;
                        numMenor = nums2;
                        numerito = false;
                    }
                    if(nums2 > numMayor){
                        numMayor = nums2;
                    }
                    if(nums2 < numMenor){
                        numMenor = nums2;
                    }
                }
                
                System.out.println("El numero mayor es: " + numMayor);
                System.out.println("El numero menor es: " + numMenor);
                break;
                
            case 21: //Escribe un programa para encontrar los números y la suma de todos los 
                     //enteros entre 100 y 200 que sean divisibles por 9. 
                
                int suma2 = 0;
                
                System.out.println("Estos son los numeros divisibles por 9: ");
                
                for(int i = 100; i <= 200; i++){
                    if(i % 9 == 0){
                        System.out.println(i);
                        suma2 += i;
                    }
                }
                System.out.println("La suma de todos los numeros divisibles por 9 es de: " + suma2);
                
            case 22: //Escribe un programa para convertir un número binario a decimal sin usar arreglos,
                     //funciones ni bucles while.  
                
                System.out.println("Ingresa un numero que sea binario: ");
                scanner.nextLine();
                String bin = scanner.nextLine();
                
                int decimal = 0;
                int potencia = 0;
                
                for(int i = bin.length() - 1; i >= 0; i--){
                    char digito = bin.charAt(i);
                    
                    if(digito == '1'){
                        decimal += Math.pow(2, potencia);
                    }
                    
                    potencia++;
                }
                
                System.out.println("El numero en decimal es: " + decimal);
                
            case 23: // Escribe un programa para verificar si un número es un Número Fuerte o no. 
                
            case 24: //Escribe un programa para convertir un número hexadecimal a decimal.   
                
                System.out.println("Ingrese un número hexadecimal: ");
                String hexadecimal = scanner.nextLine().toUpperCase();
                long decimal1 = 0;
                int potencia1 = 0;

                for (int x = hexadecimal.length() - 1; x >= 0; x--) {
                    char digito1 = hexadecimal.charAt(x);
                    int valor;

                    if (digito1 >= '0' && digito1 <= '9') {
                        valor = digito1 - '0';
                    } else {
                        valor = digito1 - 'A' + 10;
                    }

                    decimal1 += (long) Math.pow(16, potencia1) * valor;
                    potencia1++;
                }
                System.out.println("El numero decimal es: " + decimal1);

        }
    }
    
}
