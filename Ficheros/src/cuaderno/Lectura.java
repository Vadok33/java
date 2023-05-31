package cuaderno;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Lectura {

	public static void main(String[] args) {
		
		
		System.out.println("\n Inicio del programa");
		
		String ruta = ""
		
		String
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fichero));
			do {
				linea = reader.readLine();
				if (linea!=null) System.out.println(linea);
			} while (linea!=null);
			reader.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("\n Error: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("\n Error: " + e.getMessage());
		}
		
		
		

	}

}
