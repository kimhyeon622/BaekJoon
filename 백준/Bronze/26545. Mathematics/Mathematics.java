import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 더할 정수의 개수(n)를 입력습니다
		int n = sc.nextInt();
		// 모든 정수를 더하여 저장할 변수도 생성해줍니다
		int sum = 0;
		
		// n번 반복하여
		for(int i = 0; i < n; i++) {
			// 각각 입력받는 정수를
			int num = sc.nextInt();
			// sum에 더해줍니다
			sum += num;
		}
		// 마지막으로 sum을 출력하면 끝
		System.out.println(sum);
	}	
}