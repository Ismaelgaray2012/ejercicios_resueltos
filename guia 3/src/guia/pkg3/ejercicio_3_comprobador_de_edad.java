
package guia.pkg3;

import java.util.Scanner;

/*Diseñe una función que pida el nombre y la edad de N personas e imprima los 
datos de las personas ingresadas por teclado e indique si son mayores o menores 
de edad. Después de cada persona, el programa debe preguntarle al usuario si 
quiere seguir mostrando personas y frenar cuando el usuario 
ingrese la palabra “No”.
*/
public class ejercicio_3_comprobador_de_edad {

    
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       Scanner leer2= new Scanner(System.in);
       String nombre; int edad; String opc="si"; String edadcom;
       
       while (opc != "si"){
           System.out.println("Ingrece un nombre:");
           nombre=leer.nextLine();
           
           System.out.println("Ingrece la edad:");
           edad=leer.nextInt();
           
           edadcom= comprobador(edad);
           
           System.out.println(nombre+" es "+edadcom);
           
           System.out.println("Decea ingresar otro nombre (si/no)");
           
           opc=leer2.nextLine(); //utilizo otro escaner ya que como tengo otro next antes no me deja escribir
           
           
       }    
       
    }
    
    
public static String comprobador(int edad){
    String comprobador="";
    if (edad>=18){
        comprobador="es mayor de edad";
    }else{
        comprobador=" es menor de edad";
    }
return comprobador;     
}
}
