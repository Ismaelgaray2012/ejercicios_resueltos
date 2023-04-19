
package EJERCICIOS_EXTRAS;
/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo 
por parámetro. Después haremos otra función o procedimiento que imprima el vector.

*/

public class EJERCICIO_3_RELLENADOR_DE_VECTORES_ALEATORIOS {

    
    public static void main(String[] args) {
       int n=(int)(Math.random()*10); 
       int vector []= new int[n];
        llenarvector(vector);
        imprimir(vector);
    }
public static void llenarvector(int[]vector){
    for (int i = 0; i < vector.length; i++) {
       vector[i]=(int)(Math.random()*10); 
    }
}
public static void imprimir(int[]vector){
    System.out.println("el vector armado es:");
    for (int i = 0; i < vector.length; i++) {
        System.out.print("["+vector[i]+"]");
    }
    System.out.println("");
}
}
