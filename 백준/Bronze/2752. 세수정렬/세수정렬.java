import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 첫번쨰 줄에 주어진 숫자 3개를 배열에 받는다
		String[] arr = br.readLine().split(" ");
		
		// int형 배열 num 생성
		int[] num = new int[arr.length];
		
		// 반복문으로  num에 arr배열을 int형으로 변환하여 저장
		for(int i = 0; i < arr.length; i++) {
			 num[i] = Integer.parseInt(arr[i]);
		}
		
		// 배열 정렬
		Arrays.sort(num);
		
		// 반복문으로 배열 출력
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

	}	
}