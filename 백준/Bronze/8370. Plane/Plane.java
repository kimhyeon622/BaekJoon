import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력에 사용할 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력받기
		String[] arr = br.readLine().split(" ");
		
		// 비즈니스석의 열 : n1
		int n1 = Integer.parseInt(arr[0]);
		// 비즈니스석 각 열의 좌석 : k1
		int k1 = Integer.parseInt(arr[1]);
		// 이코노미석의 열 : n2
		int n2 = Integer.parseInt(arr[2]);
		// 이코노미석 각 열의 좌석 : k2
		int k2 = Integer.parseInt(arr[3]);
		
		// 비즈니스석의 좌석의 합 + 이코노미석의 좌석의 합
		System.out.println(n1 * k1 + n2 * k2);
		
	}
}