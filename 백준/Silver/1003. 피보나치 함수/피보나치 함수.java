import java.io.IOException;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		// 입출력에 사용할 객체
		Scanner sc = new Scanner(System.in);
		// 테스트 케이스 : T
		int T = sc.nextInt();

		for(int i = 0; i < T; i++) {
			// 숫자 : N
			int N = sc.nextInt();
			// N의 0이 출력되는 횟수를 담는 배열 : n0
			int[] n0 = new int[41];
			// N의 1이 출력되는 횟수를 담는 배열 : n1
			int[] n1 = new int[41];
			
			// 0이 주어지면 1,0을 출력
			n0[0] = 1;
			n1[0] = 0;
			// 1이 주어지면 0,1을 출력
			n0[1] = 0;
			n1[1] = 1;
			
			// 한번만 실행하기 위해
			if(n1[40] == 0) {
				// 0과 1은 이미 있으니 2부터 실행
				for(int j = 2; j <= 40; j++) {
					// (1개 이전 숫자의 0이 출력되는 횟수) + (2개 이전 숫자의 0이 출력되는 횟수) = 현재 숫자의 0이 출력되는 횟수
					n0[j] = n0[j-1] + n0[j - 2];
					// (1개 이전 숫자의 1이 출력되는 횟수) + (2개 숫자의 1이 출력되는 횟수) = 현재 숫자의 1이 출력되는 횟수
					n1[j] = n1[j-1] + n1[j - 2];
				}
			}
			// N의 0이 출력되는 횟수와 1이 출력되는 횟수를 출력
			System.out.println(n0[N] + " " + n1[N]);
		}

	}
}