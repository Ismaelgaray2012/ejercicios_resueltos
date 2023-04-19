
package ejemplos;
//Implementar un programa que le pida dos números enteros al usuario 
//y determine si ambos o alguno de ellos es mayor a 25.

import java.util.Scanner;



public class ejercicio_6 {

    
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       
       int  num1; int num2;
       
        System.out.println("Ingrce el primer numero:");
        num1=leer.nextInt();
        System.out.println("Ingrce el segundo numero:");
        num2=leer.nextInt();
        
        if (num1>25 && num2>25){
            System.out.println("Los 2 numeros ingresados son mayores a 25");            
        }
        else{
            if (num1>25){
                System.out.println("El primer numero es mayor a 25");
            }
            if (num2>25){
                System.out.println("El segundo numero es mayor a 25");
            }
        }
            
    }

}
