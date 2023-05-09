package cuaderno;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMain {

	public static void main(String[] args) {
		
		
		//Inicio
		System.out.println("\n Inicio del programa");
		System.out.println("\n Por Álvaro Elena");
		
		//Variables
		int i;
		String borrarPersona;
		
		//Declarar LinkedList
		
		LinkedList<Persona> listaLinked = new LinkedList<>();
		
		//Iniciar LinkedList
		
		listaLinked.add(0, new Persona(1,"Farlok","Melenas","55555555B"));
		listaLinked.add(1, new Persona(2,"Ana","Busado","44444444B"));
		listaLinked.add(2, new Persona(3,"Querri","Caberga","33333333B"));
		listaLinked.add(3, new Persona(4,"Mina","Botieso","22222222B"));
		
		// Mostrar lista
		
				System.out.println("\n ---------"
							 	+  "\n LÏNKEDLIST"
								+  "\n ---------");
				System.out.println("\n " + listaLinked );
				
				//Tamaño lista
				
				System.out.println("\n Tamaño :" + listaLinked.size());
				
				//Mostrar primer y ultimo elemento
				
				System.out.println("Primero: " + listaLinked.getFirst().getNombre());
				System.out.println("Último : " + listaLinked.getLast().getNombre());
				
				//Recorrido por indice
				System.out.println("\n -------RECORRIDO INDICE-------\n");
				for (i = 0; i<listaLinked.size();i++){
					
					System.out.println("["+ i +"]:"
							+ listaLinked.get(i).getIdPersona() + " "
							+ listaLinked.get(i).getNombre() + " "
							+ listaLinked.get(i).getApellido() + " "
							+ listaLinked.get(i).getDni() + " " );
					}
				//Recorrido foreach (por cada uno)
				System.out.println("\n -------RECORRIDO FOREACH-------\n");
				i = 0;
				for (Persona persona: listaLinked) {
					System.out.println("["+ i +"]: "
										+ persona.getIdPersona() + ""
										+ persona.getNombre() + ""
										+ persona.getApellido());
				}
				
				// BORRAR ELEMENTO
				//------------------------
				borrarPersona = "Mina";
				//------------------------
				System.out.println("\n -------BORRAR PERSONA CON ITERADOR-------\n");
				
				//Crear objeto con iterador
				
				Iterator<Persona> it = listaLinked.iterator();
				
				//Borrar elemento nombre = Mina
				
				while (it.hasNext()) {
					String nombrePersona = it.next().getNombre();
					if (nombrePersona.equals(borrarPersona)) {
						it.remove();
					}
				}
				
				i = 0;
				for (Persona persona: listaLinked ) {
					System.out.println("["+ i +"]: "
							+ persona.getIdPersona() + ""
							+ persona.getNombre() + ""
							+ persona.getApellido());
					i++;
					
					}


	}

}
