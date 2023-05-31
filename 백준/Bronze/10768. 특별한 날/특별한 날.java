import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 월 : MM, 일 : dd
		int MM = Integer.parseInt(br.readLine());
		int dd = Integer.parseInt(br.readLine());
		
		// swich-case문으로 월에 따라서 다른 명령어를 실행한다
		// 가독성을 높이기 위해 사용 했다
		switch (MM) {
		case 1:
			// 1월달에는 "Before"
			System.out.println("Before");
			break;
		case 2:
			// 2월달에는
			// dd가 18이라면
			if(dd == 18) {
				// "Special" 출력
				System.out.println("Special");
			// dd가 18보다 크다면
			} else if( dd > 18) {
				// "After" 출력
				System.out.println("After");
			// 그렇지 않으면 18보다 작으니
			} else {
				// "Before" 출력
				System.out.println("Before");
			} 
			break;	
		case 3: case 4: case 5:
		case 6: case 7: case 8: 
		case 9: case 10: case 11:case 12:
			// 3~12월달에는 "After"를 출력한다
			System.out.println("After");
			break;
		default:
			break;
		}

		
	}	
}