import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 몇번 반복했는지 카운트를 세줄 변수 : cnt
		int cnt = 0;
		
		// 3번 반복
		while(cnt < 3) {
			// 한 줄을 입력 받는다
			String[] arr = br.readLine().split(" ");
			
			// 각각 해당되는 배열을 빼준다
			// 3번째 - 0번째 = 근무 시간의 h시간
			int h = Integer.parseInt(arr[3]) - Integer.parseInt(arr[0]);
			// 4번째 - 1번째 = 근무 시간의 m분
			int m = Integer.parseInt(arr[4]) - Integer.parseInt(arr[1]);
			// 5번째 - 2번째 = 근무 시간의 s초
			int s = Integer.parseInt(arr[5]) - Integer.parseInt(arr[2]);
			
			// s가 마이너스라면
			if(s < 0) {
				// m을 하나 빼주고
				m--;
				// s에 60을 더해준다
				s += 60;
			} 
			
			// m이 마이너스라면
			if(m < 0) {
				// h를 하나빼고
				h--;
				// m을 60을 더해준다
				m += 60;
			}
			
			// 근무 시간(h, m, s)을 출력해준다
			// 출력 형식에 맞게 공백으로 나누어서 출력
			System.out.println(h + " " + m + " " + s);
			// cnt증가
			cnt++;
		}
		
	}	
}