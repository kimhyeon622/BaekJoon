import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 방학 일 수 : L
		int L = Integer.parseInt(br.readLine());
		
		// 국어 : A, 수학 : B
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		// 하루에 풀 수 있는 최대 페이지 수
		// 국어 : C, 수학 : D
		int C = Integer.parseInt(br.readLine());
		int D = Integer.parseInt(br.readLine());
		
		// 수학을 다 푸는데 걸리는 날의 수 : math, 국어를 다푸는데 걸리는 날의 수 : ko
		int math = A / C;
		int ko = B / D;
		
		// 만일 수학숙제가 남았다면(나누었을 때 나머지가 있다면)
		if(A % C != 0) {
			// 하루 더 풀어야하니 math에 +1을 해준다
			math += 1;
		}
		
		// 만일 국어 숙제가 남았다면
		if(B % D != 0) {
			// ko에 +1을 해준다
			ko += 1;
		}
		
		// math와 ko 중 더 오래 걸리는 과목 찾기
		// 하루에 수학과 국어를 같이 푼다는 기준이기 때문에 더 오래 걸리는 과목을 찾는다
		int max = Math.max(math, ko);
		
		// 방학 일 수인 L에 max를 빼주면
		// 숙제를 하지 않고 놀 수 있는 최대 날의 수가 나온다
		System.out.println(L - max);
		
	}	
}