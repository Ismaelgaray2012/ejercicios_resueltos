
package EJERCICIOS_EXTRAS;

import java.util.Scanner;

/*
Realizar un programa que complete un vector con los N primeros números de la 
sucesión de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función 
que reciba como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.

*/

public class EJERCICIO_7_SERIE_FIBUNACHI {

    
    public static void main(String[] args) {
       
        Scanner leer =new Scanner (System.in);
        
        int num;
        
        System.out.println("ingrece el numero para el cual quiere la serie: ");
        num=leer.nextInt();
        
        long [] vector= new long[num];
        
        calfibonaccin(num,vector);
        imprimir(vector);
        System.out.println("");
    }
    public static void calfibonaccin(int num, long [] vector){
        int aux=1;
        for (int i = 0; i < vector.length; i++) {
            if (i==0 || i==1){
                vector[i]=1;
            }else{
               vector[i]=vector[i-2]+vector[i-1]; 
            }
        }
    }
    public static void imprimir(long []vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print("["+vector[i]+"]");
            
        }
        System.out.print("");

    }
            

}
