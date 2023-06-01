import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 숫자 : N
		int N = Integer.parseInt(br.readLine());
		
		// 알고리즘의 시간 복잡도는 고정되어있기 때문에
		// 항상 수행 횟수는 1, 최고차항의 차수는 0이 된다
		System.out.println(1);
		System.out.println(0);
	}	
}