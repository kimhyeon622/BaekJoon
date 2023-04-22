import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력에 사용할 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 총 사과 개수
		BigInteger Apple = new BigInteger(st.nextToken());
		st = new StringTokenizer(br.readLine());
		// 서로 차이나는 사과 개수
		BigInteger difference = new BigInteger(st.nextToken());
		
		// 사과를 차이만큼 빼주기
		BigInteger subtract = Apple.subtract(difference);
		
		// 빼준 사과를 반으로 나누기
		BigInteger Divide = subtract.divide(BigInteger.valueOf(2));
		
		// Klaudia : 나눈 사과에서 뺀만큼 다시 더해주기
		System.out.println(Divide.add(difference));
		// Natalia : 나눈 사과를 그대로 출력
		System.out.println(Divide);
		
	}
}