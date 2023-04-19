
package guia.pkg2;

//Crear un programa que dado un número determine si es par o impar.

import java.util.Scanner;

public class ejercicio_1_par_o_impar {

    
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       
       int num;
        System.out.println("Ingrcee un numero:");
       num=leer.nextInt();
       
       if (num%2==0){
           System.out.println("el numero ingresado es par");
       }else{
           System.out.println("el numero ingresado es impar");
       }
    }

}
