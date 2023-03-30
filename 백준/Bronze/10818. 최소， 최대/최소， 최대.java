import java.io.IOException;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] atgs) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		
		int iMax = -1000000;
		int iMin = 1000000;
		
		int N = sc.nextInt();
		
		int[] array = new int[N];
		
		for(int i = 0; i < N; i++) {
			array[i] = sc.nextInt();
		}
		
		for(int j : array){
			iMax = Math.max(j, iMax);
		}
		for(int j : array){
			iMin = Math.min(j, iMin);
		}
		
		System.out.print(iMin + " " + iMax);
		
		
	}
}
