package aleatorios;
import java.util.Random;



public class AleatoriosEntreNumeros {

	public static void main(String[] args) {
	
		//Variables y array
		
		int cantidadNumeros = 5;
        int minimo = 14;
        int maximo = 30;
        int[] miArray = new int [cantidadNumeros];
        
        //Llamar método
        
        numerosAleatorios(miArray, minimo, maximo);

        //Mensaje bienvenida
		
      	System.out.println("\n*** Programa desarrollado por Álvaro Elena***");
      	System.out.println("\n Numeros aleatorios entre un mínimo y un máximo");
        
        // Mostrar array
        for (int i = 0; i < miArray.length; i++) {
            System.out.println(miArray[i]);
	}
}

		// Método para generar numeros aleatorios y almacenarlos en array
public static void numerosAleatorios(int[] miArray, int minimo, int maximo){
    	
		
		Random random = new Random();
		for (int i = 0; i < miArray.length; i++) {
            int numeroAleatorio = random.nextInt(maximo - minimo + 1) + minimo;
            miArray[i] = numeroAleatorio;
        }
    }
	
}