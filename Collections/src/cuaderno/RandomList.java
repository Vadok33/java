package cuaderno;

import java.util.ArrayList;
import java.util.Random;
import java.util.HashSet;

public class RandomList {

	public static void main(String[] args) {
		
		//Inicio
		System.out.println("\n Inicio del programa");
		System.out.println("\n Por Álvaro Elena");
	
		
		//Creamos el ArrayList
		
		ArrayList<Integer> listaArray = new ArrayList<>();
        
		
		Random random = new Random();
        
        // Generar números aleatorios y añadir al Array
        
        for (int i = 0; i < 20; i++) {
            listaArray.add(random.nextInt(10 + 1));
        }
        
        // Mostrar el Array
        
        System.out.println("\nNúmeros aleatorios: \n" + listaArray);
        
        // Crear HashSet con el contenido del ArrayList
        
        HashSet<Integer> noRep = new HashSet<>(listaArray);
        
        // Mostrar el Array sin repeticiones
        System.out.println("\nSin repeticiones: \n" + noRep);

        
        System.out.println("\n\n***Fin del programa***");
        
	}

}
