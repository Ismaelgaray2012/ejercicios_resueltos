
package guia.pkg3;

import java.util.Scanner;

/*
Crea una aplicación que nos pida un número por teclado y con una función se lo 
pasamos por parámetro para que nos indique si es o no un número primo, debe 
devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por
ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

*/
public class ejerccio_5_numeros_primos {

    
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       int num; boolean opc;
       
        System.out.println("ingrece un numero:");
        num=leer.nextInt();
        //num=Math.floor(Math.random()*100);
        opc=comprobacion(num);
        System.out.println("El numero "+num+ " ingresado es primo: "+opc);
    }
public static boolean comprobacion(double num){
    boolean comprobacion=false;
    
   
    
    return comprobacion;
}
}
