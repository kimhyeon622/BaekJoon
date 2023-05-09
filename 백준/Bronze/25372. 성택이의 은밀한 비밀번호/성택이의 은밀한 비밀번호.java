import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 문자열의 총개수 : N
		int N = Integer.parseInt(br.readLine());
		
		// N번 입력받기
		for(int i = 0; i < N; i++) {
			// 각각 문자열을 입력받을 때마다 password에 저장
			String password = br.readLine();
			
			// 비밀번호의 길이가 6자리 이상 9자리 이하일때
			if(password.length() >= 6 && password.length() <= 9) {
				// yes 출력
				System.out.println("yes");
			// 그렇지 않으면
			} else {
				// no 출력
				System.out.println("no");
			}
		}
	}	
}