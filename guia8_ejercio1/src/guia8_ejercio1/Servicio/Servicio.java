//Realizar una clase llamada CuentaBancaria en el paquete Entidades con los 
//siguientes atributos: numeroCuenta(entero), dniCliente(entero largo), saldoActual. 
//Agregar constructor vacío, con parámetros, getters y setters.
//Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
//Método para crear cuenta pidiéndole los datos al usuario.
//Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
//Método retirar(double): recibe una cantidad de dinero a retirar y se le restara 
//al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar se retirará 
//el máximo posible hasta dejar la cuenta en 0.
//Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que 
//el usuario no saque más del 20%.
//Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
//Método consultarDatos: permitirá mostrar todos los datos de la cuenta.

package guia8_ejercio1.Servicio;

import guia8_ejercio1.Entidade.Cuenta;
import java.util.Scanner;


public class Servicio {
    
    public Scanner leer = new Scanner (System.in);
    
    public Cuenta crearCuenta(){
        System.out.println("Introdusca su dni para iniciar");
        String dniCliente = leer.next();
         
        System.out.println("Introdusca saldo para iniciar");
        String saldoActual = leer.next();
        System.out.println("inicio su cuenta correctamente");
      
        
        
        
        public Dinero(){
            
            
        }
    }
    

}
