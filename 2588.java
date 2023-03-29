import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int A;
		int B;
		int C;
		int D;
		int E;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("");
		A = sc.nextInt();
		
		System.out.print("");
		B = sc.nextInt();
		
		
		C = B % 10;
		System.out.println( A*C );
		D = ((B-C) % 100)/10;
		System.out.println( A*D );
		E = ((B-D-C) % 1000)/100;
		System.out.println( A*E );
		System.out.println( A*B );
		

	}

}
