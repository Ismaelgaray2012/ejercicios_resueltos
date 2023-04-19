
package EJERCICIOS_EXTRAS;

import java.util.Scanner;

/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de
tamaño N, con los valores ingresados por el usuario.
*/

public class EJERCICIO_1_SUMAR_COMPONENTES {

    
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        
        int n; int suma=0;
        System.out.println("Ingrece el tamanño del vector: ");
        n=leer.nextInt();
        
       int vector[]= new int[n];
       
        for (int i = 0; i < n; i++) {
            vector[i]=i+1;
            suma=suma+vector[i];
        }
        System.out.println("El vector es: ");
        for (int i = 0; i < n; i++) {
            System.out.print("["+vector[i]+"]");
        }
        System.out.println("");
        System.out.println("La suma de las componentes del vector es "+suma);
    }

}
