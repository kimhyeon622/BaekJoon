import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 한 줄에 주어지는 입력값들을 배열에 받는다
		String arr[] = br.readLine().split(" ");
		
		// 새해 첫낳 포획한 쥐 : n1, 새해 줄째 날 포획한 쥐 : n2, 이미 표식을 받은 쥐 : n12
		int n1 = Integer.parseInt(arr[0]);
		int n2 = Integer.parseInt(arr[1]);
		int n12 = Integer.parseInt(arr[2]);
		
		// 자신의 지역에 살고 있는 쥐의 수 : N
		// N := L(n1 + 1)(n2 + 1) / (n12 + 1) - 1J
		// 위와 같은 공식을 사용하여 계산 하면
		int N = ((n1 + 1) * (n2 + 1)) / (n12 + 1) - 1;
		
		// N 출력
		System.out.println(N);
		
	}	
}