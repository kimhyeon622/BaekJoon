import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력으로 주어지는 값을 변수 X에 받습니다
		int X = Integer.parseInt(br.readLine());
		
		// X 나누기 21의 나머지 값을 출력하면 끝
		System.out.println(X % 21);
		
		
		
	}		
}