import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		int N2=0;
		int S;
		int A;
		int B;
		int C;
		int count = 0;
		
		System.out.print("");
		N = sc.nextInt();
		N2 = N;
		do{	
			A = N/10;
			B = N%10;
			C = N/10 + N%10;
			N = B*10 + C%10;
			count++;
		}
		while(N != N2);
		System.out.println(count);
	
}}