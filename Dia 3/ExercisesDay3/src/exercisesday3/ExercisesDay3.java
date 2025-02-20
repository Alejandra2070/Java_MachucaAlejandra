package exercisesday3;

import java.util.Scanner;

public class ExercisesDay3 {

    public static int facto(int n6){
        int result = 1;
        for(int i = 1; i <= n6; i++){
            result *= i;
        }
        return result;
    }
        
    public static boolean perfecto(int n7){
        int st = 0;
        for (int i = 1; i < n7 / 2; i ++){
            if (n7 % i == 0){
                st += i;
            }
        }
        return st == n7;
    }
        
    public static void imprimir(int n10){
        while (n10 % 2 == 0){
            System.out.println(2 + " ");
            n10 /= 2;
        }
        for (int i = 3; i * i <= n10; i += 2){
            while (n10 % i == 0){
                System.out.println(i + " ");
                n10 /= i;
            }
        }
        if (n10 > 2){
            System.out.println(n10);
        }
    }
        
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
                
                System.out.println("Ingresa un numero: ");
                int a = scanner.nextInt();
                
                System.out.println("Ingresa el segundo numero: ");
                int b = scanner.nextInt();
                
                while(b!=0){
                    int temp = b;
                    b = a % b;
                    a = temp;
                    System.out.println(a);
                }
                
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
                break;
                
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
                
                System.out.println("Ingresa un numero: ");
                int nums3 = scanner.nextInt();
                int comp = 0, original = nums3;
                
                while(nums3 > 0){
                    int digit = nums3 % 10;
                    int fact = 1;
                    
                    for(int i = 1; i <= digit; i++){
                        fact *= i;
                    }
                    
                    comp += fact;
                    nums3 /= 10;
                }
                
                System.out.println(comp == original ? original + " es un numero fuerte" : original + " no es un numero fuerte.");
                break;
                
            case 24: //Escribe un programa para convertir un número hexadecimal a decimal.   
                
                System.out.println("Ingrese un número hexadecimal: ");
                scanner.nextLine();
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
                break;
                
            case 25: //Escribe un programa para convertir un número hexadecimal a octal.
                
                System.out.println("Ingresa un numero que sea hexadecimal: ");
                scanner.nextLine();
                String uno = scanner.nextLine();
                
                int var = Integer.parseInt(uno, 16);
                String dos = Integer.toOctalString(var);
                
                System.out.println("El numero octal es: " + dos);
                break;
                
            case 26: //Escribe un programa para convertir un número hexadecimal a binario.
                
                System.out.println("Ingresa un numero que sea hexadecimal: ");
                scanner.nextLine();
                String tres = scanner.nextLine();
                
                int var2 = Integer.parseInt(tres, 16);
                String four = Integer.toBinaryString(var2);
                
                System.out.println("El numero binario es: " + four);
                break;
                
            case 27: //Escribe un programa para convertir un número decimal a hexadecimal.
                
                System.out.println("Ingresa un numero que sea decimal: ");
                int dec = scanner.nextInt();
                String dec2 = Integer.toHexString(dec).toUpperCase();
                
                System.out.println("El numero hexadecimal es: " + dec2);
                break;
                
            case 28: //Escribe un programa para convertir un número decimal a octal.
                
                System.out.println("Por favor introduce un numero decimal: ");
                int dec3 = scanner.nextInt();
                String dec4 = Integer.toOctalString(dec3);
                
                System.out.println("El numero octal es: " + dec4);
                break;
                
            case 29: //Escribe un programa para convertir un número decimal a binario.
                
                System.out.println("Ingresa un numero decimal: ");
                int dec5 = scanner.nextInt();
                StringBuilder dec6 = new StringBuilder();
                
                if(dec5==0){
                    dec6.append("0");
                }
                else{
                    while(dec5>0){
                        dec6.insert(0, dec5 % 2);
                        dec5 = dec5 / 2;
                    }
                }
                System.out.println("El numero binario es: " + dec6.toString());
                break;
            
