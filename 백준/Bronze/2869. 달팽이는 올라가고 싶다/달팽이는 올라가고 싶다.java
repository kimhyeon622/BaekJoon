import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		// 입출력에 사용할 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		// 달팽이가 낮에 올라가는 미터 수 : A
		int A = Integer.parseInt(st.nextToken());
		// 달팽이가 밤에 미끄러지는 미터 수 : B
		int B = Integer.parseInt(st.nextToken());
		// 정상의 미터 수
		int V = Integer.parseInt(st.nextToken());
		// 달팽이가 정상까지 걸리는 일자
		// 올라가야할 미터 / 하루에 올라가는 미터
		int day = (V - B) / (A - B);
		
		// 0이 아니라면 "소수점이 있다"라는 뜻
		// 소수점이 나올 경우 하루를 더 올라가야하니 day를 증가
		if((V - B) % (A - B) != 0) {
			day++;
		}
		
		System.out.println(day);
		
	}
}