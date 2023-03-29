import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		String[] array = new String[T+1];
		String S = null;
		
		
		for(int i = 1; i <= T; i++) {
			 S = sc.next();
			 array[i] = S;

		}
		for(int i = 1; i <= T; i++){
			System.out.print(array[i].charAt(0));
			System.out.println(array[i].charAt(array[i].length()-1));
		}
		
		}
	}
