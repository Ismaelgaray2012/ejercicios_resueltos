
package guia.pkg2;
//Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
//este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben 

import java.util.Scanner;

//llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, 
//el primer carácter tiene que ser X y el último tiene que ser una O. Las secuencias
//leídas que respeten el formato se consideran correctas, la secuencia especial
//“&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta 
//de FDE, que no respete el formato se considera incorrecta.Al finalizar el proceso,
//se imprime un informe indicando la cantidad de lecturas correctas e incorrectas 
//recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las 
//siguientes funciones de Java Substring(), Length(), equals().


public class ejercicio_7 {

    
    public static void main(String[] args) {
       Scanner leer =new Scanner(System.in);
       
       int correcto=0; int incorrecto=0;
       String frase="";
       System.out.println("------------------------------------------------------------------");
        System.out.println("Bienvenido al Sistema RS232, a continuacion ingrese lo requerido: ");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Para terminar ingresar el comando &&&&&.");
        System.out.println("------------------------------------------------------------------");
        System.out.println("El sistema contara cada ingreso de 5 caracteres, ");
        System.out.println("y los que empiecen con X y terminen con O seran correctos.");
        System.out.println("------------------------------------------------------------------");
        
        
        do{
            System.out.println("Ingrece la cadena de maximo de 5 caracteres(FDE) para finalizar:");   
            frase=leer.nextLine();
            if (frase.length()==5 && frase.charAt(0)=='X' && frase.charAt(4)=='O'){ //el charAt es como el subcandena
                correcto++;
            }else if(frase.equals("&&&&&")){
                break;
            }else{
                incorrecto++;
            }
        } while(true);
        System.out.println("La cant. de lecturas correctas fueron: "+correcto);
        System.out.println("La cant. de lecturas incorrectas fueron: "+incorrecto);
    }

}
