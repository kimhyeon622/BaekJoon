import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 1년전의 키와 현재의 키를 입력받아줍니다
		// 1년전 키 : A, 현재의 키 : B
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		// 현재 키 - 1년전 키 = 1년 동안 자란 키
		// 1년 동안 자란 키를 출력하면 끝
		System.out.println(B - A);
		
		
		
	}		
}