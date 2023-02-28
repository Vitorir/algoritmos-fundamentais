package orientadaaObjeto;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int fator = 1;
		
		for (int i = 0; i <= n; i++) {
			fator = i * fator;
			
		}
		System.out.println("Fatorial: " + fator);
	}

}