            case 30: //Escribe un programa para convertir un número binario a octal.
                
                System.out.println("Ingresa un numero binario: ");
                scanner.nextLine();
                String bina = scanner.nextLine();
                int bina2 = Integer.parseInt(bina, 2);
                
                String bina3 = Integer.toOctalString(bina2);
                System.out.println("El numero octal es: " + bina3);
                break;   
            
            case 31: //Escribe un programa para convertir un número binario a decimal.
                
                System.out.println("Ingresa un numero binario: ");
                scanner.nextLine();
                String bing = scanner.nextLine();
                int dec8 = 0;
                int base7 = 1;
                for(int i = bing.length() - 1; i >= 0; i --){
                    if(bing.charAt(i) == '1'){
                        dec8 += base7;
                    }
                    base7 *= 2;
                }
                System.out.println("El numero decimal es: " + dec8);
                break;
                
            case 32: //Escribe un programa para convertir un número binario a hexadecimal.
                
                System.out.println("Ingresa un numero binario: ");
                scanner.nextLine();
                String bing1 = scanner.nextLine();
                int bing2 = Integer.parseInt(bing1, 2);
                String bing3 = Integer.toHexString(bing2).toUpperCase();
                
                System.out.println("El numero hexadecimal es: " + bing3);
                break;
                
            case 33: //Escribe un programa para convertir un número octal a binario.
                
                System.out.println("Ingresa un numero octal: ");
                scanner.nextLine();
                String octal = scanner.nextLine();
                StringBuilder str = new StringBuilder();
                for(int i = 0; i < octal.length(); i ++){
                    char d = octal.charAt(i);
                    switch(d){
                        case '0': str.append("000");break;
                        case '1': str.append("001");break;
                        case '2': str.append("010");break;
                        case '3': str.append("011");break;
                        case '4': str.append("100");break;
                        case '5': str.append("101");break;
                        case '6': str.append("110");break;
                        case '7': str.append("111");break;
                    }
                }
                System.out.println("El numero binario es: " + str.toString());
                break;
                
            case 34: //Escribe un programa para convertir un número octal a decimal.
                
                System.out.println("Ingresa un numero octal: ");
                scanner.nextLine();
                String octal2 = scanner.nextLine();
                int deci = 0;
                int longi = octal2.length();
                
                for(int i = 0; i < longi; i ++){
                    char dig = octal2.charAt(i);
                    int n = Character.getNumericValue(dig);
                    deci += n * Math.pow(8, longi - 1 - i);
                }
                System.out.println("El numero decimal es: " + deci);
                break;
                
            case 35: //Escribe un programa para convertir un número octal a hexadecimal.
                
                System.out.println("Ingresa un numero octal: ");
                scanner.nextLine();
                String oct = scanner.nextLine();
                int oct3 = Integer.parseInt(oct, 8);
                String oct1 = Integer.toHexString(oct3).toUpperCase();
                
                System.out.println("El numero hexadecimal es: " + oct1);
                break;
                
            case 36: //Escribe un programa para encontrar el complemento a 1 de un número en Java.
                
                System.out.println("Ingresa un numero: ");
                int n1 = scanner.nextInt();
                int cm = ~n1;
                System.out.println("El complemento a 1 de " + n1 + " es: " +cm);
                break;
                
            case 37: //Escribe un programa para encontrar el complemento a 2 de un número binario en Java.
                
                System.out.println("Ingresa un numero binario: ");
                scanner.nextLine();
                String n2 = scanner.nextLine();
                int n3 = Integer.parseInt(n2, 2);
                int cm2 = ~n3 +1;
                System.out.println("El complemento a 2 de " + n2 + "(" + n3 + ") es: " + cm2);
                break;
                
            case 38: //Escribe un programa para imprimir la serie de Fibonacci hasta n términos.
                
