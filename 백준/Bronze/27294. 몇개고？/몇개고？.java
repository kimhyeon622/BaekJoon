import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 시간과 술의 유무를 한줄에 입력 받은 후 공백으로 분리하여 저장
		String[] arr = br.readLine().split(" ");
		
		// 시간 : T, 술의 유무 : S
		// 입력 받은 시간과 술의 유무를 변수에 int형으로 변환하여 저장
		int T = Integer.parseInt(arr[0]);
		int S = Integer.parseInt(arr[1]);
		
		// 점심 시간은 12부터 16까지니
		// 아침 시간(T가 11이하일 때) 또는 저녁 시간(T가 16초과일 때)는 280개
		if(T <= 11 || T > 16) {
			System.out.println(280);
		// 술이랑 같이 먹을 때는 280개
		} else if(S == 1) {
			System.out.println(280);
		// 둘다 그렇지 않으면 점심 시간이고, 술이랑 같이 먹지 않으니 320개
		} else {
			System.out.println(320);
		}
		
		
	}	
}