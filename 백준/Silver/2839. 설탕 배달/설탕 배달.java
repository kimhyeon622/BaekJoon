import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력에 사용할 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 킬로그램 : N
		int N = Integer.parseInt(br.readLine());
		
		// 만약 N이 4또는 7일 경우 3과 5로는 절대 정확하게 나눌 수 없다
		if(N == 4 || N == 7) {
			// -1 출력
			System.out.println(-1);
			
		// 만약 N을 5로 나누었을때 나머지가 0이면
		} else if(N % 5 == 0) {
			// N / 5의 값을 출력한다
			// ex) 15 - > 3
			System.out.println(N / 5);
			
		// 만약 N을 5로 나누었을 때 나머지가 1 또는 3이라면
		} else if(N % 5 == 1 || N % 5 == 3) {
			// N을 5로 나눈 값 + 1을 출력해준다
			// ex) 11 -> 5킬로그램 1개 + 3킬로그램 2개
			// ex) 13 -> 5킬로그램 2개 + 3킬로그램 1개
			// 킬로그램의 봉지의 수는 다르지만 총 봉지의 개수는 같다
			System.out.println(N / 5 + 1);
			
		// 만약 N을 5로 나누었을 때 2나 4일 때
		} else if(N % 5 == 2 || N % 5 == 4) {
			// N을 5로 나눈 값의 + 2로 출력해준다
			// 12 -> 5킬로그램 0개 + 3킬로그램 4개
			// 14 -> 5킬로그램 1개 + 3킬로그램 3개
			// 5킬로그램을 사용하지 않아도 개수도 같다
			System.out.println(N / 5 + 2);
		}
		
	}	
}