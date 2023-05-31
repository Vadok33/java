package ejerciciosArrays;

import java.util.Scanner;

public class InvertirCadena1 {

	public static void main(String[] args) {
		
			//Mensaje bienvenida
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("\n***Programa desarrollado por Álvaro Elena***");
			System.out.println("\n\nPrograma para invertir una cadena");
			System.out.println("\nIntroduce un texto y pulsa intro");
			
			
			
			//Variables
			
			String cadena = entrada.nextLine();
			String invertida = "";
			
			
			
			//Verificar si la cadena está vacía
			
			if(cadena.isEmpty()) {
		
				System.out.println("La cadena está vacia");
			}
			else {
			
				
			
			//Bucle para invertir la cadena	
				
			for (int indice = cadena.length() - 1; indice >= 0; indice--) {
				
				invertida += cadena.charAt(indice);
			}
			
			
			
			//Imprimir los resultados
			
			System.out.println("Cadena original: " + cadena);
			System.out.println("Cadena invertida: " + invertida);
			
			
			
			//Mensaje final
	        
	        System.out.println("\n\n*** FIN DEL PROGRAMA ***");
			
			}
		}
	}


