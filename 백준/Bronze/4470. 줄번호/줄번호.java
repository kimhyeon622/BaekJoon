import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 정수 : N
		int N = Integer.parseInt(br.readLine());
		
		// N번 반복한다
		// 번호는 1번부터 시작해야하니 i는 1로 시작
		for(int i = 1; i <= N; i++) {
			
			// 문자열을 입력받아 S에 저장
			String S = br.readLine();
			
			// 출력 형식에 맞게 i(번호) + .(온점) + 공백 + S(문자열) 
			System.out.println(i + ". " + S);
			
		}
		
	}	
}