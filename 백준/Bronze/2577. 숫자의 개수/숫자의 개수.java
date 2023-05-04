import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 각각 A, B, C를 입력받기
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		// 해당 번호에 저장할 배열
		int[] arr = new int[10];
		
		// A * B * C를 num에 저장
		String num = Integer.toString(A * B * C);
		
		// num의 길이 만큼 반복
		for(int i = 0; i < num.length(); i++) {
			// num의 첫번째자리 부터 하나씩 char형으로 변환하여 가져오기
			char ch = num.charAt(i);
			// 아스키코드로 0은 48이므로 -48로 해당 index로 저장하여 1씩 추가
			arr[ch - 48] += 1;
		}
		
		// 배열을 줄마다 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}	
}