
package ejemplos;
//Escriba un programa que valide si una nota está entre 0 y 10,
//sino estáentre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.

import java.util.Scanner;



public class ejercicio_8_validar_nota {

    
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       
       int nota; boolean logica=false;
       
       // System.out.println("Ingrece un valor de nota:");
        //nota=leer.nextInt();
        
       while (logica==false){
        System.out.println("Ingrece un valor de nota:");
        nota=leer.nextInt();
        if (nota>0 && nota<10){
            System.out.println("La nota es valida");
            logica=true;
        }else{
            System.out.println("La nota es invalida");
            logica=false;
        }
       }
    }

}
