package calculatore;

import java.util.InputMismatchException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Operaciones {

	
	//Método leer operandos y control de excepciones
	
	public static double leerNumero() {
		
		double num = 0;
		Scanner sc=new Scanner (System.in);
		try {
		num = sc.nextDouble();
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
			System.out.println("\n ERROR: "+ e.getMessage());	
		}
		
		
		return num;
	}
	
	//Método sumar
	
	public static void suma () {
		
		double resultado;
		System.out.println("Introduce el primer valor");
		double num1 = leerNumero();
		System.out.println("Introduce el segundo valor");
		double num2 = leerNumero();
		
		resultado = num1 + num2;
		
		DecimalFormat formato = new DecimalFormat("#.00"); 
		String resultadoFormateado = formato.format(resultado);
		System.out.println("\nEl resultado de la operacion es: "+ resultadoFormateado);
	}
	
	///Método restar
	
	
	public static void resta () {
		
		double resultado;
		System.out.println("Introduce el primer valor");
		double num1 = leerNumero();
		System.out.println("Introduce el segundo valor");
		double num2 = leerNumero();
			
		resultado = num1 - num2;
		DecimalFormat formato = new DecimalFormat("#.00"); 
		String resultadoFormateado = formato.format(resultado);
		System.out.println("\nEl resultado de la operacion es: "+ resultadoFormateado);
	}
	
	
	//Método multiplicar
	
	public static void multi () {
	
		double resultado;
		System.out.println("Introduce el primer valor");
		double num1 = leerNumero();
		System.out.println("Introduce el segundo valor");
		double num2 = leerNumero();
		
		resultado = num1 * num2;
		DecimalFormat formato = new DecimalFormat("#.00"); 
		String resultadoFormateado = formato.format(resultado);
		System.out.println("\nEl resultado de la operacion es: "+ resultadoFormateado);
}

	
	//Método dividir
	
	public static void divi () {
		
		double resultado;
		System.out.println("Introduce el dividendo");
		double num1 = leerNumero();
		System.out.println("Introduce el divisor");
		double num2 = leerNumero();

		resultado = num1 / num2;
		DecimalFormat formato = new DecimalFormat("#.00"); 
		String resultadoFormateado = formato.format(resultado);
		System.out.println("\nEl resultado de la operacion es: "+ resultadoFormateado);
}
}