package calculatore;

import java.util.Scanner;

public class Operaciones {

	
	
	
	
	//Metodos operadores
	
	public  void  suma () {
		
		
		
		double resultado;
		
		Scanner sc=new Scanner (System.in);
		double num1 = sc.nextDouble();
		Scanner sc2=new Scanner (System.in);
		double num2 = sc2.nextDouble();
		
		resultado = num1 + num2;
		System.out.println(resultado);
	}
public void resta () {
		
		
		
		double resultado;
		
		Scanner sc=new Scanner (System.in);
		double num1 = sc.nextDouble();
		Scanner sc2=new Scanner (System.in);
		double num2 = sc2.nextDouble();
		
		resultado = num1 - num2;
		System.out.println(resultado);
	}
	
public void multi () {
	
	
	
	double resultado;
	
	Scanner sc=new Scanner (System.in);
	double num1 = sc.nextDouble();
	Scanner sc2=new Scanner (System.in);
	double num2 = sc2.nextDouble();
	
	resultado = num1 * num2;
	System.out.println(resultado);
}

public void divi () {
	
	
	
	double resultado;
	
	Scanner sc=new Scanner (System.in);
	double num1 = sc.nextDouble();
	Scanner sc2=new Scanner (System.in);
	double num2 = sc2.nextDouble();
	
	resultado = num1 / num2;
	System.out.println(resultado);
}
}
