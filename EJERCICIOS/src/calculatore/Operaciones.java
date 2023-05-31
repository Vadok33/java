package calculatore;

import java.util.InputMismatchException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Operaciones {

	
	//Método leer operandos y control de excepciones
	
	public static double leerNumero() {
		
		double num = 0;
		boolean valido = false; 
		
		
		while(!valido) {
		Scanner sc=new Scanner (System.in);
		try {
		num = sc.nextDouble();
		valido = true;
		
		}
		
		catch(InputMismatchException e){
			System.out.println("\n ERROR: Introduzca un valor valido");
			
			
			}
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

		
		
		while (num2 == 0){
			
			System.out.println("\n ERROR: No se puede dividir entre 0");
			num2 = leerNumero();
		}
		
		resultado = num1 / num2;
		DecimalFormat formato = new DecimalFormat("#.00"); 
		String resultadoFormateado = formato.format(resultado);
		System.out.println("\nEl resultado de la operacion es: "+ resultadoFormateado);
		}
		
	//Método exponencial
		
	public static void expon() {
		
		double resultado;
		System.out.println("Introduce el primer valor");
		double num1 = leerNumero();
		System.out.println("Introduce el segundo valor");
		double num2 = leerNumero();
		
		resultado = Math.pow(num1, num2);
		DecimalFormat formato = new DecimalFormat("#.00"); 
		String resultadoFormateado = formato.format(resultado);
		System.out.println("\nEl resultado de la operacion es: "+ resultadoFormateado);
		
		
		
}
}