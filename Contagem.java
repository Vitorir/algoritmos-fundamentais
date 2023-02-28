package orientadaaObjeto;

import java.util.Scanner;

public class Contagem {
		public static void main (String[] args) {
			Scanner dado = new Scanner(System.in);
			
			System.out.print("Número de notas:");
			int n = dado.nextInt(); // numero de notas
			double nota;
			double contagem = 0;
			double i = 0;
			
			while (i < n) {
			    i = i + 1;
			    
			    System.out.print("Nota do aluno:");
			    nota = dado.nextInt();

			    if (nota >= 50) {
			        contagem = contagem + 1;
			    }
			}

			System.out.println("Número de aprovações: " + contagem);
		}
}
