
package EJERCICIOS_EXTRAS;

import java.util.Scanner;

/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a 
medida que el usuario las va ingresando, construya una “sopa de letras para niños”
de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal 
en una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación 
de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9.
Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las 
siguientes funciones de Java substring(), Length() y Math.random().

*/

public class EJERCICIO_5_SOPA_DE_LETRAS {

    
    public static void main(String[] args) {
       String[][] sopa= new String [20][20];
       String [] vector= new String[5];
       String palabra; int a;
       Scanner leer =new Scanner(System.in);
       
        for (int i = 0; i < 1; i++) {
            do{
                System.out.println("ingrece una palabra ente 3 y 5 caracteres:");
                palabra=leer.nextLine();
                if (palabra.length()<3 || palabra.length()>5){
                    System.out.println("palabra invalida, fuera de rango");
                }else{
                    System.out.println("palabra valida");
                }
            }while(palabra.length()<3 || palabra.length()>5);
            vector[i]=palabra;
        }
        
//        for (int i = 0; i < vector.length; i++) { ///ver el vector
//            System.out.print("'"+vector[i]+"'");
//        }
       
        for (int i = 0; i < 20; i++) {
            a=(int)(Math.random()*10);
            for (int j = 0; j < 20; j++) {
                if (sopa[a][0]!=""){
                    sopa[a][0]=vector[1];
                }else{
                    System.out.println("p ");
                }
            }
        }
        
       for (int i = 0; i < 20; i++) { //mostrar la sopa de letras
            for (int j = 0; j < 20; j++) {
                System.out.print("'"+sopa[i][j]+"'");
            }
            System.out.println("");
        }
    }

}
