import java.io.IOException;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		// 입출력에 사용할 객체
		Scanner sc = new Scanner(System.in);
		// 직사각형의 세로길이 : A, 가로길이 : B
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		// cm^2 즉 A 곱하기 B
		System.out.println(A*B);
		
	}
}