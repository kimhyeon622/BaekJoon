import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 케이스의 번호 : c
		int c = 1;
		
		// 무한반복
		while (true) {
			// 주어지는 입력을 한 줄을 입력 받아 배열에 저장합니다
			String arr[] = br.readLine().split(" ");
			
			// 만약 arr[0]의 값이 0이라면
			if(Integer.parseInt(arr[0]) == 0) {
				// 반복문을 종료해 줍니다
				break;
			}
			
			// 만약 0이 아니라면 이부분 실행
			// 출력형식에 받게 케이스를 출력해준 후
			System.out.println("Case " + c + ": Sorting... done!");
			// c는 하나씩 증가 시켜줍니다
			c++;
		}
		
		
		
	}		
}