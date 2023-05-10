package calculatore;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		//Inicio del programa
		int opcion = 0;
		System.out.println("\n\t Calculatore\n*****************************\n\tÁlvaro Elena \n*****************************\n " );
		
		//Eleccion de operador
		
		do {
			
			System.out.println("\n\t0. Salir\n\t1. Sumar\n\t2. Restar\n\t3. Multiplicar\n\t4. Dividir");
			Scanner sc = new Scanner(System.in);
			opcion = sc.nextInt();
			
		switch (opcion) {
		
		case 0:
			break;
		case 1:
			System.out.println("Introduce los numeros que deseas sumar");
			suma();
			break;
		case 2:
			System.out.println("Introduce los numeros que deseas restar");
			break;
		case 3:
			System.out.println("Introduce los numeros que deseas multiplicar");
			break;
		case 4:
			System.out.println("Introduce los numeros que deseas dividir");
			break;
			default:
				System.out.println("Debe seleccionar un operador");
		}
		}	
			
			while (opcion != 0);
		
		
		
		
		
		
		
		
		
	}

}
