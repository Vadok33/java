package herbariopacket;

public class Arbusto extends Planta {

	//Atributos
	
	
	String ancho;
	String colorHojas;
	String follaje;
	
	//Constructor
	
	public Arbusto() {
		super();
		
	}
	public Arbusto(String ancho, String colorHojas, String follaje, String nCientifico, String nVulgar, String familia, String variedad, String tamanio,
			String tiposHoja, String flores, String habitat, String geo, String clima, Boolean flor) {
		super(nCientifico, nVulgar, familia, variedad, tamanio, tiposHoja, flores, habitat, geo, clima, flor);
		
		this.ancho = ancho;
		this.colorHojas = colorHojas;
		this.follaje = follaje;
	}
	
	//Métodos
	
	@Override
	protected void soy() {
		System.out.println("Soy un arbusto");
	
		
	}
	


}




