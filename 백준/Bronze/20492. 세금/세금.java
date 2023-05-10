import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 상금의 금액 : N
		double N = Integer.parseInt(br.readLine());
		
		// 전체 상금의 22%
		System.out.format("%.0f ", N * 78 / 100);
		// 전체 상금의 80%를 필요 경비로 인정받는다
		double n = N * 80 / 100;
		// 나머지 20% 구하기
		double A = N * 20 / 100;
		// 나머지 금액 중 22%를 세금으로 사용
		double B = A * 78 / 100;
		
		// 80%의 필요 경비 + 나머지 금액 중 22%
		System.out.format("%.0f%n", n + B);
		
	}	
}