import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 두 통장의 잔고를 입력은 후 배열 M에 입력받습니다.
		String M[] = br.readLine().split(" ");
		
		// 치킨 한마리의 값 : C
		int C = Integer.parseInt(br.readLine());
		// 통장 A의 잔고 : A, 통장 B의 잔고 : B
		int A = Integer.parseInt(M[0]);
		int B = Integer.parseInt(M[1]);
		
		// 두 통장의 잔고로 치킨 두마리를 살 수 있다면
		if(C * 2 <= A + B) {
			// 치킨을 사고 남은 두 통장의 잔고의 합을 출력
			System.out.println(A + B - C * 2);
			
		// 치킨 두마리를 살 수 없다면
		} else {
			// 두 통장의 잔고의 합을 출력
			System.out.println(A + B);
		}
		
	}		
}