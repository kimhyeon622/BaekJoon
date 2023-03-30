import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
			System.out.print("");
			int N = sc.nextInt();
			
			System.out.print("");
			int X = sc.nextInt();
			
			for (int i = 1; i <= N; i++) {
				System.out.print("");
				int A = sc.nextInt();
				if (X>A) {
					System.out.print(A+" ");
				}
			}
		
	
}}