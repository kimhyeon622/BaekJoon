import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 민국이의 4과목 점수 : arr1, 만세의 4과목 점수 : arr2
		// 각각 주어진 점수를 입력 받는다
		String arr1[] = br.readLine().split(" "); 
		String arr2[] = br.readLine().split(" "); 
		
		// 민국이의 총점 : S, 만세의 총점 : T
		int S = 0;
		int T = 0;
		
		// 민국이의 점수와 만세의 점수를 각각 더해서 저장한다
		for(int i = 0; i < 4; i++) {
			// 민국이는 S에 더한다
			S += Integer.parseInt(arr1[i]);
			// 만세는 T에 더한다
			T += Integer.parseInt(arr2[i]);
		}
		
		// 만약 만세의 점수가 더 크다면
		if(T > S) {
			// 만세의 점수 T출력
			System.out.println(T);
			
		// 그헣지 않으면 민국이의 점수가 더 높거나 같으니
		} else {
			// 민국이의 점수 S출력
			System.out.println(S);
		}
		
	}	
}