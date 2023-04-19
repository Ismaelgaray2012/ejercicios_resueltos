
package ejemplos;
//Escriba un programa que lea 20 números. Si el número leído es igual a cero se 
//debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa 
//deberá calcular y mostrar el resultado de la suma de los números leídos, pero si
//el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.

import java.util.Scanner;



public class ejercicio_9_detertor_de_numeros {

    
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       
       int num;int cont=0; int suma=0;
       
       do{
           System.out.println("Ingrece un numero");
           num=leer.nextInt();
           cont=cont+1;
           if(num>0){
               suma=suma+num;
           }
           if (num==0){
               System.out.println("Se capturó el numero cero");
               break;
           }
           
       }while(cont<20);
        System.out.println("La suma de los numeros ingresados es "+suma);
        System.out.println(cont);
    }

}
