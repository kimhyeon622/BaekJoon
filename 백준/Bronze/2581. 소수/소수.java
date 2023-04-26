import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력에 사용할 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 자연수 : M, N
		int M = Integer.parseInt(br.readLine());		
		int N = Integer.parseInt(br.readLine());
		
		// 소수들의 합 : sum, 소수들 중 최솟값 : first
		int sum = 0;
		int first = 0;
		
		// M부터 N까지 반복
		for(int i = M; i <= N; i++) {
			// 나누었을 때 0이 나오는 수가 몇개인지 세기 위한 변수
			int check = 0;
			// 2부터 나누기
			for(int j = 2; j <= i; j++) {
				// 만약 i 나누기 j가 0이라면
				if(i % j == 0) {
					// check 증가
					check++;
				}
				
				// j가 마지막 번호인 i이고, check가 1이라면
				if(check == 1 && j == i) {
					// 그 중 처음으로 나온 소수를
					if(sum == 0) {
						// first에 저장
						first = i;
					}
					// sum에 i값을 더해준다
					sum += i;
				}
			}
		}
		
		// 만약 sum에 들어 있는 값이 0이 아니면
		if(sum != 0) {
			// 소수들의 합과 그 중 최솟값을 출력
			System.out.println(sum);
			System.out.println(first);
		// sum이 0이면 -1을 출력
		} else {
			System.out.println(-1);
		}
		
	}	
}