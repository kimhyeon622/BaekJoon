import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력에 사용할 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 정수 : N
		int N = Integer.parseInt(br.readLine());
		
		// 소인수분해
		int i = 2;
		
		// N이 0이 될 때까지 반복
		while (N != 0) {
			
			// 만약 N이 1이면 반복문 나가기
			if(N == 1) {
				break;
			}
			
			// 만약 N 나누기 i가 0이면 i는 나눌 수 있는 소인수
			if(N % i == 0) {
				// N에 N 나누기 i의 값을 저장한다
				N = N / i;
				// 해당 i는 출력
				System.out.println(i);
			// 나눌 수 있는 소인수가 아니면
			}else {
				// i를 증가시킨다
				i++;
			}
		}
		
		
		
	}	
}