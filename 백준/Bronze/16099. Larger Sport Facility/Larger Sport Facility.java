import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 테스트 케이스 : T
		int T = Integer.parseInt(br.readLine());
		
		// 테스트 케이스를 카운트 해줄 변수 : cnt
		int cnt = 0;
		
		// T번 반복
		while(cnt < T) {
			String arr[] = br.readLine().split(" ");
			
			// TelecomParisTech의 길이 : ㅣ, TelecomParisTech의 너비 : w
			long l = Integer.parseInt(arr[0]);
			long w = Integer.parseInt(arr[1]);
			// Eurecom의 길이 : ㅣ, Eurecom의 너비 : w
			long le = Integer.parseInt(arr[2]);
			long we = Integer.parseInt(arr[3]);
			
			// TelecomParisTech의 넓이
			long Te = l * w;
			// Eurecom의 넓이
			long Eu = le * we;
			
			// Te가 Eu보다 크다면
			if(Te > Eu) {
				// TelecomParisTech 출력
				System.out.println("TelecomParisTech");
				
			// 그렇지 않고 Eu가 Te보다 크다면
			} else if(Eu > Te) {
				// Eurecom 출력
				System.out.println("Eurecom");
				
			// 전부 그렇지 않다면
			} else {
				System.out.println("Tie");
			}
			
			// cnt증가
			cnt++;
		}
		
	}	
}