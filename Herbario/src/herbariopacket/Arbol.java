package herbariopacket;

public class Arbol extends Planta{

	//Atributos
	protected String tipoTronco;
	protected String radioTronco;
	protected String colorHoja;
	
	
	//Constructor
	
	public Arbol() {
		super();
	}
	
	public Arbol(String tipoTronco, String radioTronco, String colorHoja, String nCientifico, String nVulgar, String familia, String variedad, String tamanio, String tiposHoja,
			String flores, String habitat, String geo, String clima, Boolean flor) {
		super(nCientifico, nVulgar, familia, variedad, tamanio, tiposHoja, flores, habitat, geo, clima, flor);
		
		this.tipoTronco = tipoTronco;
		this.radioTronco = radioTronco;
		this.colorHoja = colorHoja;
	}
	

	//Método

	

	@Override
	protected void soy() {
		System.out.println("Soy un arbol y estos son mis atributos: ");
	}
	
	
	
	
	
	
	

	
}
