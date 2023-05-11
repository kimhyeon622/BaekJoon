import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 첫 번째 줄에 주어진 두 정수를 받아서 배열에 저장
		String[] arr = br.readLine().split(" ");
		
		// 입력 받은 배열에서 동전의 개수 N과 초바가 가격 M을 저장한다
		// 계산하기 편하게 N도 * 100을 해주어 가지고 있는 돈으로 계산한다
		// 밤고가 가지고 있는 돈 : N, 초코바 가격 : M
		int N = Integer.parseInt(arr[0]) * 100;
		int M = Integer.parseInt(arr[1]);
		
		// 가지고 있는 돈이 초코바 가격보다 많거나 같으면
		if(N >= M) {
			// 살 수 있으니 Yes 출력
			System.out.println("Yes");
		// 그렇지 않으면
		} else {
			// 돈이 부족하니 No 출력
			System.out.println("No");
		}
		
	}	
}