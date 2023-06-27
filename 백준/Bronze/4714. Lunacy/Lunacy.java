import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 음수인 소수가 나올때 까지 반복
		while(true) {
			
			// 지구에서 무게를 입력 받습니다.
			double X = Double.parseDouble(br.readLine());
			
			// 만약 음수 일 결우
			if(X < 0) {
				// 반복문을 끝내줍니다.
				break;
			}
			
			// 달은 지구에서 무게의 0.167밖에 되지 않는다고 했으니
			// 지구에서 무게의 *0.167을 해줍니다
			double Y = X * 0.167;
			
			// 마지막으로 출력형식에 맞게 출력문을 구성해주면 끝
			System.out.print("Objects weighing ");
			// 소수점 2자리까지 출력이니 "%.2f"(둘째자리까지)로 출력해준다
			System.out.printf("%.2f", X);
			System.out.print(" on Earth will weigh ");
			System.out.printf("%.2f", Y);
			System.out.println(" on the moon.");
		}
		
	}		
}