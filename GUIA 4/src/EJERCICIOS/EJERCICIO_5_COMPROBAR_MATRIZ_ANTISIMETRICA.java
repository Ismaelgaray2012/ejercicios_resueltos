
package EJERCICIOS;
/*
Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice
que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz t
raspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas 
por columnas (o viceversa).
*/
public class EJERCICIO_5_COMPROBAR_MATRIZ_ANTISIMETRICA {

    
    public static void main(String[] args) {
       
        int [][] matriztras= new int [3][3];
        int cont=0;
        
      
        int [][] matriz = {{0 ,-2 ,4}, {2, 0, 2}, {-4, -2, 0}};
        
        System.out.println("La matriz original:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+ matriz[i][j] +"]");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
              matriztras[i][j]= matriz[j][i];  
            }
        }
        
        System.out.println("La matriz traspuesta: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+ matriztras[i][j] +"]");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j]!=-matriztras[i][j]){
                    cont++;
                }
            }
        }
        if (cont>0){
            System.out.println("la matriz no es antisimetrica");
        }else{
            System.out.println("La matriz  es antisimetrica");
        }
    }
    

}
