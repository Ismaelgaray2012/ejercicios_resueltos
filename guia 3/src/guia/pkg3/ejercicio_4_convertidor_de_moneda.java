
package guia.pkg3;

import java.util.Scanner;

/*Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o 
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a 
convertir que será una cadena, este no devolverá ningún valor y mostrará un 
mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

*/
public class ejercicio_4_convertidor_de_moneda {

    
    public static void main(String[] args) {
       Scanner leer =new Scanner (System.in);
       Scanner leer2= new Scanner (System.in);
       double canteuros; String moneda;
       
        System.out.println("Ingrece la cant. de euros a conbertir:");
        canteuros=leer.nextDouble();
        
        System.out.println("Ingrece la moneda a la cual decea convertir los euros");
        moneda=leer2.nextLine();
        
        System.out.println("El importe en "+moneda+" de los euros es :");
        conversor(canteuros,moneda);
    }
public static void conversor(double canteuros, String moneda){
   double cal; 
    if (moneda == "libras"){
        cal=canteuros * 0.86;
        System.out.println("La conversion de euros a "+moneda+" es: "+cal); 
    }else if(moneda == "pesos"){
        cal=canteuros*1.28611;
         System.out.println("La conversion de euros a "+moneda+" es: "+cal); 
    }else{
        cal=canteuros * 129.852;
        System.out.println(cal);
        System.out.println("La conversion de euros a "+moneda+" es: "+cal); 
            }
}
}
