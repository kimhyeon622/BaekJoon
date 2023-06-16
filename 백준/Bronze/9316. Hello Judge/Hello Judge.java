import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 첫줄에 입력으로 주어지는 N을 입력받습니다
		int N = Integer.parseInt(br.readLine());
		
		// 1부터 N번까지 반복하여
		for(int i = 1; i <= N; i++) {
			// 출력 형식에 맞게 출력합니다.
			System.out.println("Hello World, Judge " + i + "!");
		}
		
	}		
}