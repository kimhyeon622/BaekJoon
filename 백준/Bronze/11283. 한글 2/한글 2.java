import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 한글 한 글자를 입력받아 st에 저장합니다
		String st = br.readLine();
		
		// 그 후 char형으로 변환한 후
		char s = st.charAt(0);

		// '가'일 경우 1이 나와야하니 '-44031'을 해줍니다
		// 가 = 44032
		// 그리고 char형인 ch에 저장합니다
		char ch = (char)(s - 44031);
		
		// 마지막으로 ch를 출력하면 끝
		// 하지만 그냥 출력할 경우 문자로 변환아여 나오기때문에 이상한 문자가 출력된다
		// int형으로 바꾸어 출력하면 진짜 끝
		System.out.println((int)ch);
		
	}		
}