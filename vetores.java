package orientadaaObjeto;

import java.util.Scanner;

public class vetores {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n =  s.nextInt();
		double notas[] = new double[n];
		
		for (int i = 0; i < n; i++) {
			notas[i] = s.nextDouble();
		}
		
		// Algoritmo do somatório
		double soma = 0;
		
		for (int i = 0; i < n; i++) {
			soma = soma + notas[i];
		}
		// MOSTRAR A MEDIA
		System.out.println("Média é: " + soma / n);
		
		// CONTAGEM
		int contador = 0;
		for (int i = 0; i < 4; i++) {
			if (notas[i] > 6) {
				contador = contador + 1;
			}
		}
		System.out.println("Notas maiores do que 6: " + contador);
		
		// MAIOR E MENOR
		
	}

}
