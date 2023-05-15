import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 별을 몇번째 줄까지 찍을지 입력을 받는다
		int N = Integer.parseInt(br.readLine());
		
		// while문으로 N이 0이 될 때 까지 반복
		while(N > 0) {
			// for문으로 N번 별을 찍는다
			for(int i = 0; i < N; i++) {
				System.out.print("*");
			}
			// N번 별을 찍고 줄바꿈을 해준다
			System.out.println("");
			// 그리고 N을 하나 감소시킨다
			N--;
		}
	}	
}