package ejerciciosArrays;

import java.util.Scanner;

public class OrdenarArray1 {

	public static void main(String[] args) {
		
		//Mensaje bienvenida
		
		System.out.println("\n*** Programa desarrollado por Álvaro Elena***");

		
	
		//Variables
		
		int numElementos;
		int menor = 0;
		int i;
		
		
		
		//Longitud Array
		
		Scanner entrada = new Scanner (System.in);
		do {
		System.out.println("\n\nIntroduce el número total de elementos:");
		numElementos = entrada.nextInt();	
		}
		while (numElementos <= 0);
		
		
		
		//Declaración de array
		
		
		int[] miArray = new int [numElementos];
		
		//Declaración de los elementos del array
		
		for (i = 0; i < numElementos; i++) {
			System.out.println("Introduce numero (" +(i+1)+ ") ");
	        miArray[i] = entrada.nextInt(); 
		}
		
		
		
		//Mostrar array sin ordenar
		
		 System.out.println("\nArray sin ordenar: ");
	     for (int num: miArray) {
	          System.out.print("\n[" +num+ "]");
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
		
        System.out.println("\n\nArray ordenado de menor a mayor:" );
        for (int num:miArray) {
            System.out.print("\n[" +num+ "]");
        }
        entrada.close();
        
        
        //Mensaje final
        
        System.out.println("\n\n*** FIN DEL PROGRAMA ***");
	}
}
