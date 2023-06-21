import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 정답을 맞은 시간을 받는 배열 : time
		String time[] = br.readLine().split(" ");
		
		// 각각 정답을 맞은 시간을 시와 분으로 나누어 저장합니다
		// HH : 시, MM : 분
		int HH = Integer.parseInt(time[0]);
		int MM = Integer.parseInt(time[1]);
		
		// 정답을 맞는데 결린 시간을 계산한다
		// 정답을 맞은 시(HH) - 문제를 풀기 시작한 시간(9) * 60분 이렇게 시부분은 구한후
		// 위에 식에 정답을 맞는데 걸린 분(MM)을 더해줍니다
		int M = (HH - 9) * 60 + MM;
		
		// 마지막으로 M을 출력하면 끝
		System.out.println(M);
	}		
}