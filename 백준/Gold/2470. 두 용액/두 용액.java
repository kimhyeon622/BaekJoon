import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		// 입출력에 사용할 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 전체 용액의 개수 : N, 용액의 특성값들을 저장할 배열 : arr
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		// 위치 문제..
		StringTokenizer st = new StringTokenizer(br.readLine());
				
		// 전체 용액의 개수만큼 반복
		for(int i = 0; i < N; i++) {
			// 용액의 특성값을 입력받아 저장
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 오름차순으로 정렬
		Arrays.sort(arr);
		
		
		// 정수의 최대값 저장
		int max = Integer.MAX_VALUE;
		// 시작지점
		int start = 0;
		// 끝지점
		int end = N -1;
		// 해당 두 용액의 특성값 저장할 변수
		int A = 0;
		int B = 0;
		
		// end가 start보다 작아질 때까지 반복
		while(start < end) {
			// arr[start] + arr[end] 값을 sum에 저장
			int sum = arr[start] + arr[end];
			// 절대값으로 반환
			int num = Math.abs(sum);
			// max값보다 num이 작으면 실행
			if(num < max) {
				// num값을 max에 저장
				// 그러면 점점 적은 값만 max로 저장됨
				max = num;
				// 두 용액의 특성값을 각각 A, B에 저장
				A = arr[start];
				B = arr[end];
				if(max == 0) {
					break;
				}
			}
			// 만약 0보다 sum이 크면 end감소
			if(sum > 0) {
				end--;
			// 그렇지 않으면 start증가
			}else {
				start++;
			}
			
		}
		
		// 특성값이 0에 가장 가까운 용액
		System.out.println(A + " " + B);
		
	}
}