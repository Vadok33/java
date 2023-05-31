package ejerciciosArrays;
import java.util.Scanner;

public class InvertirCadena2 {

	public static void main(String[] args) {
		
		//Mensaje bienvenida
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("\n***Programa desarrollado por Álvaro Elena***");
		System.out.println("\n\nPrograma para invertir una cadena");
		System.out.println("\nIntroduce un texto y pulsa intro");
		
		
		
		//Variables
		
		String cadena = entrada.nextLine();
		String invertida = invertirCadena(cadena);
		
		
		//Imprimir los resultados
		
		System.out.println("\nCadena original: " + cadena);
		System.out.println("Cadena invertida: " + invertida);
		
		
		
		//Mensaje final
        
        System.out.println("\n\n*** FIN DEL PROGRAMA *** (baque es )");
	}
	
        public static String invertirCadena(String cadena) {
        	
        	//Verificar si la cadena está vacía
        	
            if (cadena.isEmpty()) {
                return "La cadena está vacía";
            }

            // Invertir la cadena con <for>
            String invertida = "";
            for (int indice = cadena.length() - 1; indice >= 0; indice--) {
                invertida += cadena.charAt(indice);
            }

            return invertida;
        }
    }
		
		
	
		
		