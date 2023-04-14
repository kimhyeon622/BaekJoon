import java.util.*;

public class Main {

	public static void main(String[] args) {
		// 입출력에 사용할 객체
		Scanner sc = new Scanner(System.in);
		// 입력받는 숫자 : X, 라인 : line, 해당 라인 최댓값 : cnt, 분자 : x, 분모 : y
		int X = sc.nextInt();
		int cnt = 0;
		int line = 0;
		int x = 0;
		int y = 0;
		
		while(cnt < X) {
			// 라인 수++
			line++;
			// 해당 라인의 최댓값 구하기
			cnt = line * (line + 1) / 2;
		}
		// 라인이 짝수 일 때
		if(line % 2 == 0) {
			// 라인 - 최댓값 + X 
			x = line - cnt + X ;
			// 1 + 최댓값 - X
			y = 1 + cnt - X;
		// 라인이 홀수 일 때
		} else {
			// 1 + 최댓값 - X
			x = 1 + cnt - X;
			// 라인 - 최댓값 + X 
			y = line- cnt + X ;
		}
		
		// 형식에 맞게 출력
		System.out.println(x + "/" + y);
	}
}