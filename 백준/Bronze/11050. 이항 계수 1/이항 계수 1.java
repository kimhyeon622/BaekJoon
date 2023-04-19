import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		// 입출력에 사용할 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// 자연수 : N, 정수 : K, N! : n, K! : k, (N - K)! : nk
		int N =  Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int n = 1;
		int k = 1;
		int nk = 1;
		
		// N! / K!(N-K)! 이 수식에 필요한 팩토리얼들을 구한다
		// N!
		for(int i = 2; i <= N; i++) {
			n = n * i;
		}
		// K!
		for(int i = 2; i <= K; i++) {
			k = k * i;
		}
		// (N - K)!
		for(int i = 2; i <= N - K; i++) {
			nk = nk * i;
		}
		
		// N! / K!(N-K)!  -> n / (k * nk)
		// 만든 변수를 수식과 같이 계산한다
		System.out.println(n / (k * nk));
	}
}