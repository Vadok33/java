package logica;

import java.util.Scanner;

public class Pokedex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crear objetos
		
		Bulbasaur pokemon1 = new Bulbasaur("001","Bulbasaur","0,7 m","6,9 kg","Semilla","Espesura");
		//Pokemon pokemon2 = new Pokemon("007","Squirtle","0.5 m","9,0 kg","Tortuguita","Mar Llamas");
		//Pokemon pokemon3 = new Pokemon("004","Charmander","0,6 m","8,5 kg","Lagartija","Torrente");
		//Pokemon pokemon4 = new Pokemon("025","Pikachu","0,4 m","6,0 kg","Ratón","Electricidad");
		
		
		//Opcion de la pokedex
		
		int opcion = 0;
		System.out.println("\n Bienvenido a la Pokedex \n Elija un pokemon \n");
		do {
			
			System.out.println("\n---------- \n1 - Burbasú\n2 - Squirting \n3 - Charmeleon \n4 - Pakichu");
			Scanner sc = new Scanner(System.in);
			opcion = sc.nextInt();
				
			
			
				
			switch (opcion) {
			
			
			
			case 1:
				pokemon1.atacarPlacaje();
				pokemon1.atacarAraniazo();
				pokemon1.atacarMordisco();
				pokemon1.atacarDrenaje();
				pokemon1.atacarParalizar();
				System.out.println("\n--------\n"+ pokemon1.nombre+ "\n--------\n Num. Pokedex:"+ pokemon1.numPokedex+" \nCategoría:"+ pokemon1.categoria+" \nHabilidad:"+ pokemon1.habilidad+" \n Peso:"+ pokemon1.peso+" \nAtura:"+ pokemon1.altura+" \n");
				
				
			break;
			
			
			case 2: 
				;
			break;
			
		
			case 3:
				;
			break;
			
			
			case 4:
				;
				
			break;
			
			default:
				System.out.println("\n Debe seleccionar un pokemon");
				
			}
			}
				while (opcion !=4);
			
			
			
		
	}

}
