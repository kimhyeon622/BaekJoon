import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력에 사용할 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력받기
		String id = br.readLine();
		
		// 팬들에게 둘러싸인 홍준의 모습을 출력
		System.out.println(":fan::fan::fan:");
		System.out.println(":fan::" + id +"::fan:");
		System.out.println(":fan::fan::fan:");
		
	}
}