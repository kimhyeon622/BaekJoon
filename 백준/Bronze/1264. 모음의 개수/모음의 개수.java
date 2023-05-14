import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 반복문을 중간에 멈추기 위해 boolean형의 변수를 선언
		boolean check = true;
		
		// 무한반복
		while(check) {
			// 입력받은 문자열을 문자로 분리하여 저장한다
			String[] arr = br.readLine().split(""); 
			
			// 모음의 개수를 담을 변수 : N
			int N = 0;
			
			// 배열의 길이 만큼 반복
			for(int i = 0; i < arr.length; i++) {
				// 문자 하나씩 소문자로 변환
				String s = arr[i].toLowerCase();
				
				// 만약 #가 나왔다면
				if(s.equals("#")) {
					// check를 false로 바꾸어 반복문을 끝내준다
					check = false;
				}

				// 문자열 중 모음이 나왔을 때
				if(s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")) {
					// N증가
					N++;
				}
				
			}
			
			// 만약 check가 true일 경우 == #이 아닐 경우
			if(check) {
				// N출력
				System.out.println(N);
			}
			
		}
	}	
}