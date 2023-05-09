package cuaderno;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMain {

	public static void main(String[] args) {
		
		//Inicio
		System.out.println("Inicio del programa");
		System.out.println("Por Alvaro Elena");
		
		//Variables
		int i;
		String borrarPersona;
		
		//Declarar Array
		ArrayList<Persona> listaArray = new ArrayList<Persona>();
		
		//Crear objetos tipo personas
		//Persona persona1 = new Persona(1,"Alvaro","Farlok","55555555B");
		 
		// Construir ArrayList
		listaArray.add(0, new Persona(1,"Farlok","Melenas","55555555B"));
		listaArray.add(1, new Persona(2,"Ana","Busado","44444444B"));
		listaArray.add(2, new Persona(3,"Querri","Caberga","33333333B"));
		listaArray.add(3, new Persona(4,"Mina","Botieso","22222222B"));
		
		// Mostrar lista
		
		System.out.println("\n ---------"
					 	+  "\n ARRAYLIST"
						+  "\n ---------");
		System.out.println("\n " + listaArray );
		
		//Tamaño lista
		
		System.out.println("\n Tamaño :" + listaArray.size());
		
		//Mostrar primer y ultimo elemento
		
		System.out.println("Primero: " + listaArray.get(0).getNombre());
		System.out.println("Último : " + listaArray.get(listaArray.size()-1).getNombre());
		
		//Recorrido por indice
		System.out.println("\n -------RECORRIDO INDICE-------\n");
		for (i = 0; i<listaArray.size();i++){
			
			System.out.println("["+ i +"]:"
					+ listaArray.get(i).getIdPersona() + " "
					+ listaArray.get(i).getNombre() + " "
					+ listaArray.get(i).getApellido() + " "
					+ listaArray.get(i).getDni() + " " );
			}
		//Recorrido foreach (por cada uno)
		System.out.println("\n -------RECORRIDO FOREACH-------\n");
		i = 0;
		for (Persona persona: listaArray) {
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
		
		Iterator<Persona> it = listaArray.iterator();
		
		//Borrar elemento nombre = Mina
		
		while (it.hasNext()) {
			String nombrePersona = it.next().getNombre();
			if (nombrePersona.equals(borrarPersona)) {
				it.remove();
			}
		}
		
		i = 0;
		for (Persona persona: listaArray) {
			System.out.println("["+ i +"]: "
					+ persona.getIdPersona() + ""
					+ persona.getNombre() + ""
					+ persona.getApellido());
			i++;
			
			}
			
		}
	
	}


