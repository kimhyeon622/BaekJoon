import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력에 사용할 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
		// 자연수 : N, N개의 정수를 담는 배열 : Narr
		int N = Integer.parseInt(br.readLine());
		int[] Narr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// Narr에 N개의 정수 입력 받기
		for(int i = 0; i < Narr.length; i++) {
			Narr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 자연수 : M, M개의 정수를 담는 배열 : Marr
		int M = Integer.parseInt(br.readLine());
		String[] Marr = br.readLine().split(" ");
		
		// Narr 배열 정렬
		Arrays.sort(Narr);
		
		for(int i = 0; i < M; i++) {
			// 시작점(왼쪽 끝)
			int start = 0;
			// 끝점(오른쪽 끝)
			int end = Narr.length - 1;
			// Marr의 i번째 배열값을 m에 저장
			int m = Integer.parseInt(Marr[i]);
			// 찾는 값이 있으면 1, 없으면 0을 체크하는 변수
			int ck = 0;
			
			// start보다 end가 크거나 같을 때 까지 반복
			while(start <= end) {
				// 중간 위치 구하기
				int mid = (start + end) / 2;

				// m의 값이 중간 위치의 값보다 작을 경우
				if(m < Narr[mid]) {
					// 중간 위치 - 1을 end에 저장
					end = mid - 1;
				}
				
				// m의 값이 중간 위치의 값보다 클경우
				else if(m > Narr[mid]) {
					// 중간 위치 + 1을 start에 저장
					start = mid + 1;
				}
				
				// m의 값이 중간 위치의 값이랑 같을 경우
				else {
					System.out.println(1);
					ck = 1;
					break;
				}
			}
			
			// 만약 ck가 0이라면(즉, 찾고자 하는 값이 없을 경우)
			if(ck != 1) {
				// 0을 출력
				System.out.println(0);
			}
		}
		
		
		
	}	
}