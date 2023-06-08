import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력으로 받는 정수를 X에 저장한다
		int X = Integer.parseInt(br.readLine());
		
		// (X * X * X)cm^3 출력
		System.out.println(X * X * X);
		
		
		
	}		
}