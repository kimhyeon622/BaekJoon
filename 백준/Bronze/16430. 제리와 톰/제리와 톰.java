import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력 받기
		String[] arr = br.readLine().split(" ");
		
		// 각각 A와 B에 저장
		int A = Integer.parseInt(arr[0]);
		int B = Integer.parseInt(arr[1]);
		
		// 기약분수 P/Q 처럼 해당 수를 계산하여 각각 P와 Q에 저장 
		int P = B - A;
		int Q = B;
		
		// P와 Q 출력
		System.out.println(P + " " + Q);
		
		
	}	
}