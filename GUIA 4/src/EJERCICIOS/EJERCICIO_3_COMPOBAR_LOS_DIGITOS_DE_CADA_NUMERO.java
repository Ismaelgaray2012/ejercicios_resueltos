
package EJERCICIOS;

import java.util.Scanner;

/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

*/
public class EJERCICIO_3_COMPOBAR_LOS_DIGITOS_DE_CADA_NUMERO {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int cont1=0;int cont2=0;int cont3=0; int cont4=0; int cont5=0; int aux;
        System.out.println("Ingrece la longitud del vector:");
        int n=16;//leer.nextInt();
        int vector[]=new int[n];
       
        for (int i = 0; i < vector.length; i++) {
            vector[i]= (int)((Math.random()*(99999/(Math.random()*100)+10))); //para obtener numeros aleatorios de hasta 5 cifras
        }
        for (int i = 0; i < vector.length; i++) {
            if ((Math.floor(vector[i]/10000))>0){
                cont5++;
            } else if ((Math.floor(vector[i]/1000))>0){
                cont4++;
            } else if ((Math.floor(vector[i]/100))>0){
                cont3++;
            } else if ((Math.floor(vector[i]/10))>0){
                cont2++;
            } else{
                cont1++;
            }
        }
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print("["+vector[i]+"]");
        }
        System.out.println("");
        System.out.println("La cant. de numeors de 5 cifras es "+cont5);
        System.out.println("La cant. de numeors de 4 cifras es "+cont4);
        System.out.println("La cant. de numeors de 3 cifras es "+cont3);
        System.out.println("La cant. de numeors de 2 cifras es "+cont2);
        System.out.println("La cant. de numeors de 1 cifras es "+cont1);
    }

}
/*lgoritmo sin_titulo
	
	Definir centena, decena, unidad, num Como Real
	
	Escribir "Ingrese un numero de tres cifras"
	leer num
	
	centena = Trunc (num/100)
	decena = Trunc ((num MOD 100) / 10)
	unidad = Trunc ((num MOD 100) MOD 10)
	
	Escribir "La centena es: " centena
	Escribir "La decena es: " decena
	Escribir "La unidad es: " unidad
	
FinAlgoritmo
*/