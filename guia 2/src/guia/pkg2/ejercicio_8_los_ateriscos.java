
package guia.pkg2;
//Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
//Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
//* * * *
//*     *
//*     *
//* * * *

import java.util.Scanner;



public class ejercicio_8_los_ateriscos {

    
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       
        System.out.println("Ingrece un numero:");
        
        int num=leer.nextInt();
        
       //vamos agregar la primer fila
        
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
            if (i==0 || i==num-1){
                System.out.print("* ");
            }else{
                if (j==0 || j==num-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            }
            System.out.println(""); 
        }
        
    }

}
