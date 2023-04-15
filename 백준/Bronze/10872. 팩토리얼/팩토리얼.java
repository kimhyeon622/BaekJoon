import java.util.*;

public class Main {

	public static void main(String[] args) {
		// 입출력에 사용할 객체
		Scanner sc = new Scanner(System.in);
		// 입력받을 정수 : N, 팩토리얼 : Factorial
		int N = sc.nextInt();
		int Factorial = 1;
		
		// 정수 N번 반복
		// 대신 0일떄는 실행 안함
		for(int i = 1; i <= N; i++) {
			// Factorial = Factorial * i
			// 1부터 N까지 곱하기
			Factorial *= i; 
		}
		
		// 모든 값이 곱해진 Factorial 출력
		System.out.println(Factorial);
	}
}