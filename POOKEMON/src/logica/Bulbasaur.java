package logica;

public class Bulbasaur extends Pokemon implements IPlanta {

	//Atributos
	

	//Implementar métodos
	
	
	
	@Override
	public void atacarPlacaje() {
		System.out.println("Soy BULBASAUR y este es mi ataque PLACAJE");
	}
	public void atacarAraniazo() {
		System.out.println("Soy BULBASAUR y este es mi ataque ARAÑAZO");
	}
	public void atacarMordisco() {
		System.out.println("Soy BULBASAUR y este es mi ataque MORDISCO");
	}
	public void atacarDrenaje() {
		System.out.println("Soy BULBASAUR y este es mi ataque especial DRENAJE");
	}
	public void atacarParalizar() {
		System.out.println("Soy BULBASAUR y este es mi ataque especial PARALIZAR");
	}
	
	public Bulbasaur() {
		super();
		
	}
	public Bulbasaur(int numPokedex, String nombre, double altura, double peso, String categoria, String habilidad) {
		super(numPokedex, nombre, altura, peso, categoria, habilidad);
		
	}
	
	
	//Constructor
	
	
	
	
	
	

	
	

	
	
		
		
	
}
