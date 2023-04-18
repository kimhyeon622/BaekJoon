import java.util.*;


public class Main {

	public static void main(String[] args) {
		// 입출력에 사용할 객체
		Scanner sc = new Scanner(System.in);
		
		// 수의 개수 : N, 합을 구해야 하는 횟수 : M, N개의 수를 저장할 배열 : arr
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N+1];
		
		for(int i = 1; i <= N; i++) {
			// 누적합 구하기
			arr[i] = arr[i - 1] + sc.nextInt();
		}
		
		// M번 반복
		for(int i = 0; i < M; i++) {
			// 시작지점 : start, 끝지점 : end
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			// start와 end사이의 구간합 : arr[end] - arr[start - 1]
			System.out.println(arr[end] - arr[start - 1]);
		}
		
	}
}