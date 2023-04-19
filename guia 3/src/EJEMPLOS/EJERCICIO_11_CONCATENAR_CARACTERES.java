
package EJEMPLOS;

import java.util.Scanner;

/*
Escribir un programa que procese una secuencia de caracteres ingresada por teclado 
y terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente
manera: cada vocal se reemplaza por el carácter que se indica en la tabla y el 
resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
a
e
i
o
u
@
#
$
%
*

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente. Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

*/

public class EJERCICIO_11_CONCATENAR_CARACTERES {

    
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       String frase="";
        System.out.println("Ingrece un frase que termine en punto:");
        frase=leer.nextLine();
        if (frase.charAt(frase.length()-1)=='.'){
            System.out.println("La frase es valida, se procede al reemplazo de vocales");
            String codmod=modificador(frase);
            System.out.println(codmod);
        }else{
            System.out.println("La frase es invalida, debe terminar con punto");
        }
    }

    
    public static String modificador(String frase){
        String codigo="";
        int longitud=frase.length();
        for (int i = 0; i < longitud-1; i++) {
           switch(frase.charAt(i)){
               case 'a':
                   codigo=codigo.concat("@");
                   break;
               case 'e':
                   codigo=codigo.concat("#");
                   break;
               case 'i':
                   codigo=codigo.concat("$");
                   break;
               case 'o':
                   codigo=codigo.concat("%");
                   break;
               case 'u':
                   codigo=codigo.concat("*");
                   break;
               default:
                   codigo=codigo.concat(frase.substring(i, i+1));
                   break;
           }
        }       
        return codigo;    
        }
}
