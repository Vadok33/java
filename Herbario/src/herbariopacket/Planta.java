package herbariopacket;

public abstract class Planta {
	
	//Atributos comunes
	
	String nCientifico;
	String nVulgar;
	String familia;
	String variedad;
	String tamanio;
	String tiposHoja;
	String flores;
	String habitat;
	String geo;
	String clima;
	Boolean flor;
	
	
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

	
	
	
	
	
	// Métodos abstractos
	


	public abstract void soyArbol();
	public abstract void soyHerbacea();
	public abstract void soyArbusto();
	
	
	
	
	

}
