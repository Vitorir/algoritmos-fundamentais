package orientadaaObjeto;

import java.util.Scanner;

public class ConversaoTipos {
		// ParseInt, ParseFloat
		public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		// System.out.print("Numero inteiro: ");
		String numero = s.next();
		int n = numero.length();
		int decimal = 0;
		int base = 48;
		// int digito;
		
		for (int i = 0; i < n; i++) {
		    int digito = ((int) numero.charAt(i)) - base; // Pega o caractere do indice, converte para o inteiro ASCII(49, 50, 51,...) e diminui da base
		    decimal = decimal * 10 + digito; // utilizando do artificio "casting"
		}

		System.out.println("Formato decimal: " + decimal);
	}
}