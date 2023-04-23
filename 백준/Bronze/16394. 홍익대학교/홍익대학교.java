import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 문제 조건1 : Scanner 사용
		// 문제 조건3 : java.util.Scanner <- 필수 라이브러리
		Scanner sc = new Scanner(System.in);
		
		// 특정 년도 입력받기
		int N = sc.nextInt();
		
		// 개교 주년을 알기위해 N - 1946(개교년도)
		int var = N - 1946;
		
		// 문제 조건2 : "System.out.println(var);" 이렇게 출력
		System.out.println(var);
		
	}	
}