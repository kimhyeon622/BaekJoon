import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 한 줄에 문스터의 방어율과 유저의 방무가 입력받아 배열에 저장합니다
		String arr[] = br.readLine().split(" ");
		
		// 몬스터의 방어율 : a, 유자의 방무 : b
		double a = Integer.parseInt(arr[0]);
		double b = Integer.parseInt(arr[1]);
		
		// 유저가 체감하는 방어율 수치 : d
		// 200의 20%를 무시하면 40이 됩니다
		// 그럼 유저가 체감하는 방어율 수치는 160이 됩니다.
		double d = a - (a * b) / 100;
		
		// d가 100보다 크거나 같으면
		if(d >= 100) {
			// 유저는 대미지를 줄 수 없습니다
			System.out.println(0);
		// d가 100보다 적으면
		} else {
			// 유저는 대미지를 줄 수 있습니다
			System.out.println(1);
		}
		
	}	
}