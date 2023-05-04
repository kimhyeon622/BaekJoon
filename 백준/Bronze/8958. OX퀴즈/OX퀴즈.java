import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// N을 입력받기
		int N = Integer.parseInt(br.readLine());
		
		// N번 반복
		for(int i = 0; i < N; i++) {
			// OX를 받는 String타입 : S
			String S = br.readLine();
			// 점수를 저장할 변수 : score, 연속된 점수를 계산할 변수 : relay
			// 초기화도 같이 되게 여기서 선언한다
			int score = 0;
			int relay = 0;
			// S의 길이만큼 반복
			for(int j = 0; j < S.length(); j++) {
				// S의 문자열 중 첫번째 부터 하나씩 가져오기
				char ch = S.charAt(j);
				// 만약
				if(ch == 'O') {
					// O가 나올때 마다 1씩 추가된다
					relay += 1;
				// 만약
				} else if(ch == 'X') {
					// X가 나오게 되면 다시 0으로 돌아간다
					relay = 0;
				}
				// 저장된 점수를 score에 저장
				score += relay;
			}
			// 최종으로 저장된 score 출력
			System.out.println(score);
		}
		
		
	}	
}