import java.util.*;

public class Main {

	public static void main(String[] args){
		// 입출력에 사용할 객체
        Scanner sc = new Scanner(System.in);
        
        // 동전의 종류 : N, 금액 : K, 해당 가치를 저장할 배열 : arr, 동전 개수 : cnt
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        int cnt = 0;
        
        // 동전의 가치를 각각의 배열에 저장
        for(int i = 0; i < N; i++) {
        	arr[i] = sc.nextInt();
        }
        
        for(int i = arr.length-1; i >= 0; i--) {
        	// K원이 해당 동전의 가치보다 크면 실행
        	if(arr[i] <= K) {
        		// 동전 개수에 K원/동전의 가치
        		cnt += (K/arr[i]);
        		// 나머지 값 저장
        		K = K % arr[i];
        	}
		}
        
        // 동전 개수의 최소값을 출력
        System.out.println(cnt);

	}
}