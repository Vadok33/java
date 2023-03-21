package logica;

public abstract class Pokemon {
	
	//Atributos

	protected String numPokedex; 
	protected String nombre;
	protected String altura;
	protected String peso;
	protected String categoria;
	protected String habilidad;
	
	//Constructores
	
	protected Pokemon() {
		
	}
	protected Pokemon (String numPokedex,String nombre,String altura,String peso,String categoria,String habilidad) {
		this.numPokedex = numPokedex;
		this.nombre = nombre;
		this.altura = altura;
		this.peso = peso;
		this.categoria = categoria;
		this.habilidad = habilidad;
	}
	
	//Métodos abstractos
	
	
	public abstract void atacarPlacaje();
	public abstract void atacarAraniazo();
	public abstract void atacarMordisco();
	
}
