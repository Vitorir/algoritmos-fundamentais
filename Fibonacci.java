package orientadaaObjeto;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Número de termos:");
		int n = s.nextInt();

		int a = 0;
		int b = 1;
		int i = 2;
		int c;

		if (n == 1) {
		    System.out.print(a);
		} else {
		    System.out.print(a + " " + b);
		}

		while (i < n) {
			i = i + 1;
		    c = a + b;
		    System.out.print(", " + c);
		    a = b;
		    b = c;
		}
	}

}
