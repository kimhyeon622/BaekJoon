import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력에 사용할 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	

		// BigInteger 객체로 사용하려 헀으나 시간초과로 실패
		// 파이썬은 간단하게 되는데 자바나 C는 시간초과가 걸리는듯...
		
		// 입력으로 매우 큰 수 N이 주어진다
		String N = br.readLine();
		
		// 나머지를 담을 num
		long num = 0;
		
		// N의 길이만큼 반복
		for(int i = 0; i < N.length(); i++) {
			// num에 10만큼 곱한 후 i번쨰 자릿수를 더한다 이과정이 끝난 num에 나누기 20000303으로 나머지를 구한다
			// 왼쪽부터 자릿수를 늘려가면서 나머지를 구함
			num = (num * 10 + (N.charAt(i) - '0')) % 20000303;
		}
		
		// 나머지 num 출력
		System.out.println(num);
		
	}	
}