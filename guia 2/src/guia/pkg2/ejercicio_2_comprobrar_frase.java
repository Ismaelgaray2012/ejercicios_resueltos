
package guia.pkg2;
//Crear un programa que pida una frase y si esa frase es igual a “eureka” el 
//programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.

import java.util.Scanner;

//Nota: investigar la función equals() en Java.


public class ejercicio_2_comprobrar_frase {

    
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);      
       
       System.out.println("Ingrece una frase:");
       String frase = leer.nextLine();
       
       if(frase.equals("eureka")){
           System.out.println("correcto"); 
       }else{
           System.out.println("Incorrecto");
       }
    }

}
//Algoritmo Eureka
//	definir clavein, clave Como Caracter
//	definir cont Como Entero
//	clave = "eureka"
//	cont = 0 
//	Hacer
//		escribir "ingrese la clave para iniciar sesiom"
//		leer clavein
//		cont = cont +1
//	Mientras Que clave <> clavein y cont < 3
//	
//	si clave == clavein
//		escribir "sesion iniciada"
//	SiNo
//		Escribir "sesion bloqueada"
//	FinSi
//	
//FinAlgoritmo