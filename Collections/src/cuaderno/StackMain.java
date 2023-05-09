package cuaderno;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		
		//Inicio
		System.out.println("\n Inicio del programa");
		System.out.println("\n Por Álvaro Elena");
		
		//Variables 
		int i;
		
		//Declarar Stack
		Stack<Persona> pila = new Stack<Persona>();
		
		// Pila vacía
		System.out.println("\n Pila vacía (isEmpty)"
				 + "\n------------");
		System.out.println("\n Pila: " + pila);
		System.out.println("Está vacía? " + pila.isEmpty());
		
		
		//Añadir elemento a la pila
		 System.out.println("\n------------"
				 + "\nAñadir elementos a la pila (push)"
				 + "\n------------");
		 
		 //Iniciar Stack
		pila.push(new Persona(1,"Farlok","Melenas","55555555B"));
		pila.push(new Persona(2,"Ana","Busado","44444444B"));
		pila.push(new Persona(3,"Querri","Caberga","33333333B"));
		pila.push(new Persona(4,"Mina","Botieso","22222222B"));
		
		// Mostrar Pila
		
		System.out.println("\n Mostrar pila" 
				+ "\n------------");
		System.out.println("\n Pila: " + pila);
		System.out.println("Está vacía? " + pila.isEmpty());
		
		//Recorrido
		System.out.println("\n Recorrido"
				+ "\n----------");
		i = 0;
		for (Persona pilaAux: pila) {
			System.out.println("["+ i +"]:"
					+ pilaAux.getIdPersona() + ""
					+ pilaAux.getNombre() + ""
					+ pilaAux.getApellido());
			i++;
			
		}
		
		// Ultimo elemento
		System.out.println("\n Ultimo elemento (peek)"
				+ "\n---------------------"
				+ "\nUltimo elemento: " + pila.peek());
		
		// Borrar el ultimo elemento (pop)
		
		System.out.println("\n Borrar ultimo elemento (pop)"
				+ "\n-------------------");
		pila.pop();
		System.out.println("Pila: " + pila);
		
		// Buscar elemento (Search)
		
		System.out.println("\n Buscar elemento (Mina)"
				+ "\n-----------------");
		String nombrePersona = "Mina";
		i=0;
		for(Persona pilaAux: pila) {
			if (pilaAux.getNombre().equals(nombrePersona)){
				System.out.println("["+ i +"]:"
						+ pilaAux.getIdPersona() + ""
						+ pilaAux.getNombre() + ""
						+ pilaAux.getApellido());
				break;
				
				
			}
			i++;
		}

	}

}
