import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 알파벳의 갯수를 저장할 배열
		int[] ap = new int[26];
		
		// 문자열을 저장할 변수 : S
		String S = br.readLine(); 
		
		// 문자열의 길이만큼 반복
		for(int i = 0; i < S.length(); i++) {
			// 문자를 하나씩 ch에 char형으로 저장
			char ch = S.charAt(i);
			
			// 소문자 a가 97이기 떄문에 97을 빼주면 0부터 a, b, c... 이렇게 ch에 따라 해당 index가 증가한다
			ap[ch - 97]++;
		}
		
		// 알파벳 배열 ap의 길이만큼
		for(int i = 0; i < ap.length; i++) {
			// 배열에 저장된 알파벳의 갯수 출력
			System.out.print(ap[i]);
			
			// 마지막에는 공백이 필요없으니 마지막에서 2번째까지
			if(i < ap.length - 1) {
				// 공백을 준다
				System.out.print(" ");
			}
		}

		
	}	
}