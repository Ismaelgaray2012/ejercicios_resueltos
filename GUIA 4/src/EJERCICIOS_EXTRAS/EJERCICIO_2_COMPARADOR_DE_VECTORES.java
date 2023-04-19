
package EJERCICIOS_EXTRAS;

import java.util.Scanner;

/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (
la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).

*/

public class EJERCICIO_2_COMPARADOR_DE_VECTORES {

    
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
        int n; int num;int cont=1;
        System.out.println("Ingrece el tamanño del vector: ");
        n=leer.nextInt();
        
        int vect1[]=new int[n];
        int vect2[]= new int [n];
        
        for (int i = 0; i < n; i++) {
            vect1[i]=(int)(Math.random()*2);
           
            vect2[i]=(int)(Math.random()*2);
        }
        for (int i = 0; i < n; i++) {
            if (vect1[i]!= vect2[i]){
                System.out.println("los vectores son distintos");
                cont=0;
                System.out.println(i);
                break;
            
            }
        }
        if(cont!=0){
            System.out.println("los vectores son iguales");
        }
         System.out.println("El vector 1 es: ");
        for (int i = 0; i < n; i++) {
            System.out.print("["+vect1[i]+"]");
        }
        System.out.println("");
         System.out.println("El vector 2 es: ");
        for (int i = 0; i < n; i++) {
            System.out.print("["+vect2[i]+"]");
        }
        System.out.println("");
    }

}
