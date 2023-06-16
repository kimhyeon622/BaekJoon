import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 첫줄에 입력으로 주어지는 N을 입력받습니다
		int N = Integer.parseInt(br.readLine());
		
		// 출력형식에 맞추기 위해 먼저 이것만 출력해준 후
		System.out.println("Gnomes:");
		
		// N번 반복하여
		for(int i = 0; i < N; i++) {
			// 한 줄을 입력 받아 공백을 기준으로 나누어 배열 num에 저장합니다
			String num[] = br.readLine().split(" ");
			
			// num에 저장된 값들을 서로 비교하여
			// num[0]부터 점점 작아지는 숫자대로 정렬되어 있으면
			if(Integer.parseInt(num[0]) > Integer.parseInt(num[1]) && Integer.parseInt(num[1]) > Integer.parseInt(num[2])) {
				// 'Ordered'를 출력합니다
				System.out.println("Ordered");
				
			// num[2]부터 점점 작아지는 숫자대로 정렬되어 있으면
			// num[0]부터면 점점 커지는 숫자대로 정렬
			} else if(Integer.parseInt(num[2]) > Integer.parseInt(num[1]) && Integer.parseInt(num[1]) > Integer.parseInt(num[0])) {
				// 'Ordered'를 출력합니다
				System.out.println("Ordered");
				
			// 둘 다 아니면 
			} else {
				// 'Unordered'를 출력합니다
				System.out.println("Unordered");
			}
		}
		
	}		
}