import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// a, b 둘다 5000자리 이하로 구성된 양의 정수이니 BigInteger 사용
		// 첫 번째 라인의 정수 : a
		BigInteger a = new BigInteger(br.readLine());
		// 두 번째 라인의 정수 : b
		BigInteger b = new BigInteger(br.readLine());
		
		// a + b 출력
		System.out.println(a.add(b));
		
	}	
}