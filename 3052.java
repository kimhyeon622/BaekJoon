import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[10];

		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt()%42;
			
		}
		
		int cnt = 0;
		int num = -1;
		
		Arrays.sort(array);
		
		for(int i = 0; i < array.length; i++) {
				if (num != array[i]) {
					num = array[i];
					cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}
