import java.util.*;

public class Main {

	public static void main(String[] args){
		// 입출력에 사용할 객체
        Scanner sc = new Scanner(System.in);
        // 테스크 케이스 : T
        int T = sc.nextInt();

        // 테스트 케이스만큼 반복
        for(int i = 0; i < T; i++) {
        	// 거스름돈 : C
        	int C = sc.nextInt();
        	// 쿼터 : Q, 다임 : D, 니켈 : N, 페니 : P
            int Q = 0;
            int D = 0;
            int N = 0;
            int P = 0;
            
            // 거슬러 줘야할 쿼터 수
        	if(25 <= C) {
        		Q += (C/25);
        		C = C % 25;
        	}
        	// 거슬러 줘야할 다임 수
        	if(10 <= C) {
        		D += (C/10);
        		C = C % 10;
        	}
        	// 거슬러 줘야할 니켈 수
        	if(5 <= C) {
        		N += (C/5);
        		C = C % 5;
        	}
        	// 거슬러 줘야할 페니 수
        	if(1 <= C) {
        		P += (C/1);
        		C = C % 1;
        	}
        	// 각각 거슬러 줘야할 개수 출력
        	System.out.println(Q + " " + D + " " + N + " " + P);
        }

	}
}