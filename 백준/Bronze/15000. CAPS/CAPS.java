import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 문자열이 주어지면 st에 입력받은 후
		String st = br.readLine();
		
		// 주어지는 소문자로 이루어진 문자열을 대문자로 바꾸어 출력한다
		System.out.println(st.toUpperCase());
		
		
	}	
}