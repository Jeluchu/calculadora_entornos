/**
*
* @author Eric Martin / Jesus Calderon
* @version 1.0
*/

import java.util.*;
import java.lang.Math;

public class main {
	

	public static void main(String[] args)  {
	Scanner teclado = new Scanner(System.in);
        		
       	boolean salir = false;
        int opcion;
        
		double numero1, numero2, resultado;
		double factorial = 1;
		
		String ANSI_RED_BACKGROUND = "\u001B[41m";
		String ROJO = "\u001B[1;31m";
		String NORMAL = "\u001B[0m";
		String AMARILLO = "\u001B[1;33m";
		String VERDE = "\u001B[1;32m";
		String AZUL = "\u001B[1;34m";
		String NEGRITA = "\u001B[1m";
		String AZULETE = "\u001B[1;36m";
		
      while (!salir) {
	      
        System.out.println("CALCUTESTER v0.1\n\n");
        System.out.println("Vamos a empezar introduciendo los digitos, pueden ser enteros o decimales:");	
	System.out.println("Por favor introduzca el primer operando:");			
	numero1 = teclado.nextDouble();
	System.out.println("A continuación introduzca el segundo operando:");
	numero2 = teclado.nextDouble();
	      
	      
        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃        "+AZUL+"¿Qué operación deseas realizar?"+NORMAL+"                              ┃");
        System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
        System.out.println("┃        Pulsa 1 si deseas realizar una suma                          ┃");
        System.out.println("┃        Pulsa 2 si deseas realizar una resta                         ┃");
        System.out.println("┃        Pulsa 3 si deseas realizar una multiplicación                ┃");
        System.out.println("┃        Pulsa 4 si deseas realizar una división                      ┃");
        System.out.println("┃        Pulsa 5 si deseas realizar una potencia                      ┃");
        System.out.println("┃        Pulsa 6 si deseas realizar una raíz                          ┃");
        System.out.println("┃        Pulsa 7 si deseas realizar una operacion factorial           ┃");
        System.out.println("┃        Pulsa 8 si deseas realizar un logaritmo                      ┃");
        System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
        System.out.println("┃        Pulsa 0 si deseas salir                                      ┃");
        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
            
            
        System.out.println("┃        "+AMARILLO+"PRÓXIMAMENTE NUEVAS FUNCIONES"+NORMAL+"                                ┃");
        System.out.println("\n\n");
      
 switch(opcion){
	
	case 1:resultado = numero1+numero2;
		break;
		 
	case 2:resultado = numero1-numero2;
		break;
		 
	case 3:resultado = numero1*numero2;
		break;
		 
	case 4: if (numero2 !=0)
			resultado = numero1/numero2;
		else 
			System.out.println("No es posible realizar la division por 0.\n");
		break;
		 
	case 5: resultado= Math.pow(numero1, numero2);
		break;
		 
	case 6: System.out.println("Raiz cuadrada de (" + numero1 + ")=" + Math.sqrt(numero1));
      		System.out.println("Raiz cuadrada de (" + numero2 + ")=" + Math.sqrt(numero2));
		break;
		 
	case 7: System.out.println("Se procedera a calcular el factorial del primer numero...");
		while ( numero1!=0) {
  			factorial=factorial*numero1;
  			numero1--;
		}
		resultado=factorial;
		break;
		 
		 
	case 8:	 /*(Math.log(num)/Math.log(2));*/
		 break;
		
	case 0: System.out.println("Gracias por utilizar nuestra calculadora");
		salir=true;
		break;
		 
	default:System.out.println("Introduzca una opción de las anteriores, por favor");
		break;
		 
	}//fin switch
	      System.out.println("El resultado es: " + resultado);
	}
}
