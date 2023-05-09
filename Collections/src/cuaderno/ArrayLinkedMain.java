package cuaderno;


import java.util.ArrayList;
import java.util.LinkedList;


public class ArrayLinkedMain {

	public static void main(String[] args) {
		
			//Inicio
				System.out.println("\n Inicio del programa");
				System.out.println("\n Por Álvaro Elena");
				
			//Variables
				int i, elemento;
				String borrarPersona;
				boolean elementoEncontrado;
				
				// Declarar ARRAYLIST
				ArrayList<Persona> listaArray = new ArrayList<>();
				
				// Cargar ARRAYLIST
				listaArray.add(0, new Persona(1,"Farlok","Melenas","55555555B"));
				listaArray.add(1, new Persona(2,"Ana","Busado","44444444B"));
				listaArray.add(2, new Persona(3,"Querri","Caberga","33333333B"));
				listaArray.add(3, new Persona(4,"Mina","Botieso","22222222B"));
				
				// Declarar LINKEDLIST
				LinkedList<Persona> listaLinked = new LinkedList<>();
				
				// Cargar LINKEDLIST
				listaLinked.add(0, new Persona(1,"Farlok","Melenas","55555555B"));
				listaLinked.add(1, new Persona(2,"Ana","Busado","44444444B"));
				listaLinked.add(2, new Persona(3,"Querri","Caberga","33333333B"));
				listaLinked.add(3, new Persona(4,"Mina","Botieso","22222222B"));
				
				// Mostrar contenido de las listas
				
				System.out.println("\n------------"
								+ "\n Mostrar contenido de ambas Colecciones (forEach)"
								+ "\n------------");
				
				// Recorrido forEach con LINKEDLIST
					
				System.out.println("\n LinkedList"
						+ "\n---------");
				i = o;
				for (Persona persona: listaLinked) {
					System.out.println("["+ i +"]:"
							+ persona.getIdPersona() + ""
							+ persona.getNombre() + ""
							+ persona.getApellido());
					i++;
				}
				
				//Borrar instancia de persona
				
				borrarPersona = "Farlok";
				
				System.out.println("\n------------"
								+ "\n Borrar objeto con nombre " + borrarPersona + "(método, remove)"
								+ "\n------------");
				
		

				
				//ARRAYLIST
				
				//Borrar persona en arrayList
				
				elementoEncontrado = false;
				for(Persona persona:listaArray) {
					if (persona.getNombre().equals(borrarPersona)) {
						listaArray.remove(Persona);
						elementoEncontrado = true;
						break;
						
					}
					
				}
				
				//Si la persona no existe
				if (elementoEncontrado) {
					System.out.println("ArrayList: " + borrarPersona + "Elemento no encontrado!");
				} else {
					//Recorrido forEach
					System.out.println("ArrayList"
							+ "\n----------");
					i = 0;
					for (Persona persona: listaArray) {
						System.out.println("["+ i +"]:"
								+ persona.getIdPersona() + ""
								+ persona.getNombre() + ""
								+ persona.getApellido());
						i++;
					}
				}
				
				//Borrar persona en LinkedList
				elementoEncontrado = false;
				for(Persona persona:listaLinked) {
					if(persona.getNombre().equals(borrarPersona)) {
						listaLinked.remove(persona);
						elementoEncontrado = true;
						break;
						
					}
					
				}
				
				//Si la persona no existe
				
				if (!elementoEncontrado) {
					System.out.println("LinkedList: "+ borrarPersona + "Elemento no encontrado!");
				} else {
						//Recorrido forEach
						System.out.println("LinkedList"
								+ "\n----------");
						i = 0;
						for (Persona persona: listaLinked) {
							System.out.println("["+ i +"]:"
									+ persona.getIdPersona() + ""
									+ persona.getNombre() + ""
									+ persona.getApellido());
							i++;
						}
				}
				
				// Otros Métodos
				
				// Tamaño de la lista(size)
				System.out.println("\n-----------------------"
						+ "\n Tamaño de ambas listas (método .size)"
						+ "\n-----------------------");
				System.out.println("ArrayList : " + listaArray.size());
				System.out.println("LinkedList : " + listaLinked.size());
				
				// Obtener primer y último elemento (LinkedList)
				
				System.out.println("\n-----------------------"
						+ "Primer y ultimo elemento (LinkedList)"
						+ "\n-----------------------");
				System.out.println("Primer elemento (getFirst): " + listaLinked.getFirst().toString());
				System.out.println("Primer elemento (getFirst): " + listaLinked.getFirst().getNombre());
				System.out.println("Último elemento (getLast): " + listaLinked.getLast().toString());
				System.out.println("Último elemento (getLast): " + listaLinked.getLast().getNombre());
				
				// Borrar toda la lista (CLEAR)
				System.out.println("\n-----------------------"
						+ "\n Borrar listas (Método .clear)"
						+ "\n-----------------------");
				listaArray.clear();
				listaLinked.clear();
				
				// Comprobar si la lista está vacía (isEmpty)
				
				System.out.println("\n-----------------------"
						+ "\nComprobar si la lista está vacía (isEmpty)"
						+"\n-----------------------");
				
				System.out.println("ArrayList " + listaArray.isEmpty());
				System.out.println("LinkedList " + listaLinked.isEmpty());
				
	}

}
