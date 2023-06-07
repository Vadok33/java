package herbariopacket;

public class Herbacea extends Planta{

	
	//Atributos
	
	String formaHoja;
	String tamaniohoja;
	String temporada;
	String colorPetalos;
	String cantidadPetalos;
	String colorPistilo;
	String variedadFlor;
	String estacionFlor;
	
	
	//Constructor
	
	public Herbacea() {
		super();
		
	}
	public Herbacea(String estacionFlor, String variedadFlor, String colorPistilo, String cantidadPetalos, String colorPetalos, String temporada, String tamaniohoja, String formaHoja, String nCientifico, String nVulgar, String familia, String variedad, String tamanio,
			String tiposHoja, String flores, String habitat, String geo, String clima, Boolean flor) {
		super(nCientifico, nVulgar, familia, variedad, tamanio, tiposHoja, flores, habitat, geo, clima, flor);
		this.formaHoja = formaHoja;
		this.tamaniohoja = tamaniohoja;
		this.temporada = temporada;
		this.colorPetalos = colorPetalos;
		this.cantidadPetalos = cantidadPetalos;
		this.colorPistilo = colorPistilo;
		this.variedadFlor = variedadFlor;
		this.estacionFlor = estacionFlor;		
	}
	
	
	//Método
	
	
	@Override
	protected void soy() {
		System.out.println("Soy una herbacea y estos son mis atributos: ");
		
	}
	
	
	
	
	
	
	
	
	}
	

