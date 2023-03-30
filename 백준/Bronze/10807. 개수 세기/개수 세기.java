import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] atgs) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] array = new int[N];
		
		for(int i = 0; i < N; i++) {
			array[i] = sc.nextInt();
		}
		
		int v = sc.nextInt();
		int sum = 0;

		for(int k : array) {
			if(k == v) {
				sum ++;
			}
		}
		
		System.out.println(sum);
	}
}
