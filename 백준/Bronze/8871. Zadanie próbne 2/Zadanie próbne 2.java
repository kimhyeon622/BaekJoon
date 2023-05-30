import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 득점 라운드 : n
		int n = Integer.parseInt(br.readLine());
		
		// 한 번의 시법 라운드가 있기 떄문에 n + 1으로 계산
		// 최소 점수 : min, 최대 점수 : max
		int min = (n + 1) * 2;
		int max = (n + 1) * 3;
		
		// n이 주어졌을 때 득점할 수 있는 점수의 최솟값과 최댓값 출력
		System.out.println(min + " " + max);
		
	}	
}