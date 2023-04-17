import java.lang.reflect.Array;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		// 입출력에 사용할 객체
		Scanner sc = new Scanner(System.in);
		
		// 수열의 크기 : n, 수열의 숫자가 들어갈 배열 : arr
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		// 수열의 크기 n만큼 배열 arr에 넣기
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 오름차순으로 정렬
		Arrays.sort(arr);
		
		// x를 입력받기
		int x = sc.nextInt();
		// 쌍의 수
		int cnt = 0;
		// 시작지점
		int start = 0;
		// 끝지점
		int end = n -1;
		// arr[start] + arr[end] 값을 저장할 변수
		int sum = 0;
		
		// end가 start보다 작아질 때까지 반복
		while(start < end) {
			// arr[start] + arr[end] 값을 sum에 저장
			sum = arr[start] + arr[end];
			// sum이 x랑 같으면 저장
			if(sum == x) {
				cnt++;
			}
			// 만약 x보다 sum이 작거나 같으면 start증가
			if(sum <= x) {
				start++;
			// 그렇지 않으면 end감소
			}else {
				end--;
			}
		}
		
		// cnt 출력
		System.out.println(cnt);
		
	}
}