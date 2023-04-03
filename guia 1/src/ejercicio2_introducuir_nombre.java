
import java.util.Scanner;



public class ejercicio2_introducuir_nombre {
//Escribir un programa que pida tu nombre, lo guarde en una variable 
//y lo muestre por pantalla.

    
    public static void main(String[] args) {
       Scanner leer =new Scanner(System.in);
       
       String nombre;
       
        System.out.println("Ingrece su nombre:");
        nombre=leer.nextLine();
        System.out.println("Mi nombre es: "+nombre);
    }

}
