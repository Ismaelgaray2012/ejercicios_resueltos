
package guia.pkg2;
//Realizar un programa que pida dos números enteros positivos por teclado 
//y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y 

import java.util.Scanner;

//el programa deberá mostrar el resultado por pantalla y luego volver al menú. El 
//programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, 
//si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
//se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea 
//salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
//programa, caso contrario se vuelve a mostrar el menú.


public class ejercicio_6_la_calculadora {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        int num1;int num2;
        do{
            int opc;
            do{
                System.out.println("                         ");
                System.out.println("========================================");    
                System.out.println("Bienvenidos a la calculadora Interactiva");
                System.out.println("========================================");
                System.out.println("Menu:");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Salir");
                System.out.println("Ingrese una opcion: ");
                opc = leer.nextInt();
                
                switch(opc){
                    case 1:
                        System.out.println("ingrece el primer numero:");
                        num1=leer.nextInt();
                        System.out.println("ingrece el segundo numero:");
                        num2=leer.nextInt();
                        System.out.println("La suma de los 2 numeros ingresados es "+(num1+num2));
                        System.out.println("                        ");
                        System.out.println("========================================");
                        System.out.println("========================================");
                        System.out.println("                        ");
                        break;
                    case 2:
                        System.out.println("ingrece el primer numero:");
                        num1=leer.nextInt();
                        System.out.println("ingrece el segundo numero:");
                        num2=leer.nextInt();
                        System.out.println("La resta de los 2 numeros ingresados es "+(num1-num2));
                        System.out.println("                        ");
                        System.out.println("========================================");
                        System.out.println("========================================");
                        System.out.println("                        ");
                        break;
                    case 3:
                        System.out.println("ingrece el primer numero:");
                        num1=leer.nextInt();
                        System.out.println("ingrece el segundo numero:");
                        num2=leer.nextInt();
                        System.out.println("La multiplicacion de los 2 numeros ingresados es "+(num1*num2));
                        System.out.println("                        ");
                        System.out.println("========================================");
                        System.out.println("========================================");
                        System.out.println("                        ");
                        break;
                    case 4:
                        System.out.println("ingrece el primer numero:");
                        num1=leer.nextInt();
                        System.out.println("ingrece el segundo numero:");
                        num2=leer.nextInt();
                        if (num2==0){
                            System.out.println("no se puede dividir por cero");
                        }else{
                            System.out.println("La divicion del primer numero entre el segundo numeros ingresados es "+((double)num1/num2));
                            System.out.println("                        ");
                        System.out.println("========================================");
                        System.out.println("========================================");
                        System.out.println("                        ");
                        }
                        break;
                    case 5:
                        System.out.println("esta seguro que desea salir del programa? (S/N)");
                        char respuesta=leer.next().charAt(0);
                        if (respuesta=='S' || respuesta=='s'){
                            System.out.println("hasta luego gracias por usar la calculadora.");
                            System.exit(0);
                        }
                        break;
                    default:
                        System.out.println("opcion no valida");
                }
            }while(opc !=5);
        } while (true);
    }

}
