import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 통화의 개수 : N
		int N = Integer.parseInt(br.readLine());
		
		// 통화 시간 : T
		String T[] = br.readLine().split(" ");
		
		// 영식이 요금 : Y, 민식이 요금 : M
		int Y = 0;
		int M = 0;
		
		// N번 반복하여 통화의 요금 계산
		for(int i = 0; i < N; i++) {
			
			// 영식이 요금제 계산
			// T[i]에서 30을 나눈값 * 10으로 계산을 할 경우 요금을 계산할 수 있다
			// 하지만 int형이니 소수점은 없어져버려 61같은 숫자가 나오면 20원으로 계산된다
			// 또한 29같은 숫자가 나오면 0이 되어버리니 +1을 하여 계산한다
			// 30이 나오면 20원을 청구하는게 맞으니 따로 수정할 필요도 없다
			Y += (Integer.parseInt(T[i]) / 30 + 1) * 10;

			// 민식이 요금제 계산
			// 영식이 요금 계산과 같은 방식
			// 대신 30토 단위와 10원을 60초 단위 15원으로 바꾸었다
			M += (Integer.parseInt(T[i]) / 60 + 1) * 15;
			
			// 다쓰고 생각해보니 29랑 59로 해두면 +1없이 잘 작동할 듯?
		}

		// 만약 영식이 요금제가 민식이 요금제보다 요금이 적다면
		if(Y < M) {
			// 영식이(Y)와 영식이 요금을 출력
			System.out.println("Y " + Y);
			
		// 만약 민식이 요금제가 영식이 요금제보다 요금이 적다면
		} else if(M < Y) {
			// 민식이(M)와 민식이 요금을 출력
			System.out.println("M " + M);
		// 둘의 요금제의 요금이 같다면
		} else {
			// 영식이(Y)와 영식이 요금을 출력 후
			// 민식이(M)와 민식이 요금을 출력
			System.out.println("Y M " + Y);
		}
		
	}		
}