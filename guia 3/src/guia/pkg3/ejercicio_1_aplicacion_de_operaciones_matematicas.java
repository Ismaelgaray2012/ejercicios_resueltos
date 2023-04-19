
package guia.pkg3;

import java.util.Scanner;

/*Crea una aplicación que le pida dos números al usuario y este pueda elegir 
entre sumar, restar, multiplicar y dividir. La aplicación debe tener una función 
para cada operación matemática y deben devolver sus resultados para imprimirlos 
en el main. 
*/
public class ejercicio_1_aplicacion_de_operaciones_matematicas {

    
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       int num1; int num2; 
       
        System.out.println("Ingrece el primer numero:");
        num1=leer.nextInt();
        System.out.println("Ingrece el segundo numero:");
        num2=leer.nextInt();
        
        int resulsum=suma(num1,num2);
        System.out.println("La suma entre los numeros "+num1+" y "+num2+" es: "+resulsum);
        double resulrest=resta(num1,num2);
        System.out.println("La resta entre los numeros "+num1+" y "+num2+" es: "+resulrest);
        int resulmult=multiplicacion(num1,num2);
        System.out.println("La multiplicacion entre los numeros "+num1+" y "+num2+" es: "+resulmult);
        double resuldiv=division(num1,num2);
        System.out.println("La division entre los numeros "+num1+" y "+num2+" es: "+String.format("%.4f", resuldiv));
    }
    
    
public static int suma(int num1, int num2){
    int suma;
           suma=num1+num2;
    return suma;
}


public static double resta(int num1, int num2){
    double resta;
    resta=num1-num2;
    return resta;
}

public static int multiplicacion(int num1, int num2){
    int multiplicacion;
    multiplicacion=num1*num2;
    return multiplicacion;
}

public static double division(double num1, double num2){
    double division = 1;
    if (num2!=0){
        division= num1 / num2;
        //System.out.println(division);
    }else{
        System.out.println("La division no se puede realiuzar ya que la division por cero no esta definida");
    }
    
    return division;
}
}
