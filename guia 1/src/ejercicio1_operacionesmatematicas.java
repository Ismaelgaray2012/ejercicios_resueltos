
import java.util.Scanner;



public class ejercicio1_operacionesmatematicas {
//Escribir un programa que pida dos números enteros por teclado 
//y calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma

    
    public static void main(String[] args) {
       Scanner leer =new Scanner (System.in);
       int num1; int num2; int suma; int mult; double div; int rest;
       
        System.out.println("Ingrece el primer numero: ");
        num1=leer.nextInt();
        
         System.out.println("Ingrece el segundo numero: ");
        num2=leer.nextInt();
        
        suma= num1+num2;
        System.out.println("La suma entre los numeros "+num1+" y "+num2+" es:");
        System.out.println(suma);
        
        rest= num1-num2;
        System.out.println("La resta entre los numeros "+num1+" y "+num2+" es:");
        System.out.println(rest);
        
        mult= num1*num2;
        System.out.println("La multiplicacion entre los numeros "+num1+" y "+num2+" es:");
        System.out.println(mult);
        
        div= num1 / num2;
        System.out.println("La division entre los numeros "+num1+" y "+num2+" es:");
        System.out.println(div);
    }

}
