import java.io.IOException;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		// 입출력에 사용할 객체
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			// 자연수 : A, B
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			// 만약 0, 0이면 반복문 종료
			if(A == 0 && B == 0) {
				break;
			}else {
				// A 나누기 B의 나머지가 0이면 배수(multiple)
				if(A % B == 0) {
					System.out.println("multiple");
				// B 나누기 A가 0이면 약수(factor)
				} else if(B % A == 0) {
					System.out.println("factor");
				// 둘 다 아니면 아무것도 아니다(neither)
				} else if(A % B != 0) {
					System.out.println("neither");
				}
			}
		}
	
		
	}
}