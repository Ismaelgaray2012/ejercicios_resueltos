
package guia.pkg2.GUIA_DE_EJERCICIOS_EXTRAS;
/*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor 
diferente a cada una. A continuación, realizar las instrucciones necesarias 
para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D 
tome el valor de B. Mostrar los valores iniciales y los valores finales de 
cada variable. Utilizar sólo una variable auxiliar.
*/

public class ejercici0_2_intercambio_de_variables {

    
    public static void main(String[] args) {
       int A=6; int B=12; int C=5; int D=200; int aux;
       
        System.out.println("las variables originales son: ");
        System.out.println("A= "+A);
        System.out.println("B= "+B);
        System.out.println("C= "+C);
        System.out.println("D= "+D);
       
      aux=B;
      B=C;
      C=A;
      A=D;
      D=aux;
      System.out.println("las variables cambiadas son: ");
        System.out.println("A= "+A);
        System.out.println("B= "+B);
        System.out.println("C= "+C);
        System.out.println("D= "+D);
    }

}
