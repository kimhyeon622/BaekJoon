import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 집에서 학교까지의 이동 시간 : A
		int A = Integer.parseInt(br.readLine());
		// 학교에서 PC방까지의 이동 시간 : B
		int B = Integer.parseInt(br.readLine());
		// PC방에서 학원까지의 이동 시간 : C
		int C = Integer.parseInt(br.readLine());
		// 학원에서 집까지의 이동 시간 : D
		int D = Integer.parseInt(br.readLine());
		
		// 이동 시간의 총 합(초 단위)
		int sum = A + B + C + D;
		
		// 분 : x, 초 : y
		// sum을 60으로 나눈 값 = 분
		// sum을 60으로 나눈 후 나머지 값 = 초
		int x = sum / 60;
		int y = sum % 60;
		
		// 출력 형식에 따라 분(x)과 초(y)를 출력
		System.out.println(x);
		System.out.println(y);
		
		
	}	
}