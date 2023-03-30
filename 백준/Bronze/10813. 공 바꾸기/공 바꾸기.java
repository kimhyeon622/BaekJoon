import java.io.IOException;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] atgs) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] array = new int[N+1];
		
		int i = 0;
		int j = 0;
		
		for(int cnt = 0; cnt < array.length; cnt++) {
			array[cnt] = cnt;
		}
		
		for(int cnt = 0; cnt < M; cnt++) {
			i = sc.nextInt();
			j = sc.nextInt();
			
			int ch = array[i];
			array[i] = array[j];
			array[j] = ch;
		}
		for(i = 1; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
