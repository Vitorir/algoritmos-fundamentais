package orientadaaObjeto;
import java.util.Scanner;

public class Fibonacci2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = 0;
		int b = 1;
		int aux;
		System.out.println(a);
		System.out.println(b);
		
		int n = s.nextInt();
		
		// solução 1
		for (int i = 0; i < n; i++) {
			System.out.println(a + b);
			aux = b; // 2
			b = a + b; // 1 + 2 = 3
			a = aux; // 2
		}  // 0, 1, 1, 2, 3, 
		
		/* solução 2
		for (int i = 0; i < n; i++) {
			System.out.println(a + b);
			b = a + b;
			b = b - a;
		*/
		}
	}
