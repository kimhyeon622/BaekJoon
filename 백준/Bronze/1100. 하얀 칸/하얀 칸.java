import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 하얀 칸위에 말이 있는지 체크할 변수
		int check = 0;
		
		// 8*8크기의 체스판이니 8줄 8개를 확인한다
		for(int i = 1; i <= 8; i++) {
			// 한 줄씩 입력받기
			String[] arr = br.readLine().split("");
			// 한 줄에 8개 모두 확인
			for(int j = 0; j < 8; j++) {
				// 홀수 줄일때는 하얀 칸부터 시작
				if(i % 2 != 0) {
					// 0부터 시작하기 j가 짝수이고, arr[j]가 F면
					if(j % 2 == 0 && arr[j].equals("F")) {
						// check 증가
						check++;
					}
				// 짝수 줄일때는 검은 칸부터 시작
				} else {
					// 0부터 시작하니 j가 홀수이고, arr[j]가 F라면
					if(j % 2 != 0 && arr[j].equals("F")) {
						// check 증가
						check++;
					}
				}
			}
		}
		
		// check 출력
		System.out.println(check);
		
	}	
}