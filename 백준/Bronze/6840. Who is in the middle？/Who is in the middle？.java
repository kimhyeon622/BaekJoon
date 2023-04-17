import java.io.IOException;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		// 입출력에 사용할 객체
		Scanner sc = new Scanner(System.in);
		
		// 그릇들의 무게 입력받기
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		// B > A > C 또는 C > A > B
		if(B > A && A > C || C > A && A > B) {
			// 중간값은 A
			System.out.println(A);
		}
		// A > B > C 또는 C > B > A
		if(A > B && B > C || C > B && B > A) {
			// 중간값은 B
			System.out.println(B);
		}
		// A > C > B 또는 B > C > A
		if(A > C && C > B || B > C && C > A) {
			// 중간값은 C
			System.out.println(C);
		}
		
	}
}