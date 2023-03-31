import java.util.*;

public class Main {

	public static void main(String[] args){
		// 입출력에 사용할 객체
        Scanner sc = new Scanner(System.in);
        
        // 물품 수 N
        int N = sc.nextInt();
        // 버틸 수 있는 무게 K
        int K = sc.nextInt();
        
        // 물건의 무게 W, 해당 물건의 가치 V, DP
        int[] W = new int[N+1];
        int[] V = new int[N+1];
        int[] DP = new int[K+1];
        
        for(int i = 0; i < N; i++) {
        	W[i] = sc.nextInt();
        	V[i] = sc.nextInt();
        }
        
        for(int i = 0; i < N; i++) {
        	// 버틸 수 있는 무게 - i에 해당되는 무게 >= 0
        	// 버틸 수 있는 무게에서 해당하는 무게를 뺏을떄 0 
        	for(int j = K; j - W[i] >= 0; j--) {
        		DP[j] = Math.max(DP[j], DP[j - W[i]] + V[i]);
        	}
        }
        System.out.println(DP[K]);

	}
}