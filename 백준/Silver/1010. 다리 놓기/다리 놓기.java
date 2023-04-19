import java.io.IOException;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		// 입출력에 사용할 객체
		Scanner sc = new Scanner(System.in);
		// 테스트 케이스 : T
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			// 서쪽의 사이트 개수 : N, 동쪽에 사이트 개수 : M, 경우의 수 : num
			int N = sc.nextInt();
			int M = sc.nextInt();
			int num = 1;
			
			// 조합 공식
			for(int j = 0; j < N; j++) {
				// (M - 0, M - 1...) / (0 + 1, , 1 + 1...)
				num = num * (M - j) / (j + 1);
			}
			System.out.println(num);

		}
	
		
	}
}