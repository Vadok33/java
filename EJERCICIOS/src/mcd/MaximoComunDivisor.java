package mcd;
import java.util.Scanner;

public class MaximoComunDivisor {

	public static void main(String[] args) {
		
		//Mensaje bienvenida
			
			
		System.out.println("\n***Programa desarrollado por Álvaro Elena***");
		System.out.println("\n\nM.C.D");
		
		//Ingresar el primer número
			
		Scanner entrada = new Scanner(System.in);
		        
	    System.out.print("Ingrese el primer número: ");
	    int numero1 = entrada.nextInt();
	    
	    //Ingresar el segundo número
	    
	    System.out.print("Ingrese el segundo número: ");
	    int numero2 = entrada.nextInt();
	    
	    //La variable mcd obtiene el valor del método
	    
	    int mcd = calcularMCD(numero1, numero2);
	    
	    System.out.println("El máximo común divisor entre " + numero1 + " y " + numero2 + " es: " + mcd);
	    
	    //Mensaje final
        
        System.out.println("\n\n*** FIN DEL PROGRAMA ***");
	}
	
	//Método para calcular el mcd
	
	public static int calcularMCD(int a, int b) {

	    while (b != 0) {
	        int calc = b;
	        b = a % b;
	        a = calc;
	    }
	    
	    return a;

	}

}
