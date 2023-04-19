
package EJERCICIOS;

import java.util.Scanner;

/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear 
un programa que permita introducir un cuadrado por teclado y determine si este 
cuadrado es mágico o no. El programa deberá comprobar que los números introducidos 
son correctos, es decir, están entre el 1 y el 9.

*/
public class EJERCICIO_6_EL_CUBO_MAGICO {

    
    public static void main(String[] args) {
       Scanner leer =new Scanner(System.in);
       int num; int sumdiag=0;int sumfila1=0;int sumfila2=0;int sumacol0=0;int sumfila0=0;
       int sumcol1=0; int sumcol2=0;
       int [][] matriz= new int[3][3];
       
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do{
                    System.out.println("ingrece un numero entre 1 y 9: "+"("+i+j+")");
                    num=leer.nextInt();
                    if(num<1 || num >9){
                        System.out.println("el numero ingresado es invalido");
                    }
                }while(num<1 || num>9);
                matriz[i][j]=num;
            }
        }
        
        
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+ matriz[i][j] +"]");
            }
            System.out.println("");
        }
         
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                 if (i==j){
                     sumdiag=sumdiag+matriz[i][j];
                 }
                 if (i==0){
                     sumfila0=sumfila0+matriz[i][j];
                 }else{
                     if(i==1){
                         sumfila1=sumfila1+matriz[i][j];
                     }
                     if(i==2){
                         sumfila2=sumfila2+matriz[i][j];
                     }
                 }
                  if (j==0){
                     sumacol0=sumacol0+matriz[i][j];
                  }else{
                     if(j==1){
                         sumcol1=sumcol1+matriz[i][j];
                     }
                     if(j==2){
                         sumcol2=sumcol2+matriz[i][j];
                     }
                 }
                 
             }
        }
          System.out.println("suma col 0 "+sumacol0);
          System.out.println("suma col 1 "+sumcol1);
          System.out.println("suma col 2 "+sumcol2);
          System.out.println("suma fila 0 "+sumfila0);
          System.out.println("suma fila 1 "+sumfila1);
          System.out.println("suma fila 2 "+sumfila2);
          System.out.println("suma diag "+sumdiag);
         
         if(sumdiag==sumfila0 && sumdiag==sumfila1 && sumdiag==sumfila2 && sumdiag==sumacol0 && sumdiag==sumcol1 && sumdiag==sumcol2){
             System.out.println("EL cuandrado es magico");
         }else{
             System.out.println("el cuadrado no es magico");
         }

    }

}
