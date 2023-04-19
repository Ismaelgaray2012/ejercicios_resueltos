
package ejemplos;
////Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
////5 *****

import java.util.Scanner;

//3 ***
//11 ***********
//2 **


public class ejercicio_10_los_ateriscos {

    
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       
       int num;
       
       for (int i=0; i<4; i++){
           System.out.println("Ingrece el numero de ateriscos deceados:");
           num=leer.nextInt();
           if(num>0 && num<20){
               System.out.print(num);
               for(int j=0; j<num; j++){
                   System.out.print("*");
               }
               System.out.println("");
           }else{
               System.out.println("tiene que ser un numero entre 1 y 20");
           }
       }
    }

}
