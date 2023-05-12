import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 문자열을 하나씩 나누어 배열에 저장한다
		String[] arr = br.readLine().split("");
		
		// 배열의 길이(문자열의 길이) 저장
		int idx = arr.length;
		
		// idx가 0이 될때 까지 반복
		while(idx > 0) {
			// 문자열의 길이가 3이라고 하면 최대 인덱스는 2이니 idx-1을 해준다
			System.out.print(arr[idx-1]);
			// idx를 감소 시켜준다
			idx--;
			
		}
	}	
}