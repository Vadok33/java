package cuaderno;

import java.util.Hashset;

public class HashSetMain {

	public static void main(String[] args) {
		
		//Inicio
		System.out.println("\n Inicio del programa");
		System.out.println("\n Por Álvaro Elena");
		
		//Declarar HashSet
		
		HashSet<Persona> hashSet = new HashSet();
		
		// Iniciar HashSet
		
		hashSet.add(new Persona(1,"Farlok","Melenas","55555555B"));
		hashSet.add(new Persona(2,"Ana","Busado","44444444B"));
		hashSet.add(new Persona(3,"Querri","Caberga","33333333B"));
		hashSet.add(new Persona(4,"Mina","Botieso","22222222B"));
		
		// Mostrar lista
		System.out.println("\n------"
				+ "\n HASHSET"
				+"\n------");
		System.out.println("" + hashSet);
		
		//Tamaño lista
		System.out.println("Tamaño : " + hashSet.size());
		
		//Duplicados
		
		hashSet
	}

}
