import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String S = sc.next();
		int i = sc.nextInt();
		
		String str = S.substring(i-1, i);
		
		System.out.println(str);
		}
	}