
package EJERCICIOS;
/*
Realizar un algoritmo que llene un vector con los 100 primeros números enteros y 
los muestre por pantalla en orden descendente.

*/
public class EJERCICIO_1_RELLENAR_VECTOR {

    
    public static void main(String[] args) {
       
        int[] vector= new int[100];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i]=i+1;
           // System.out.println(vector[i]);
        }
         for (int i = 0; i < vector.length; i++) {
           // System.out.print("["+vector[i]+"]");
         }
        for (int j =vector.length-1; j >= 0; j--) {
            
            System.out.print("["+vector[j]+"]");
        }
    }

}
