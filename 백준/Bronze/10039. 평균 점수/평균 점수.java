import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 모든 학생의 점수를 더할
		int num = 0;
		
		// 입력은 총 5개가 들어온다
		for(int i = 0; i < 5; i++) {
			// 입력으로 주어진 학생의 점수를 변수 n에 저장한다
			int n = Integer.parseInt(br.readLine());
			
			// n이 40미만 이라면
			if(n < 40) {
				// n을 기본 점수인 40으로 한다
				 n = 40;
			}
			
			// num에 n을 더해준다
			num += n;
		}
		
		// 모든 점수를 더한 num에 학생 수 5를 나누어 주어 출력한다
		System.out.println(num/5);
		
		
	}	
}