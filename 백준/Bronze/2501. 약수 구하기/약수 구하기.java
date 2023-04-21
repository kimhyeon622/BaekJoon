import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		// 입출력에 사용할 객체
		Scanner sc = new Scanner(System.in);
		
		// 자연수 : N, 자연수 : K, 약수를 저장할 배열 : meaure, 약수가 나올때 증가 : cnt 
		int N =sc.nextInt();
		int K = sc.nextInt();
		int measure[] = new int[N+1];
		int cnt = 0;
		
		// N / N까지 돌려서
		for(int i = 1; i <= N; i++) {
			// 약수가 나오면 해당 약수를 measure에 저장
			if(N % i == 0) {
				measure[cnt++] = i;
			}
			// cnt와 K가 같아지면
			if(cnt == K) {
				// 반복문 나가기
				break;
			}
		}
		
		// 약수의 개수가 K보다 많거나 같으면
		if(measure.length >= K) {
			// K번째 약수 출력
			System.out.println(measure[K-1]);
		// 약수의 개수가 K보다 적으면
		} else {
			// 0출력
			System.out.println(0);
		}
	}
}