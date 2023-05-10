package calculatore;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Operaciones {

	
	
	
	
	//Metodos operadores
	
	
	
	public static double leerNumero() {
		
		double num1 =0;
		Scanner sc=new Scanner (System.in);
		try {
		num1 = sc.nextDouble();
		}
		
		catch(NumberFormatException e){
			System.out.println("\n ERROR: Introduce un número");
			System.out.println("\n ERROR: "+ e.getMessage());	
		}
		
		catch(ArithmeticException e){
			System.out.println("\n ERROR: Introduce un número");
			System.out.println("\n ERROR: "+ e.getMessage());
		}
		
		catch(IllegalArgumentException e){
			System.out.println("\n ERROR: Introduce un número");
			System.out.println("\n ERROR: "+ e.getMessage());
		}
		catch(InputMismatchException e){
			System.out.println("\n ERROR: Solo se permite operar con números");
			//System.out.println("\n ERROR: "+ e.getMessage());	
		}
		
		
		return num1;
	}
	
	
	public static void suma () {
		
		double resultado;
		System.out.println("Introduce el primer valor");
		double num1 = leerNumero();
		System.out.println("Introduce el segundo valor");
		double num2 = leerNumero();
		
		resultado = num1 + num2;
		System.out.println("\nEl resultado de la operacion es: "+ resultado);
	}
	public static void resta () {
		
		double resultado;
		System.out.println("Introduce el primer valor");
		double num1 = leerNumero();
		System.out.println("Introduce el segundo valor");
		double num2 = leerNumero();
			
		resultado = num1 - num2;
		System.out.println("\nEl resultado de la operacion es: "+ resultado);
	}
	
	public static void multi () {
	
		double resultado;
		System.out.println("Introduce el primer valor");
		double num1 = leerNumero();
		System.out.println("Introduce el segundo valor");
		double num2 = leerNumero();
		
		resultado = num1 * num2;
		System.out.println("\nEl resultado de la operacion es: "+ resultado);
}

	public static void divi () {
		
		double resultado;
		System.out.println("Introduce el dividendo");
		double num1 = leerNumero();
		System.out.println("Introduce el divisor");
		double num2 = leerNumero();

		resultado = num1 / num2;
		System.out.println("\nEl resultado de la operacion es: "+ resultado);
	}
}
