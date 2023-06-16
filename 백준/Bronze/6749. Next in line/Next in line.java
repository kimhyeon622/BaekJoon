import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 막내의 나이 : Y, 둘째의 나이 : M
		int Y = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		// 둘쨰와 막내의 나이차와 첫쨰와 둘쨰의 나이차와 같다고 했으니
		// 둘쨰와 막내의 나이차를 구한후 둘째 나이에 더하면 됩니다.
		System.out.println(M + (M - Y));
		
		
	}		
}