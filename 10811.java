import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] array = new int[N+1];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		
		for(int i = 0; i < M; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			for(int j = 0; (start+j) <= (end-j); j++) {
				int ar = array[start+j];
				array[start+j] = array[end-j];
				array[end-j] = ar;	
			}
		}
		
		for(int i = 1; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}

	}

}
