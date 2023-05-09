package herbariopacket;

public abstract class Arbol extends Planta{

	//Atributos
	String tipoTronco;
	String radioTronco;
	String colorHoja;
	
	
	public Arbol() {
		super();
	
	
	public Arbol(String tipoTronco, String radioTronco, String colorHoja) {
		super();
		this.tipoTronco = tipoTronco;
		this.radioTronco = radioTronco;
		this.colorHoja = colorHoja;
	}





	@Override
	public void soyArbol() {
		System.out.println("Soy un Arbol");
		
	}
	
	
	
	
	

	
}
