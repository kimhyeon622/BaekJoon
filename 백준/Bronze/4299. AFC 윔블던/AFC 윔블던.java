import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력 받은 값을 공백을 기준으로 분리하여 저장
		String[] arr = br.readLine().split(" ");
		
		// 두 팀 점수의 합 : sum, 두 팀 점수의 차 : num 
		int sum = Integer.parseInt(arr[0]);
		int num = Integer.parseInt(arr[1]);
		
		// 값을 찾았는지 체크하기 위한 변수
	    boolean check = true;
		
	    // 2중 for문을 사용
	    
	    // 나올 수 있는 최댓값은 1000이니 1000까지 해준다
	    // 테스트 해본 최대의 수 = 1000 990, 결과 => 995 5
		for(int i = 0; i <= 1000; i++) {
			// check가 fasle일 경우
			if(!check) {
				// 반복문 종료
				break;
			}
			// 여기는 최대 500까지
			// 테스트 해본 최대의 수 = 1000 0, 결과 => 500 500
			for(int j = 0; j <= 500; j++) {
				
				// 각각 A팀은 i의 점수를 B팀은 j의 점수라고 가정
				int A = i;
				int B = j;				
				
				// A팀의 점수 + B팀의 점수가 sum이고, A팀의 점수 - B팀의 점수가 num이면
				if(A + B == sum && A - B == num) {
					// A팀과 B팀의 점수를 출력한 후
					System.out.println(A + " " + B);
					// check를 false로 바꾸어 준다
					check = false;
				}
				
				// 만약 최대까지 갔을 경우 == 합과 차를 갖는 점수가 없을 경우
				if(i == 1000 && j == 500) {
					// -1을 출력한다
					System.out.println(-1);
				}
			}
		}
		
	}	
}