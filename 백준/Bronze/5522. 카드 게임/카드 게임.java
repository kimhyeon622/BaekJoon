import java.io.IOException;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		// 입출력에 사용할 객체
		Scanner sc = new Scanner(System.in);
		
		// 기본값 0
		int cnt = 0;
		
		// 무한반복
		while(sc.hasNext()) {
			// 정수 A입력받기
			int A = sc.nextInt();
			
			// A에서 값을 받을 때마다 cnt에 더하기
			cnt += A;
			
			}
		
		// cnt 출력
		System.out.println(cnt);	
		
		
	}
}