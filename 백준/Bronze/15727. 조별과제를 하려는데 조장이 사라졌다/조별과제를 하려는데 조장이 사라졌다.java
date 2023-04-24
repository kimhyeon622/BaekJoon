import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력에 사용할 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 성우의 현재 위치와 민건이의 집까지의 거리 : L
		int L = Integer.parseInt(br.readLine());
		// 걸리는 시간(분) : t
		int t = 1;
		
		// 걸리는 시간(분) 구하기
		for(int i = 1; i <= L; i++) {
			if(5 * i >= L) {
				t = i;
				break;
			}
		}
		
		// t 출력
		System.out.println(t);
		
	}	
}