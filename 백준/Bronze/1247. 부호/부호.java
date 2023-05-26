import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 3개의 테스트가 주어진다
		for(int i = 0; i < 3; i++) {
			// 각 테스트의 첫줄에 N이 주어진다
			int N = Integer.parseInt(br.readLine());
			
			// long타입으로 하려 했지만 오버플로우와 언더플로우때문에 BigInteger을 사용
			// N개의 정수의 합 : S
			BigInteger S = BigInteger.ZERO;
			
			// N개의 정수가 주어진다
			for(int j = 0; j < N; j++) {
				// 정수를 num에 저장한다
				BigInteger num = new BigInteger(br.readLine());
				
				// num을 정수를 S에 합한다
				S = S.add(num);
			}
			
			// 문제에 조건처럼
			// S = 0 의 경우
			if(S.equals(BigInteger.ZERO)) {
				// 0출력
				System.out.println(0);
			// S > 0 의 경우
			} else if(S.compareTo(BigInteger.ZERO) > 0) {
				// "+" 출력
				System.out.println("+");
			// S < 0 의 경우
			} else if(S.compareTo(BigInteger.ZERO) < 0) {
				// "-" 출력
				System.out.println("-");
			}

		}
		
	}	
}