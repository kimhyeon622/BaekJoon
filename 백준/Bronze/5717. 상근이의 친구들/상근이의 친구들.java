import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			// 주어진 남자 친구와 여자 친구를 입력은 후 배열에 저장
			String arr[] = br.readLine().split(" ");
			
			// 남자 친구 : M, 여자 친구 : F
			// 각각 남자 친구와 여자 친구를 해당 변수에 저장
			// 딱히 필요없지만 가독성을 위해 작성
			int M = Integer.parseInt(arr[0]);
			int F = Integer.parseInt(arr[1]);
			
			// 남자 친구와 여자 친구의 수를 더해 총 친구 수를 구한다
			int friends = M + F;
			
			// 만약 친구 수가 0일 경우
			// 친구의 수는 1부터 시작하기 떄문에 0이 들어왔을 때는 끝낸다는 뜻
			if(friends == 0) {
				// 반복문을 나간다
				break;
			}
			
			// 친구의 수 출력
			System.out.println(friends);
			
		}
		
	}	
}