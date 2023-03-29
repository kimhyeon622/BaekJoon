import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int A;
		int B;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("");
		A = sc.nextInt();
		
		System.out.print("");
		B = sc.nextInt();
		
		if ( A > B ) {
			System.out.println(">");
		}
		else if (A < B) {
			System.out.println("<");
			
		}
		else if (A == B) {
			System.out.println("==");
		}
		
		

	}

}
