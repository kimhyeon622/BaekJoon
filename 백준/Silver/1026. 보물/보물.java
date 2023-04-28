import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력에 사용할 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 자연수 : N, 배열 : A, B
		int N = Integer.parseInt(br.readLine());
		// 배열의 길이는 N으로 해준다
		int[] A = new int[N];
		int[] B = new int[N];
		
		// A와 B에 담길 각 원소들을 입력받아 담는다
		for(int i = 0; i < 2; i++) {
			// 한 줄을 입력받고
			String[] arr = br.readLine().split(" ");
			// 처음 받았으면
			if(i == 0) {
				// A배열에 저장
				for(int j = 0; j < N; j++) {
					A[j] = Integer.parseInt(arr[j]);
				}
			// 아니면
			} else {
				// B배열에 저장
				for(int j = 0; j < N; j++) {
					B[j] = Integer.parseInt(arr[j]);
				}
			}
		}
		
		// 배열을 오름차순으로 정렬
		Arrays.sort(A);
		
		// 배열 B를 Integer타입인 arr에 저장
		Integer[] arr = new Integer[N];
		for(int i = 0; i < B.length; i++) {
			arr[i] = B[i];
		}
		
		// arr을 내림차순으로 정렬해준다
		Arrays.sort(arr, Collections.reverseOrder());
		
		// 최솟값 : S
		int S = 0;
		// 반복문을 돌려서
		for(int i = 0; i < N; i++) {
			// S에 A배열 * arr배열을 담는다
			S += A[i] * arr[i];
		}
		
		// 마지막으로 S 출력
		System.out.println(S);
	}	
}