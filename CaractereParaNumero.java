package orientadaaObjeto;

import java.util.Scanner;

public class CaractereParaNumero {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite numero inteiro: ");
		
		String numero = s.next();
		int n = numero.length();
		int digito;
		int base = 48;
		int decimal = 0;
		
		for (int i = 0; i < n; i++) {
			digito = ((int) numero.charAt(i) - base);
			decimal = decimal * 10 + digito;
		}
		System.out.println("Formato decimal: " + decimal);
	}

}
