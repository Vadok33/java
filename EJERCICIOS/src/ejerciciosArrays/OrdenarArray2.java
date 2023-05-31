package ejerciciosArrays;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenarArray2 {

	public static void main(String[] args) {
		
		//Mensaje bienvenida
		
		System.out.println("\n*** Programa desarrollado por Álvaro Elena***");
		
		
		
		//Variables
		
		int numElementos;
		int i;
		
		
		
		//Longitud Array
		
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.println("\n\nIntroduce el número total de elementos:");
			numElementos = entrada.nextInt();
			
		}
		
		while (numElementos <=0);
		
		
		
		//Bucle introducir números
		
		int[] miArray = new int [numElementos];
		
		for (i = 0; i < numElementos; i++) {
            System.out.println("\nIntroduce numero (" +(i+1)+ ") ");
            miArray[i]=entrada.nextInt();
        }
		
		
		
		//Mostrar array sin ordenar
		
		System.out.println("\nArray sin ordenar: ");
	    for (int num: miArray) {
	          System.out.print("[" +num+ "]");
	          }
	     
	     
	     
	    //Ordenar array con .sort
	        
	    Arrays.sort(miArray);
	     
	     
	    
	    //Mostrar array ordenado con .toString
	        
	    System.out.println("\n\nArray ordenado de menor a mayor:\n" );
	        
	    System.out.println(Arrays.toString(miArray));
	    
	    //Declarar array predefinido
	    	    
	    int[] arrayPredefinido = {1, 3, 7, 9, 15};
	    System.out.println("\nArray predefinido: " + Arrays.toString(arrayPredefinido));
	    
	    
	    //Llamar al método contarCoincidencias
	    
	    int coincidencias = contarCoincidencias(miArray, arrayPredefinido);
	    System.out.println("\nNúmero de coincidencias: " + coincidencias);
	    
	    
	   
	    //Mensaje final
        
        System.out.println("\n\n*** FIN DEL PROGRAMA ***");
	}  

		
	    
	    //Método para comprobar las coincidencias
	    
        public static int contarCoincidencias(int[] arrayOrdenado, int[] arrayPredefinido) {
        	int coincidencias = 0;
        	for (int i = 0; i < arrayPredefinido.length; i++) {
        		if (Arrays.binarySearch(arrayOrdenado, arrayPredefinido[i]) >= 0) {
        			coincidencias++;
        		}
        	}
        	return coincidencias;
        
	}
}

