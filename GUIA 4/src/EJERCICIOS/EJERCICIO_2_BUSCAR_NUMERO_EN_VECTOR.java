
package EJERCICIOS;

import java.util.Scanner;

/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y 
le pida al usuario un número a buscar en el vector. El programa mostrará dónde 
se encuentra el numero y si se encuentra repetido

*/
public class EJERCICIO_2_BUSCAR_NUMERO_EN_VECTOR {

    
    public static void main(String[] args) {
       Scanner leer =new Scanner(System.in);
       int num;int cont=0;int pos=0;
       int vector[]= new int[16];
       
        //System.out.println("Ingrece el numeor a buscar en el vector");
        //num=leer.nextInt();
        num=(int)(Math.random()*10);
        
        for (int i = 0; i < vector.length; i++) {
        vector[i]=(int)(Math.random()*10);    
        }
        
        for (int i = 0; i < vector.length; i++) {
            if(num== vector[i]){
                System.out.println("El numero "+num+" buscado esta en la posicion "+i);
            }
        }
        
       
       
        for (int i = 0; i < vector.length; i++) {
            System.out.print("["+vector[i]+"]");
        }
    }

}
