import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		while (run) {
			System.out.print("");
			int A = sc.nextInt();
			
			System.out.print("");
			int B = sc.nextInt();
			
			if(A == 0 && B == 0) {
				run = false;
				continue;
			}
			
			System.out.println(A+B);
		}
	
}}