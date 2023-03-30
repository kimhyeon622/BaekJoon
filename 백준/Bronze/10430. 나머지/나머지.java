import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int A;
		int B;
		int C;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("");
		A = sc.nextInt();
		
		System.out.print("");
		B = sc.nextInt();
		
		System.out.print("");
		C = sc.nextInt();
		
		System.out.println( (A+B)%C );
		System.out.println( ((A%C) + (B%C))%C );
		System.out.println( (A*B)%C );
		System.out.println( ((A%C) * (B%C))%C );
		

	}

}