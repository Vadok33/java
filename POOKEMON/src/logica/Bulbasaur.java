package logica;

public class Bulbasaur extends Pokemon implements IPlanta {

	//Atributos
	String placaje = "Soy BULBASAUR y este es mi ataque PLACAJE";
	String araniazo = "Soy BULBASAUR y este es mi ataque ARAÑAZO";
	String mordisco = "Soy BULBASAUR y este es mi ataque MORDISCO";
	String drenaje = "Soy BULBASAUR y este es mi ataque especial DRENAJE";
	String paralizar = "Soy BULBASAUR y este es mi ataque especial PARALIZAR";
	
	
	
	
	//Definir métodos
	
	public Bulbasaur() {
		super();
	
	}
	public Bulbasaur(int numPokedex, String nombre, double altura, double peso, String categoria, String habilidad) {
		super(numPokedex, nombre, altura, peso, categoria, habilidad);
	
	}
	@Override
	public void atacarPlacaje() {
		System.out.println(placaje);
	}
	public void atacarAraniazo() {
		System.out.println(araniazo);
	}
	public void atacarMordisco() {
		System.out.println(mordisco);
	}
	public void atacarDrenaje() {
		System.out.println(drenaje);
	}
	public void atacarParalizar() {
		System.out.println(paralizar);
	}
	
	
	
	
	
	

	
	
		
		
	
}
