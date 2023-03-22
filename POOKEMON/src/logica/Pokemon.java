package logica;

public abstract class Pokemon {
	
	//Atributos

	protected int numPokedex; 
	protected String nombre;
	protected double altura;
	protected double peso;
	protected String categoria;
	protected String habilidad;
	
	//Constructores
	
	protected Pokemon() {
		
	}
	protected Pokemon (int numPokedex,String nombre,double altura,double peso,String categoria,String habilidad) {
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
