import java.util.Scanner;

public class Main {
	
	public static void main(String[] atgs) {
		
		int X;
		int N;
		int a;
		int b;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		X = sc.nextInt();
		N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			sum = sum + a*b;
		}
		
		if(X == sum) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
	}
}
