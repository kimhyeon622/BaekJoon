import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 만들려 하는 막대기 길이 : X
		int X = Integer.parseInt(br.readLine());
		
		// 과정을 몇번 거쳤는지 카운트 : cnt
		int cnt = 0;
		
		// X가 0일때 까지 반복
		while(X > 0) {
			
			// 만약 X가 23이라고 할때
			// 23 - 16 = 7(cnt 1)
			// 7 - 4 = 3(cnt 2)
			// 3 - 2 = 1(cnt 3)
			// 1 - 1 = 0(cnt 4)
			
            // 이렇게 0이 될때까지 반복적으로 빼준다
			// X가 몇번만에 0이 되는지 == 몇번만에 Xcm의 막대기가 몇번만에 만들어 지는지
			
			if(X >= 64) {
				cnt++;
				X -= 64;
			} else if(X >= 32) {
				cnt++;
				X -= 32;
			} else if(X >= 32) {
				cnt++;
				X -= 32;
			} else if(X >= 16) {
				cnt++;
				X -= 16;
			} else if(X >= 8) {
				cnt++;
				X -= 8;
			} else if(X >= 4) {
				cnt++;
				X -= 4;
			} else if(X >= 2) {
				cnt++;
				X -= 2;
			} else if(X >= 1) {
				cnt++;
				X -= 1;
			} else {
				break;
			}
		}
		
		// 카운트 해주는 cnt 출력
		System.out.println(cnt);
		
	}	
}