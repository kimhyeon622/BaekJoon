import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("");
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N-i; j++) {
				System.out.print(" ");
			}
			for (int j2 = 2; j2 <= 1+i; j2++) {
				System.out.print("*");  			
			}
			for (int j = 1; j <= 5-i; j++) {
				System.out.print("");
			}System.out.println();
		}
		
	
}}
