import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 첫 줄에 숫자 2개를 입력 받는다
		String[] arr = br.readLine().split(" ");
		
		// R1과 S로 나누어 저장
		int R1 = Integer.parseInt(arr[0]);
		int S = Integer.parseInt(arr[1]);
		
		// (R1 + R2) / 2 = S
		// R2 = S * 2- R1
		System.out.println(S *2 - R1);
		
	}	
}