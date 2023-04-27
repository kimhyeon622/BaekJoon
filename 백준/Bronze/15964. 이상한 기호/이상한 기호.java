import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력에 사용할 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력받기
		String[] input = br.readLine().split(" ");
		
		// 정수 : A, B
		long A = Integer.parseInt(input[0]);
		long B = Integer.parseInt(input[1]);
		
		// A @ B = (A + B) * (A - B)
		long num = (A + B) * (A - B);
		
		// A @ B를 연산한 num을 출력
		System.out.println(num);
		
		
		
	}	
}