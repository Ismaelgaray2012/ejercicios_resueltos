
import java.util.Scanner;



public class ejercicio4_convertir_grados {
//Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
//grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

    
    public static void main(String[] args) {
       
        Scanner leer=new Scanner(System.in);
        
        int grados; double F;
        
        System.out.println("Ingrece la temp. en gracos celcius:");
        grados=leer.nextInt();
        
        F=32+((9*grados)/5);
        
        System.out.println("La temp. en grados centrigados es "+grados+"°");
        System.out.println("La temp. en grados Fahrenheit es "+F+"°");
    }

}
