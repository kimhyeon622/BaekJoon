import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력에 사용할 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 수의 개수 N, N개의 수를 저장할 배열 : num, 소수의 개수 : cnt
		int N = Integer.parseInt(br.readLine());
		int[] num = new int[N];
		int cnt = 0;
		
		// 입력 받기
		String[] arr = br.readLine().split(" ");
		
		// N번 반복하여 소수 찾기
		for(int i = 0; i < N; i++) {
			// 소수를 확인 할 변수 : cheak 
			int cheak = 0;
			// 입력받은 arr배열에서 num배열에 저장
			num[i] = Integer.parseInt(arr[i]);
			
			// num[i]에 있는 숫자를 계산
			for(int j = 2; j <= num[i]; j++) {
				// 해당 숫자와 j를 나누었을 때 0이나오면 약수
				if(num[i] % j == 0) {
					// 약수가 나오면 증가
					cheak++;
				}
				
				// 만일 약수가 1개라면
				if(cheak == 1 && j == num[i]) {
					// cnt증가
					cnt++;
				}
			}
		}
		
		// 소수의 개수가 저장된 cnt 출력
		System.out.println(cnt);
		
	}	
}