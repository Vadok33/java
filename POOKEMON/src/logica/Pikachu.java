package logica;

public class Pikachu extends Pokemon implements IElectrico {

	//Atributos
	String placaje = "Soy PIKACHU y este es mi ataque PLACAJE";
	String araniazo = "Soy PIKACHU y este es mi ataque ARAÑAZO";
	String mordisco = "Soy PIKACHU y este es mi ataque MORDISCO";
	String itrueno = "Soy PIKACHU y este es mi ataque especial IMPACTRUENO";
	String ptrueno = "Soy PIKACHU y este es mi ataque especial PUÑO TRUENO";
	
	
	
	
	//Definir métodos
	
	public Pikachu() {
		super();
	
	}
	public Pikachu(String numPokedex, String nombre, String altura, String peso, String categoria, String habilidad) {
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
	public void atacarImpac() {
		System.out.println(itrueno);
	}
	public void atacarPtrueno() {
		System.out.println(ptrueno);
	}
	
	
	
	
	
	

	
	
		
		
	
}
