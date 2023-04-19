
package EJERCICIOS_EXTRAS;

import java.util.Scanner;

/*
Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos.

*/

public class EJERCICIO_6_LLENAR_UNA_MATRIZ_ALEATORIA {

    
    public static void main(String[] args) {
       
        Scanner leer =new Scanner(System.in);
        int suma=0;
        System.out.println("Ingrece la cant. de filas de la matriz");
        int N=leer.nextInt();
        System.out.println("Ingrece la cant. de columnas de la matriz");
        int M=leer.nextInt();
        int [][] matriz= new int [N][M];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j]=(int)(Math.random()*10);
                suma=suma+matriz[i][j];
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("la suma de las componentes:"+suma);
    }

}
