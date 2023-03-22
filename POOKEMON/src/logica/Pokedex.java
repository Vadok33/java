package logica;

import java.util.Scanner;

public class Pokedex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crear objetos
		
		Bulbasaur pokemon1 = new Bulbasaur(001,"Bulbasaur",0.7,6.9,"Semilla","Espesura");
		Squirtle pokemon2 = new Squirtle(007,"Squirtle",0.5,9.0,"Tortuguita","Mar Llamas");
		Charmander pokemon3 = new Charmander(004,"Charmander",0.6,8.5,"Lagartija","Torrente");
		Pikachu pokemon4 = new Pikachu(025,"Pikachu",0.4,6.0,"Ratón","Electricidad");
		
		
		//Opcion de la pokedex
		
		int opcion = 0;
		System.out.println("\n\t Bienvenido a la Pokedex \n\t Elija un pokemon \n");
		do {
			
			System.out.println("\n\t---------- \n\t1 - Burbasú\n\t2 - Squirting \n\t3 - Charmeleon \n\t4 - Pakichu\n\t----------");
			Scanner sc = new Scanner(System.in);
			opcion = sc.nextInt();
				
			
			
				
			switch (opcion) {
			
			
			
			case 1:
				pokemon1.atacarPlacaje();
				pokemon1.atacarAraniazo();
				pokemon1.atacarMordisco();
				pokemon1.atacarDrenaje();
				pokemon1.atacarParalizar();
				System.out.println("\n\t--------\n\t"+ pokemon1.nombre+"\n\t--------\n\t Num. Pokedex:"+pokemon1.numPokedex+"\n\tCategoría:"+ pokemon1.categoria+"\n\tHabilidad:"+ pokemon1.habilidad+"\n\t Peso:"+pokemon1.peso+"\n\tAtura:"+ pokemon1.altura+"\n\t");
				
				
			break;
			
			
			case 2: 
				pokemon2.atacarPlacaje();
				pokemon2.atacarAraniazo();
				pokemon2.atacarMordisco();
				pokemon2.atacarHidro();
				pokemon2.atacarBurbuja();
				pokemon2.atacarPistola();
				System.out.println("\n--------\n"+ pokemon2.nombre+ "\n--------\n Num. Pokedex:"+ pokemon2.numPokedex+" \nCategoría:"+ pokemon2.categoria+" \nHabilidad:"+ pokemon2.habilidad+" \n Peso:"+ pokemon2.peso+" \nAtura:"+ pokemon2.altura+" \n");
			break;
			
		
			case 3:
				pokemon3.atacarPlacaje();
				pokemon3.atacarAraniazo();
				pokemon3.atacarMordisco();
				pokemon3.atacarPunio();
				pokemon3.atacarLanza();
				pokemon3.atacarAscua();
				System.out.println("\n--------\n"+ pokemon3.nombre+ "\n--------\n Num. Pokedex:"+ pokemon3.numPokedex+" \nCategoría:"+ pokemon3.categoria+" \nHabilidad:"+ pokemon3.habilidad+" \n Peso:"+ pokemon3.peso+" \nAtura:"+ pokemon3.altura+" \n");
			break;
			
			
			case 4:
				pokemon4.atacarPlacaje();
				pokemon4.atacarAraniazo();
				pokemon4.atacarMordisco();
				pokemon4.atacarImpac();
				pokemon4.atacarPtrueno();
				System.out.println("\n--------\n"+ pokemon4.nombre+ "\n--------\n Num. Pokedex:"+ pokemon4.numPokedex+" \nCategoría:"+ pokemon4.categoria+" \nHabilidad:"+ pokemon4.habilidad+" \n Peso:"+ pokemon4.peso+" \nAtura:"+ pokemon4.altura+" \n");
				
			break;
			
			default:
				System.out.println("\n Debe seleccionar un pokemon");
				
			}
			}
				while (opcion !=4);
			
			
			
		
	}

}
