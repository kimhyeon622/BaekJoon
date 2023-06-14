import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 자연수 : a, b, c
		// c와 b는 10의 100승이기 떄문에 BigInteger타입으로 선언
		BigInteger a = new BigInteger(br.readLine());
		BigInteger b = new BigInteger(br.readLine());
		BigInteger c = new BigInteger(br.readLine());
		
		// a * x = b - c일 때 x의 값을 구하는 문제
		// 나누기전 a가 0이라면
		if(a.equals(BigInteger.ZERO)) {
			// a를 1로 바꾸어 준 후 계산 되게 해줍니다.
			a = BigInteger.ONE;
		}
		// 나눌때 오류가 나지 않게 하기 위함
		
		// b - c에서 a를 나누어주면
		// x의 값을 알 수 있습니다
		BigInteger x = (b.subtract(c)).divide(a);
				
		
		// x를 출력하면 끝
		System.out.println(x);
		
		
	}		
}