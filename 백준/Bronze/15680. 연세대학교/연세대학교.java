import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력에 사용할 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력받기
		int N = Integer.parseInt(br.readLine());
		
		// N이 0일 경우
		if(N == 0) {
			// 연세대학교의 영문명을 출력한다.
			System.out.println("YONSEI");
		// N이 1일 경우
		}else {
			// 연세대학교의 슬로건을 출력한다.
			System.out.println("Leading the Way to the Future");
		}
		
		
	}	
}