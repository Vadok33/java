package ejerciciosArrays;

import java.util.Scanner;

public class OrdenarArray1 {

	public static void main(String[] args) {
		
		System.out.println("\n*** Programa desarrollado por Álvaro Elena***");

		
	
		//Variables
		
		int numElementos;
		int menor = 0;
		int i;
		
		
		
		//Longitud Array
		
		Scanner entrada = new Scanner (System.in);
		do {
		System.out.println("Introduce el número total de elementos:");
		numElementos = entrada.nextInt();	
		}
		while (numElementos <= 0);
		
		
		
		//Bucle introducir números
		
		int[] miArray = new int [numElementos];
		
		for (i = 0; i < numElementos; i++) {
			System.out.println("Introduce numero (" +(i+1)+ ") ");
	        miArray[i] = entrada.nextInt(); 
		}
		
		
		//Bucle ordenar array
		
		for (i = 0; i < miArray.length; i++) {
            
            for (int j = i; j < miArray.length; j++) {
                
                if (miArray[i] > miArray[j]) {
                    
                    menor=miArray[j];
                    miArray[j]=miArray[i];
                    miArray[i]= menor;
                }
                
            }
        }
        
		
		
		//Mostrar Array ordenado
        System.out.println("Array ordenado de menor a mayor:" );
        for (int num:miArray) {
            System.out.print("\n[" +num+ "]");
        }
        entrada.close();
        System.out.println("\n\n*** FIN DEL PROGRAMA ***");
	}

}
