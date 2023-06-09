import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 일반 상자의 수와 작은 상자의 수를 입력받습니다.
		// 일반 상자 : R, 작은 상자 : S
		int R = Integer.parseInt(br.readLine());
		int S = Integer.parseInt(br.readLine());
		
		// 일반 상자에는 컵케이크 8개가 작은 상자에는 3개가 들어있습니다.
		// 모든 컵케이크를 계산한 후
		int cake = R * 8 + S * 3;
		
		// 한 반에 28의 학생이 있다고 하고 하나씩 받으며 몇개가 남는지 출력하면 됩니다
		System.out.println(cake - 28);
		
		
	}		
}