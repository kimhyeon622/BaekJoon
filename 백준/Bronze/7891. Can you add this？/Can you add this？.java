import java.io.IOException;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		// 입출력에 사용할 객체
		Scanner sc = new Scanner(System.in);
		
		// 테스트 케이스 입력받기
		int t = sc.nextInt();
		// 각 테스트 케이스의 정수의 합을 저장할 배열
		int[] arr = new int[t];
		
		for(int i = 0; i < t; i++) {
			// A와 B 입력받기
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			// A와 B를 더해서 배열에 넣기
			arr[i] = A + B;
		}
		
		// 배열에 들어있는 값 모두 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
	}
}