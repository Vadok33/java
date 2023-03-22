package logica;

public class Squirtle extends Pokemon implements IAgua {

	//Atributos
	String placaje = "Soy SQUIRTLE y este es mi ataque PLACAJE";
	String araniazo = "Soy SQUIRTLE y este es mi ataque ARAÑAZO";
	String mordisco = "Soy SQUIRTLE y este es mi ataque MORDISCO";
	String hidro = "Soy SQUIRTLE y este es mi ataque especial HIDROBOMBA";
	String burbuja = "Soy SQUIRTLE y este es mi ataque especial BURBUJA";
	String pistola = "Soy SQUIRTLE y este es mi ataque especial PISTOLA AGUA";
	
	
	
	
	//Definir métodos
	
	public Squirtle() {
		super();
	
	}
	public Squirtle(int numPokedex, String nombre, double altura, double peso, String categoria, String habilidad) {
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
	public void atacarHidro() {
		System.out.println(hidro);
	}
	public void atacarBurbuja() {
		System.out.println(burbuja);
	}
	public void atacarPistola() {
		System.out.println(pistola);
	}
	
	
	
	
	
	

	
	
		
		
	
}
