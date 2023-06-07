package herbariopacket;

public abstract class Planta {
	
	//Atributos comunes
	
	protected String nCientifico;
	protected String nVulgar;
	protected String familia;
	protected String variedad;
	protected String tamanio;
	protected String tiposHoja;
	protected String flores;
	protected String habitat;
	protected String geo;
	protected String clima;
	protected Boolean flor;
	
	//Constructor
	
	public Planta() {
		
	}
	public Planta(String nCientifico, String nVulgar, String familia, String variedad, String tamanio, String tiposHoja,
			String flores, String habitat, String geo, String clima, Boolean flor) {
		
		this.nCientifico = nCientifico;
		this.nVulgar = nVulgar;
		this.familia = familia;
		this.variedad = variedad;
		this.tamanio = tamanio;
		this.tiposHoja = tiposHoja;
		this.flores = flores;
		this.habitat = habitat;
		this.geo = geo;
		this.clima = clima;
		this.flor = flor;
	}
	
	//Método Abstracto
	


	protected abstract void soy();
	
	
	
	
	
	

}
