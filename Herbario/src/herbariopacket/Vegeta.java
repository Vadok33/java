package herbariopacket;

import java.util.Scanner;


public class Vegeta {

	public static void main(String[] args) {
		
		
		//Crear objetos
		
		Arbol arce = new Arbol();
		Arbusto arbusto1 = new Arbusto();
		Herbacea herbacea1 = new Herbacea();
		int opcion = 0;
		
		
		//Atributos comunes Arbol
		
		arce.nCientifico = "Acer palmatum";
		arce.nVulgar = "Arce japonés";
		arce.familia = "Sapindaceae";
		arce.variedad = "Magnoliosida";
		arce.tamanio = "6-10 metros";
		arce.tiposHoja = "hoja caduca";
		arce.flores = " 5 pétalos de color blanco";
		arce.habitat = "";
		arce.geo = "Japón y Corea del Sur.";
		arce.clima = "Frio";
		arce.flor = false;
		
		//Atributos individuales Arbol
		
		arce.tipoTronco = "varios";
		arce.radioTronco = "0,5";
		arce.colorHoja = "Color verde, roja o púrpura";
		
		//Atributos comunes Arbusto
		
		arbusto1.nCientifico = "Acer palmatum";
		arbusto1.nVulgar = "Arce japonés";
		arbusto1.familia = "Sapindaceae";
		arbusto1.variedad = "Magnoliosida";
		arbusto1.tamanio = "6-10 metros";
		arbusto1.tiposHoja = "hoja caduca";
		arbusto1.flores = " 5 pétalos de color blanco";
		arbusto1.habitat = "";
		arbusto1.geo = "Japón y Corea del Sur.";
		arbusto1.clima = "Frio";
		arbusto1.flor = false;
		
		//Atributos individuales Arbusto
		
		arbusto1.ancho = "12";
		arbusto1.colorHojas = "Verde";
		arbusto1.follaje = "Denso";
		
		//Atributos comunes Herbacea
		
		herbacea1.nCientifico = "Acer palmatum";
		herbacea1.nVulgar = "Arce japonés";
		herbacea1.familia = "Sapindaceae";
		herbacea1.variedad = "Magnoliosida";
		herbacea1.tamanio = "6-10 metros";
		herbacea1.tiposHoja = "hoja caduca";
		herbacea1.flores = " 5 pétalos de color blanco";
		herbacea1.habitat = "Selvático";
		herbacea1.geo = "Japón y Corea del Sur.";
		herbacea1.clima = "Frio";
		herbacea1.flor = false;
		
		//Atributos individuales Herbacea
		
		herbacea1.formaHoja = "Estrella";
		herbacea1.tamaniohoja = "Pequeña";
		herbacea1.temporada = "Verano";
		herbacea1.colorPetalos = "Azules";
		herbacea1.cantidadPetalos = "Media";
		herbacea1.colorPistilo = "Amarrilo";
		herbacea1.variedadFlor = "Ambus";
		herbacea1.estacionFlor = "Otoño";
		
		
		//Mensaje bienvenida
		
		System.out.println("\n***Programa desarrollado por Álvaro Elena***");
		System.out.println("\n\nBienvenido al Herbario de Álvaro");
		System.out.println("\nSeleccione una opción para ver más información");
		
		//Bucle y Switch para seleccionar la opción
		
		do {
					
					System.out.println("\n\t0. Salir\n\t1. Arbol\n\t2. Arbusto\n\t3. Herbacea");
					Scanner sc = new Scanner(System.in);
					
					opcion = sc.nextInt();
					
					
					
				switch (opcion) {
				
				case 0:
					System.out.println("Gracias por usar el programa");
					break;
				case 1:
					arce.soy();
					System.out.println("\n Nombre cientifico: " + arce.nCientifico +
								"\n Nombre vulgar: " + arce.nVulgar + 
								"\n Familia: " + arce.familia + 
								"\n Variedad:" + arce.variedad + 
								"\n Tamaño: " + arce.tamanio + 
								"\n Tipo de hoja: " + arce.tiposHoja + 
								"\n Flores: " + arce.flores + 
								"\n Habitat: " + arce.habitat + 
								"\n Geografía: " + arce.geo + 
								"\n Clima: " + arce.clima + 
								"\n Flor: " + arce.flor + 
								"\n Tipo de tronco: " + arce.tipoTronco + 
								"\n Radio del tronco: " + arce.radioTronco + 
								"\n Color de la hoja: " + arce.colorHoja);
					break;
				case 2:
					arbusto1.soy();
					System.out.println("Nombre cientifico: " + arbusto1.nCientifico +
							"\n Nombre vulgar: " + arbusto1.nVulgar + 
							"\n Familia: " + arbusto1.familia + 
							"\n Variedad:" + arbusto1.variedad + 
							"\n Tamaño: " + arbusto1.tamanio + 
							"\n Tipo de hoja: " + arbusto1.tiposHoja + 
							"\n Flores: " + arbusto1.flores + 
							"\n Habitat: " + arbusto1.habitat + 
							"\n Geografía: " + arbusto1.geo + 
							"\n Clima: " + arbusto1.clima + 
							"\n Flor: " + arbusto1.flor + 
							"\n Ancho del arbusto: " + arbusto1.ancho + 
							"\n Color de las hojas: " + arbusto1.colorHojas + 
							"\n Follaje: " + arbusto1.follaje);
					break;
				case 3:
					herbacea1.soy();
					System.out.println("Nombre cientifico: " + arce.nCientifico +
							"\n Nombre vulgar: " + herbacea1.nVulgar + 
							"\n Familia: " + herbacea1.familia + 
							"\n Variedad:" + herbacea1.variedad + 
							"\n Tamaño: " + herbacea1.tamanio + 
							"\n Tipo de hoja: " + herbacea1.tiposHoja + 
							"\n Flores: " + herbacea1.flores + 
							"\n Habitat: " + herbacea1.habitat + 
							"\n Geografía: " + herbacea1.geo + 
							"\n Clima: " + herbacea1.clima + 
							"\n Flor: " + herbacea1.flor + 
							"\n Forma de la hoja: " + herbacea1.formaHoja + 
							"\n Tamaño de la hoja: " + herbacea1.tamaniohoja + 
							"\n Temporada: " + herbacea1.temporada +
							"\n Color de los pétalos: " + herbacea1.colorPetalos +
							"\n Cantidad de pétalos: " + herbacea1.cantidadPetalos +
							"\n Color del pistilo: " + herbacea1.colorPistilo +
							"\n Variedad de la flor: " + herbacea1.variedadFlor +
							"\n Estación de la flor: " + herbacea1.estacionFlor);
					break;
					default:
						System.out.println("Debe seleccionar una opción");
				
				
				}
				}	
					
					while (opcion != 0);
		

	}

}
