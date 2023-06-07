package cajaRegistradora;

import java.util.Scanner;

public class CajaRegistradora {

	public static void main(String[] args) {
		
		
		//Mensaje bienvenida
		
		
		
		System.out.println("\n***Programa desarrollado por Álvaro Elena***");
		System.out.println("\n\nCaja Registradora");
		
		//Entrada precio artículo
		
		Scanner entrada = new Scanner(System.in);
		        
        System.out.print("Ingresa el precio del artículo: ");
        double precio = entrada.nextDouble();
        
        //Entrada cantidad pagada
        
        System.out.print("Ingresa la cantidad pagada: ");
        double pago = entrada.nextDouble();
        
        //Condiciones
        
        if (pago > precio) {
            double cambio = pago - precio;
            System.out.println("El cambio es: " + cambio);
        } else if (pago < precio) {
            double faltaPagar = precio - pago;
            System.out.println("Falta pagar: " + faltaPagar);
        } else {
            System.out.println("El pago es correcto.");
	        }
        
		//Mensaje final
        
        System.out.println("\n\n*** FIN DEL PROGRAMA ***");
	    }
	}


