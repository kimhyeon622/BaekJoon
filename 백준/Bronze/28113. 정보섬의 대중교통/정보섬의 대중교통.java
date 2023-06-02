import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 문자열의 길이 : N, 문자열 : S
		String arr[] = br.readLine().split(" ");
		
		// 지하철 승강장까지 걸어가는데 걸리는 시간 : N
		int N = Integer.parseInt(arr[0]);
		// 집에 가는 버스가 정류소에 오는 시간 : A
		int A = Integer.parseInt(arr[1]);
		// 집에 가는 열차가 역에 오는 시간 : B
		int B = Integer.parseInt(arr[2]);
		
		// 만약 지하철보다 버스가 오는 시간이 적게 걸리면
		if(A < B) {
			// Bus 출력
			System.out.println("Bus");
		// 만약 지하철이 버스보다 오는 시간이 적게 걸리면
		} else if(B < A) {
			// subway 출력
			System.out.println("Subway");
		// 버스와 지하철 모두 오는 시간이 같다면
		} else {
			// Anything 출력
			System.out.println("Anything");
		}
		
	}	
}