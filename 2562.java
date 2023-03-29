import java.util.Iterator;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int B = 0;
		int[] S = null;
		int max=0;

		S = new int [9];
		
		for (int i = 0; i < S.length; i++) {
			System.out.print("");
			int A = sc.nextInt();
			
			S[i] = A;
			
			if (max < A) {
			max = S[i];
			B = i+1;
			}
		}
		System.out.println(max);
		System.out.print(B);
	
}}
