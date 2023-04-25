import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력에 사용할 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 정수 : N, 수를 저장할 배열 : arr
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		// N번 입력받기
		for(int i = 0; i < N; i++) {
			// 받은 값을 배열에 저장
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		// 오름차순으로 정렬
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		
		// 배열에 들어있는 값을 sb에 담는다(줄바꿈도 함께)
		for(int i : arr) {
			sb.append(i).append('\n');
		}
		// sb를 출력
		System.out.println(sb);
	}	
}