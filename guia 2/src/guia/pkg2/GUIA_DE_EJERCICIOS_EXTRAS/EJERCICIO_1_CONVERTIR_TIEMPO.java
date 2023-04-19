
package guia.pkg2.GUIA_DE_EJERCICIOS_EXTRAS;

import java.util.Scanner;

/*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por 
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular 
su equivalente: 1 día, 2 horas.
*/
public class EJERCICIO_1_CONVERTIR_TIEMPO {

    
    public static void main(String[] args) {
       Scanner leer =new Scanner(System.in);
       double dias; double horas; int minutos; double aux;
       
        System.out.println("Ingrece un tiempo en minutos:");
        
        minutos=leer.nextInt();
        aux=minutos/60;
        System.out.println(aux);
        dias=Math.floor(aux/24);
        System.out.println("Los dias son "+dias);
        horas=((aux/24)-dias)*60;
        System.out.println("las horas "+horas);
        if (dias%1==0){
            
        }
    }

}
