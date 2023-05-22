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
		for(int i = 0; i < N; i++) {
			
			// 문자열을 입력받아 Si에 저장
			String Si = br.readLine();
			
			// Si에 저장된 문자열을 toLowerCase 메소드로 소문자로 변환하여 출력
			System.out.println(Si.toLowerCase());
			
		}
		
	}	
}