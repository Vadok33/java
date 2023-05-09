package bucleFor;

import javax.swing.JOptionPane;

public class Factorial {

	public static void main(String[] args) {
		
		String entrada;
		int num1;
		int fac = 1;
		int res = 1;
		int res2 = 1;
		
		entrada = JOptionPane.showInputDialog("Introduce un número");
		num1 = Integer.parseInt(entrada);
		
		do {
			res = res * fac;
			fac++;
			
		}
		
		while (fac <= num1);
		
		
		JOptionPane.showMessageDialog(null,"---Bucle while---  = " + res);
		
		for (fac = num1; fac > 0; fac--) {
			res2 = res2 * fac;
		}
		fac = num1;
		while (num1 != 1) {
			fac = num1 * fac;
			num1++;
			JOptionPane.showMessageDialog(null,"---Bucle for--- = " + fac);
		}
		

	}

}
