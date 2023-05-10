import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 무한 반복
		while(true) {
			// 팰린드롬인지 체크하기위한 변수 : check
			int check = 1;
			// 입력 받는 수 : N 
			String N = br.readLine();
			
			// 만약 N이 0이라면
			if(N.equals("0")) {
				// 바로 반복문을 끝낸다
				break;
			}
			
			// 문자열의 앞부분의 인덱스 : start
			int start = 0;
			// 문자열의 뒷부분의 인덱스 : end
			int end = N.length() - 1;
			
			// start가 end보다 클때 까지 반복한다
			while(start < end) {
				// 만약 앞에 수와 뒤에 있는 수가 같지않으면
				if(N.charAt(start) != N.charAt(end)) {
					// check는 0으로 만들고 반복문을 끝낸다
					check = 0;
					break;
				}
				
				// start는 증가, end는 감소시켜준다
				start++;
				end--;
			}
			
			// 만약 check가 1일 경우
			if(check == 1) {
				// 팰린드롬이니 yes출력
				System.out.println("yes");
			// 그렇지 않으면
			} else {
				// 팰린드롬이 아니니 no를 출력
				System.out.println("no");
			}
		}

	}	
}