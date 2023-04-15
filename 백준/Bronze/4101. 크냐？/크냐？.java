import java.util.*;

public class Main {

	public static void main(String[] args) {
		// 입출력에 사용할 객체
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		// 무한반복
		while(check) {
			// 첫번째 수 : A, 두번째 수 : B
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			// A와 B가 모두 0이면 반복 종료
			if(A == B && A == 0) {
				check = false;
			// 그렇지 않으면 실행
			} else {
				// A가 B보다 크다면 "Yes"출력 아니면, "No"출력
				System.out.println(A > B ? "Yes" : "No");
			}
			
		}
		
		
	}
}