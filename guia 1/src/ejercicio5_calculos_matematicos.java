
import java.util.Scanner;



public class ejercicio5_calculos_matematicos {

//Escribir un programa que lea un número entero por teclado y muestre por
//pantalla el doble, el triple y la raíz cuadrada de ese número. 
//Nota: investigar la función Math.sqrt().
    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       int num; int doble; int triple; double raiz;
       
        System.out.println("Ingrece un numero entero: ");
        num=leer.nextInt();
        
        doble=num*2;
        triple=num*3;
        raiz=Math.sqrt(num);
        
        System.out.println("El doble de "+num+" es "+doble);
        System.out.println("El triple del "+num+" es "+triple);
        System.out.println("La raiz cuadrada del "+num+" es "+raiz);
    }

}
