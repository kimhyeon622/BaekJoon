import java.io.IOException;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		// 입출력에 사용할 객체
		Scanner sc = new Scanner(System.in);
		
		// 무한반복
		while(sc.hasNext()) {
			// 정수 N입력받기
			int N = sc.nextInt();
			// 기본값 0
			int cnt = 0;
			
			// 반복문으로 피라미드를 만드는데 필요한 블록 수 구하기
			// N부터 1까지 반복
			for(int i = N; 0 <= i; i--) {
				cnt += i;
			}
			
			// 만약 N이 0이라면 
			if(N == 0) {
				// 반복문 끝내기
				break;
			// 아니면
			}else {
				// cnt출력
				System.out.println(cnt);
			}
			
		}
		
		
	}
}