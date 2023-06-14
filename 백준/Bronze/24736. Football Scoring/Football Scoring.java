import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 원정팀의 스코어 : one, 홈팀의 스코어 : home
		String one[] = br.readLine().split(" ");
		String home[] = br.readLine().split(" ");
		
		// 원정팀의 총 스코어 : O, 홈팀의 총 스코어 : H
		int O = 0;
		int H = 0;
		
		// Touchdown - 6 points
		// Field Goal - 3 points
		// Safety - 2 points
		// After touchdown
		// - 1 point (Field Goal or Safety) - Typically called the “Point after”
		// - 2 points (touchdown) - Typically called the “Two-point conversion”
		
		// 위와 같은 규칙에 따라 점수를 배분하여 각각 O와 H를 계산
		O += Integer.parseInt(one[0]) * 6;
		O += Integer.parseInt(one[1]) * 3;
		O += Integer.parseInt(one[2]) * 2;
		O += Integer.parseInt(one[3]) * 1;
		O += Integer.parseInt(one[4]) * 2;
		
		H += Integer.parseInt(home[0]) * 6;
		H += Integer.parseInt(home[1]) * 3;
		H += Integer.parseInt(home[2]) * 2;
		H += Integer.parseInt(home[3]) * 1;
		H += Integer.parseInt(home[4]) * 2;
		
		// 계산이 완료된 O와 H를 출력형식에 맞게 출력
		System.out.println(O + " " + H);
		
	}		
}