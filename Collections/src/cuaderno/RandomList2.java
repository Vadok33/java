package cuaderno;

//Librerias

import java.util.ArrayList;
import java.util.Random;
import java.util.HashSet;

public class RandomList2 {

	public static void main(String[] args) {
		
		
		//Inicio
		System.out.println("\n Inicio del programa");
		System.out.println("\n Por Álvaro Elena");
		
		Random random = new Random();
		
		//Generar número aleatorio
		int listaSize = random.nextInt(11)+ 10;
		
		ArrayList<Integer> listaArray = new ArrayList<>(listaSize);
		
		for (int i = 10; i < listaSize; i++) {
            
			listaArray.add(random.nextInt(51));
	
		}
		
		System.out.println("\n Tamaño :" + listaArray.size());
		
		System.out.println("\n Lista :" + listaArray);
		
		int suma = 0;
		int max = 0;
		int min = 0;
		
		for(int i = 0; i < listaArray.size(); i++) {
			
			suma += listaArray.get(i);
			if (listaArray.get(i) > max) {
				max = listaArray.get(i);
				}
			if (listaArray.get(i) < min) {
				min = listaArray.get(i);
				}
			
		}
		
		System.out.println("\n Suma :" + suma);
		System.out.println("\n Máximo :" + max);
		System.out.println("\n Mínimo :" + min);
	
	}

}
