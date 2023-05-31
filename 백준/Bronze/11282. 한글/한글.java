import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 숫자 : N
		int N = Integer.parseInt(br.readLine());
		
		// N이 1일 경우 '가'가 나와야한다
		// 아스키코드에서 '가'는 44032이기 떄문에 N에 44031을 더해준다
		int ko = 44031 + N;
		
		// int형인 ko를 char형으로 바꾸어 ch에 저장한다
		char ch = (char)ko;
		
		// 마지막으로 char형인 ch를 출력하면 숫자가 아닌 문자로 출력된다
		System.out.println(ch);
	}	
}