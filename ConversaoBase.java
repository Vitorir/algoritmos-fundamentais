package orientadaaObjeto;

import java.util.Scanner;

public class ConversaoBase {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Número inteiro decimal:");
		int n = s.nextInt();

		int q = n;
		int ndigit = 0;
		int r;
		int binario[] = new int[100];

		do {
			r = q % 2;
		    binario[ndigit] = r;
		    ndigit = ndigit + 1;
		    q = q / 2; // nao precisa usar math.trunc
		} while (q != 0);

		System.out.print("Número binário: ");

		for (int i = ndigit-1; i >= 0; i--) {
		    System.out.print(binario[i]);
		}

	}

}
