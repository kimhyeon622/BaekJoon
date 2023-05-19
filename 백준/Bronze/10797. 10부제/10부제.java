import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 날짜의 일의 자리 숫자 : day
		int day = Integer.parseInt(br.readLine());
		
		// 자동차의 일의 자리 숫자를 공백을 기준으로 분리하여 배열에 저장
		String[] car = br.readLine().split(" ");
		
		// 10부제를 위반하는 차량의 대수 : cnt
		int cnt = 0;
		
		// 5대라고 명시 되어있지만
		// 배열 car의 길이 만큼 반복
		for(int i = 0; i < car.length; i++) {
			// 만약 주어진 날짜와 자동차의 일의 자리 숫자가 동일하면
			if(day == Integer.parseInt(car[i])) {
				// 10부제를 위반하였으니 cnt증가
				cnt++;
			}
		}
		
		// 마지막으로 cnt출력
		System.out.println(cnt);
		
	}	
}