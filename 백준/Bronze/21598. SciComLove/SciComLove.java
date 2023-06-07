import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 첫줄에 주어지는 절을 할 횟수를 int형 변수 N에 저장
		int N = Integer.parseInt(br.readLine());
		
		// N번 만큼 반복하는 반복문으로
		for(int i = 0; i < N; i++) {
			// "SciComLove" 출력
			System.out.println("SciComLove");
		}

	}		
}