import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 비트를 받는 배열 : bit
		String bit[] = br.readLine().split(" ");
		
		// 배열읠 수만큼 반복 후
		for(int i = 0; i < bit.length; i++) {
			// 만약 bit의 값이 9라면
			if(Integer.parseInt(bit[i]) == 9) {
				// F를 출력 후 반복문을 끝낸다
				System.out.println("F");
				break;
			}
			// 만약 끝까지 bit를 다 읽은 경우 S를 출력
			if(i == bit.length - 1) {
				System.out.println("S");
			}
		}
	}		
}