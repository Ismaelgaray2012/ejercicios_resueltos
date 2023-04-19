
package guia.pkg2;
//Escriba un programa que pida una frase o palabra y valide si la primera 
//letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá 
//de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, 
//se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.


import java.util.Scanner;


public class ejercicio_4_primer_letra_A {

    
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       
       System.out.println("Ingrece una frase:");
       String frase=leer.nextLine();
       
       if (frase.substring(0, 1).equals("A")){
           System.out.println("correcto");
       }else{
           System.out.println("incorrecto");
       }
    }

}
