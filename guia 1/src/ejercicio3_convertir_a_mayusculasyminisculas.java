
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;



public class ejercicio3_convertir_a_mayusculasyminisculas {
//Escribir un programa que pida una frase y la muestre toda en mayúsculas 
//y después toda en minúsculas. 
    
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       
       String frase; String min; String mayus;
       
        System.out.println("Ingrece una frase:");
        frase=leer.nextLine();
        
        mayus=toUpperCase(frase);
        min=toLowerCase(frase);
        
        System.out.println("La frase en minicula:");
        System.out.println(min);
        System.out.println("La frase en mayuscula:");
        System.out.println(mayus);
        
    }

}
