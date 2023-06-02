import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 첫번째 줄에 문자열의 길이 N이 주어진다
		// 두번째 줄에 소문자로 이루어진 문자열 S가 주어진다
		// 문자열의 길이 : N, 문자열 : S
		int N = Integer.parseInt(br.readLine());
		String S = br.readLine();
		
		// 모음의 개수를 카운트해주는 변수 : cnt
		int cnt = 0;
		
		// 문자열의 길이 N만큼 반복
		for(int i = 0; i < N; i++) {
			// 모음의 개수를 알기위해 하나씩 문자로 분리하여
			char ch = S.charAt(i);
			
			// 모음인지 비교한다
			// 만약 모음일 경우
			if(ch == 'a' || ch == 'i' || ch == 'u' || ch == 'e' || ch == 'o') {
				// cnt를 증가 시킨다
				cnt++;
			}
		}
		
		// cnt 출력
		System.out.println(cnt);
	}	
}