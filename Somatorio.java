package orientadaaObjeto;

import java.util.Scanner;

public class Somatorio {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// Problema  : Dado um conjunto de n números, calcular a soma desses números.
		
		System.out.println("Quantidade de numeros: ");
		double n = s.nextDouble();
		double soma = 0;
		int numero;
		
		for (int i = 0; i < n; i++) {
			numero = s.nextInt();
			soma = soma + numero;
		}
		
		System.out.println("Soma: " + soma);
	}

}
