
package EJERCICIOS_EXTRAS;

import java.util.Scanner;

/*
Los profesores del curso de programación de Egg necesitan llevar un registro de 
las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de 
aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4 
notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones 
de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
Al final del programa los profesores necesitan obtener por pantalla la cantidad 
de aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos 
con promedio mayor o igual al 7 de sus notas del curso.

*/

public class EJERCICIO_4_PONDERACION_DE_NOTAS {

    
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        double promedio=0; int contapro=0; int contdesp=0;
       double [][] notas= new double [10][5];
       
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Ingrece las notas del alumno "+i+":");
                if (j==0){
                    System.out.println("Ingrece la nota de Primer trabajo práctico evaluativo:");
                    //notas[i][j]=leer.nextDouble();
                    notas[i][j]=(double)(Math.random()*10);
                }else if (j==1){
                    System.out.println("Ingrece la nota de Segundo trabajo práctico evaluativo:");
                    //notas[i][j]=leer.nextDouble();
                    notas[i][j]=(double)(Math.random()*10);
                }else if (j==2){
                    System.out.println("Ingrece la nota de Primer Integrador:");
                    //notas[i][j]=leer.nextDouble();
                    notas[i][j]=(double)(Math.random()*10);
                }else{
                    System.out.println("Ingrece la nota de Segundo Integrador:");
                    //notas[i][j]=leer.nextDouble();
                    notas[i][j]=(double)(Math.random()*10);
                }
            }
        }
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                if (j==4){
                    promedio=(notas[i][0]*0.1)+(notas[i][1]*0.15)+(notas[i][2]*0.25)+(notas[i][3]*0.5);
                    System.out.println("el promedio es "+promedio);
                    notas[i][j]=promedio;
                    if(promedio>=7){
                        contapro++;
                    }else{
                        contdesp++;
                    }
                }
            }
            promedio=0;
        }
        System.out.println("La matris con las notas y sus promedios es:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("["+notas[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("La cant. de aprobados es "+contapro);
        System.out.println("La cant. de desaprobados es "+contdesp);
    }

}
