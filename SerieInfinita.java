package orientadaaObjeto;

import java.util.Scanner;

public class SerieInfinita {
		
	public static long fatorial(int n) {
		long fator = 1;
		
		for (int i = 1; i <= n; i++) {
	        fator = i * fator;
	    }

		
		return fator;
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			
		
		System.out.print("Número de termos:");
		int n = scanner.nextInt();
		System.out.println("Valor de x: ");
		double x = scanner.nextDouble();

		double termo;
		double s = 0;
		int i = -1;
		int sinal = -1;

		for (int j = 1; j <= n; j++) {
		    i = i + 2;
		    sinal = -sinal;
		    termo = sinal * Math.pow(x, i) / fatorial(i);
		    s = s + termo;
		}
		
		System.out.print("S = " + s);

	}

}
