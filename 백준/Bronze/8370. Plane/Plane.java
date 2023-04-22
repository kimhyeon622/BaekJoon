import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		// 입출력에 사용할 객체
		Scanner sc = new Scanner(System.in);
		
		// 비즈니스석의 열 : n1
		int n1 = sc.nextInt();
		// 비즈니스석 각 열의 좌석 : k1
		int k1 = sc.nextInt();
		// 이코노미석의 열 : n2
		int n2 = sc.nextInt();
		// 이코노미석 각 열의 좌석 : k2
		int k2 = sc.nextInt();
		
		// 비즈니스석의 좌석의 합 + 이코노미석의 좌석의 합
		System.out.println(n1 * k1 + n2 * k2);
		
	}
}