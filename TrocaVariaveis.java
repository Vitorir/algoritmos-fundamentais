package orientadaaObjeto;

import java.util.Scanner;

public class TrocaVariaveis {
	public static void main (String args[]) {
		Scanner dado;
		dado = new Scanner(System.in);
		
		System.out.print("Informe o valor de a: ");
		int a = dado.nextInt();
		System.out.print("Informe o valor de b: ");
		int b = dado.nextInt();
		int aux;

		aux = a;
		a = b;
		b = aux;

		System.out.println("valor da variável A: " + a);
		System.out.println("Novo valor da variavel B: " + b);
	}
}
