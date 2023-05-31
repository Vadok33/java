package herbariopacket;

public class Arbol extends Planta implements IArbol{

	//Atributos
	String tipoTronco;
	String radioTronco;
	String colorHoja;
	
	
	
	
	
	//Constructor
	
	public Arbol() {
		super();
	}
	
	public Arbol(String nCientifico, String nVulgar, String familia, String variedad, String tamanio, String tiposHoja,
			String flores, String habitat, String geo, String clima, Boolean flor) {
		super(nCientifico, nVulgar, familia, variedad, tamanio, tiposHoja, flores, habitat, geo, clima, flor);
		
	}
	

	public Arbol(String tipoTronco, String radioTronco, String colorHoja) {
		super();
		this.tipoTronco = tipoTronco;
		this.radioTronco = radioTronco;
		this.colorHoja = colorHoja;
	}



	//Métodos


	@Override
	public void soyArbol() {
		System.out.println("Soy un Arbol");
		
	}
	
	
	
	
	

	
}
