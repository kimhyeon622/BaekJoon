import java.util.*;


public class Main {

	public static void main(String[] args) {
		// 입출력에 사용할 객체
		Scanner sc = new Scanner(System.in);
		
		// 자연수 : N, 정수 : K, N! : n, K! : k, (N - K)! : nk
		int N =  sc.nextInt();
		int K = sc.nextInt();
		int n = 1;
		int k = 1;
		int nk = 1;
		
		// N! / K!(N-K)! 이 공식에 필요한 팩토리얼들을 구한다
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
		// 만든 변수를 공식과 같이 계산한다
		System.out.println(n / (k * nk));
	}
}