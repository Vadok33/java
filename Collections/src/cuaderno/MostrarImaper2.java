package cuaderno;

// Librerias necesarias
import java.util.HashSet;
import java.util.Scanner;

public class MostrarImaper2 {
	
    public static void main(String[] args) {
    	
    	
    	//Inicio
    	System.out.println("\n Inicio del programa");
    	System.out.println("\n Por Álvaro Elena");
    	
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hashSet = new HashSet<>();
        
        //Variables
      	int num;
      	
      	
      	//Bucle do while números positivos
      	
        do {
        	
            System.out.print("\n Introduzca los números que desee: ");
            num = sc.nextInt();
            
            if (num >= 0) {
                hashSet.add(num);
                
            	}
        	} while (num >= 0);
        
        // Mostrar Array
        
        System.out.println("\n-----------------------------------\nEsta es la lista de números enteros: \n-----------------------------------\n");
        	for (int n : hashSet) {
        System.out.print(n + " ");
        }
        
        
        // Mostrar impares
        System.out.println("\n-----------------------------------------\nEstos son los numeros impares de la lista: \n-----------------------------------------\n");
        for (int n : hashSet) {
            if (n % 2 != 0) {
                System.out.print(n + " ");
            }
        }
        
        
        // Eliminar múltiplos de 3
	    // Nuevo Array para los multiplos de 3 
        
        HashSet<Integer> multiplos = new HashSet<>();
        
        //Bucle para añadir los multiplos de 3
        
        	for (int n : hashSet) {
        		if (n % 3 != 0) {
        			multiplos.add(n);
        		}
        	}
        System.out.println("\n------------------------- \nLista sin múltiplos de 3: \n-------------------------");
	        for (int n : multiplos) {
	            System.out.print(n + " ");
        }
	    System.out.println("\n\n***Fin del programa***");
    }
}
