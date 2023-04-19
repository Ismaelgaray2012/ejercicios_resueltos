
package guia.pkg2;
//Escriba un programa en el cual se ingrese un valor límite positivo, y
//a continuación solicite números al usuario hasta que la suma de los números 

import java.util.Scanner;

//introducidos supere el límite inicial.


public class ejercicio_5_suma_limite {

    
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       
        System.out.println("ingrece el valor limite:");
        int limite=leer.nextInt();
        
        int suma=0;int cont=0; //el contador es para la cant. de veces se ingresa el numero
        
        while(suma<=limite){
            System.out.println("Ingrece un numero:");
            int num=leer.nextInt();
            suma+=num;
            cont++;
        }
        System.out.println("La suma de los "+cont+" numeros ingresados es: "+suma+".");
    }

}