                System.out.println("Ingresa la cantidad de terminos de la serie Fibonacci: ");
                int n4 = scanner.nextInt();
                int e = 0, f = 1;
                System.out.println("Esta es la serie de Fibonacci hasta " + n4);
                for(int i = 1; i <= n4; i ++){
                    System.out.println(e + "");
                    int sig = e + f;
                    e = f;
                    f = sig;
                }
                break;
                
            case 39: //Escribe un programa para verificar si un número es un Número Fuerte o no.
                
                System.out.println("Ingresa un numero: ");
                int numsi3 = scanner.nextInt();
                
                int compit = 0, original1 = numsi3;
                
                while(numsi3>0){
                    int digit = numsi3 % 10;
                    int fact = 1;
                    
                    for(int i = 1; i <= digit; i++){
                        fact *= i;
                    }
                    
                    compit += fact;
                    numsi3 /= 10;
                }
                
                System.out.println(compit == original1 ? original1 + " es un numero fuerte" :original1+ " no es un numero fuerte.");
                break;
                
            case 40: //Escribe un programa para imprimir todos los Números Fuertes del 1 al 100000.
                
                for(int n5 = 1; n5 <= 100000; n5 ++){
                    int s = 0, tem4 = n5;
                    while(tem4 > 0){
                        s += facto(tem4 % 10);
                        tem4 /= 10;
                    }
                    if(s == n5){
                        System.out.println(n5 + " es un numero fuerte");
                    }
                }
                break;
                
                
            case 41: //Escribe un programa para imprimir todos los Números Perfectos del 1 al 10000.
                
                for(int n7 = 1; n7 <= 10000; n7++){
                    int sumaDiv = 0;
                    for(int i = 1; i <= n7 / 2; i++){
                        if(n7 % i == 0){
                            sumaDiv += i;
                        }
                    }
                    if(sumaDiv == n7){
                        System.out.println(n7 + " es un numero perfecto");
                    }
                }
                break;
                
            case 42: //Escribe un programa para verificar si un número es un Número Perfecto o no.
                
                System.out.println("Ingresa el numero que deseas verificar: ");
                int n7 = scanner.nextInt();
                int sumDiv = 0;
                
                for(int i = 1; i <= n7 / 2; i++){
                    if(n7 % i == 0){
                        sumDiv += i;
                    }
                }
                if(sumDiv == n7){
                    System.out.println(n7 + " es un numero perfecto");
                }
                else{
                    System.out.println(n7 + " no es un numero perfecto");
                }
                break;
                
            case 43: //Escribe un programa para imprimir todos los Números de Armstrong entre 1 y 1000.
                
                for(int n9 = 1; n9 < 1000; n9++){
                    int Suma = 0;
                    int emp = n9;
                    int ce = String.valueOf(n9).length();
                    
                    int t = n9;
                    
                    while(t > 0){
                        int digu = t % 10;
                        Suma += Math.pow(digu, ce);
                        t /= 10;
                    }
                    if(Suma == emp && emp > 9){
                        System.out.println(emp + " es un numero de Armstrong");
                    }
                }
                break;
                
            case 44: //Escribe un programa para verificar si un número es un Número de Armstrong o no.
                
                System.out.println("Ingresa el numero que deseas verificar: ");
                int veri = scanner.nextInt();
                int veri1 = String.valueOf(veri).length();
                int sum = 0;
                int veri2 = veri;
                while(veri2 > 0){
                    int di = veri2 % 10;
                    sum += Math.pow(di, veri1);
                    veri2 /= 10;
                }
                if (sum == veri){
                    System.out.println(veri + " es un numero de Armstrong");
                }
                else{
                    System.out.println(veri + " no es un numero de Armstrong");
                }
                break;
                
            case 45: //Escribe un programa para imprimir los factores primos en Java.
                
                System.out.println("Ingresa un numero para ver sus factores primos: ");
                int n10 = scanner.nextInt();
                System.out.println("Los factores primos de " + n10 + " son: ");
                imprimir(n10);
                break;
        }
    } 
}
