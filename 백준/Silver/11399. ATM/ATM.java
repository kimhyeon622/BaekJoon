import java.util.*;

public class Main {

	public static void main(String[] args){
		// 입출력에 사용할 객체
        Scanner sc = new Scanner(System.in);
        
        // 사람의 수 : N
        int N = sc.nextInt();
        // 각 사람이 돈을 인출하는데 걸리는 시간 : P
        int[] P = new int[N];
        // 각 사람이 돈을 인출하는데 필요한 시간 : Time
        int Time = 0;
        // 각 사람이 돈을 인출하는데 필요한 시간의 합 : sum
        int sum = 0;
        
        // 인출하는데 걸리는 시간 입력받기
        for(int i = 0; i < P.length; i++) {
        	P[i] = sc.nextInt();
        }
        
        // 순서 작은순으로 정렬
        Arrays.sort(P);
        
        // N번 반복
        for(int i = 0; i < N; i++) {
        	// 각 사람이 돈을 인출하는데 필요한 시간 계산
        	Time += P[i];
        	// 필요한 시간의 합
        	sum += Time;
        }
        
        System.out.println(sum);
	}
}