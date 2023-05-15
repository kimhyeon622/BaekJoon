import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 첫번째 줄에 현재 시각을 입력받는다
		String[] arr = br.readLine().split(" ");
		
		// 시 : H, 분 : M, S : 초
		// 각각의 변수에 알맞게 입력받은 값 저장
		int H = Integer.parseInt(arr[0]);
		int M = Integer.parseInt(arr[1]);
		int S = Integer.parseInt(arr[2]);
		
		// 요리시간 입력 받기
		int sec = Integer.parseInt(br.readLine());
		
		S = S + sec;
		
		// 초 구하기
		// S가 60보다 크거나 같으면
		if(S >= 60) {
			// S를 60으로 나눈값을 M에 더해준다
			// S가 350이라면 M에 5분이 더해진다
			M += S/60;
			// S를 60으로 나눈값의 나머지는 S에 저장한다
			// S가 350이라면 S에 50분이 저장된다
			S = S%60;
		}
		
		// 분 구하기
		// M이 60보다 크거나 같으면
		if(M >= 60) {
			// 60으로 나누어 나눈값을 H에 더해준다
			H += M/60;
			// 나눈값의 나머지는 M에 저장
			M = M%60;
		}
		
		// 시 구하기
		if(H >= 24) {
			// 24가 되면 0시로 돌아가야하니
			// 24로 나누어 나머지를 H에 저장
			H = H%24;
		}
		
		System.out.println(H + " " + M + " " + S);
		
	}	
}