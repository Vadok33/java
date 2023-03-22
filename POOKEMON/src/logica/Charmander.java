package logica;

public class Charmander extends Pokemon implements IFuego {

	//Atributos
	String placaje = "Soy CHARMANDER y este es mi ataque PLACAJE";
	String araniazo = "Soy CHARMANDER y este es mi ataque ARAÑAZO";
	String mordisco = "Soy CHARMANDER y este es mi ataque MORDISCO";
	String punio = "Soy CHARMANDER y este es mi ataque especial PUÑO DE FUEGO";
	String lanza = "Soy CHARMANDER y este es mi ataque especial LANZALLAMAS";
	String ascua = "Soy CHARMANDER y este es mi ataque especial ASCUAS";
	
	
	
	//Definir métodos
	
	public Charmander() {
		super();
	
	}
	public Charmander(int numPokedex, String nombre, double altura, double peso, String categoria, String habilidad) {
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
	public void atacarPunio() {
		System.out.println(punio);
	}
	public void atacarLanza() {
		System.out.println(lanza);
	}
	public void atacarAscua() {
		System.out.println(ascua);
	}
	
	
	
	
	
	

	
	
		
		
	
}
