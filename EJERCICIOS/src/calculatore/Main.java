package calculatore;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {

		
		//Inicio del programa
		int opcion = 0;
		System.out.println("\n\t Calculatore\n*****************************\n\tÁlvaro Elena \n*****************************\n " );
		
		//Eleccion de operador
		
		do {
			
			System.out.println("\n\t0. Salir\n\t1. Sumar\n\t2. Restar\n\t3. Multiplicar\n\t4. Dividir\n\t5. Exponencial");
			Scanner sc = new Scanner(System.in);
			opcion = sc.nextInt();
			
		switch (opcion) {
		
		case 0:
			break;
		case 1:
			Operaciones.suma();
			break;
		case 2:
			Operaciones.resta();
			break;
		case 3:
			Operaciones.multi();
			break;
		case 4:
			Operaciones.divi();
			break;
		case 5:
			Operaciones.expon();
			break;
			default:
				System.out.println("Debe seleccionar un operador");
		}
		}	
			
			while (opcion != 0);
		
		
		
		
		
		
		
		
		
	}

}
