import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력에 사용할 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력받기
		String[] arr = br.readLine().split(" ");
		// 관중석의 크기 : N, M
		int N = Integer.parseInt(arr[0]);
		int M = Integer.parseInt(arr[1]);
		// 잃어버린 관중석 번호 : K
		int K = Integer.parseInt(arr[2]);
		
		// K / M : n, K % M : m
		System.out.println(K / M + " " + K % M);
		
	}
}