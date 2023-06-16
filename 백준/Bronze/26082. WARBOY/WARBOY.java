import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 첫줄에 입력으로 주어지는 N을 입력받습니다
		String N[] = br.readLine().split(" ");
		
		// 경쟁사 제품의 가격 : A, 경쟁사 제품의 성능 : B, WARBOY의 가격 : C
		int A = Integer.parseInt(N[0]);
		int B = Integer.parseInt(N[1]);
		int C = Integer.parseInt(N[2]);
		
		// WARBOY의 가격 대비 성능 : WARBOY
		// WARBOY의 가격 대비 성능은 경쟁사의 비해 3배 좋다고 했으니 3을 곱해줍니다
		int WARBOY = B / A * 3;
		
		// WARBOY에 C를 곱하면 성능을 구할 수 있습니다
		System.out.println(WARBOY * C);
		
		
	}		
}