import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 첫줄에 주어진 두 개의 정수를 입력받습니다.
		String n[] = br.readLine().split(" ");
		
		// n[0]번 반복하여
		for(int i = 0; i < Integer.parseInt(n[0]); i++) {
			// 모양을 나타내는 숫자들을 입력받아 하나씩 나누어 fish에 저장합니다
			String fish[] = br.readLine().split("");
			
			// 그 후 n[1] - 1부터 하나씩 j를 감소시킵니다
			// 조건으로는 0까지 반복하는 반복문을 만들어줍니다
			for(int j = Integer.parseInt(n[1]) - 1; j >= 0; j--) {
				// 그럼 fish에 입력받은 모양을 반대로 출력이 가능합니다
				System.out.print(fish[j]);
			}
			// 모양을 맞추기 위해 한줄 출력 후 줄바꿈을 해줍니다
			System.out.println("");
		}
		
		
		
		
	}		
}