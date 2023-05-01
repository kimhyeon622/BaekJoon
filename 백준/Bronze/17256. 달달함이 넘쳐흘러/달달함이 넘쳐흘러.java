import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 케이크 수 a를 구성하는 자연수
		int ax = 0;
		int ay = 0;
		int az = 0;
		// 케이크 수 c를 구성하는 자연수
		int cx = 0;
		int cy = 0;
		int cz = 0;
		
		// 입력 받기
		for(int i = 0; i < 2; i++) {
			String[] arr = br.readLine().split(" ");
			if(i == 0) {
				ax = Integer.parseInt(arr[0]);
				ay = Integer.parseInt(arr[1]);
				az = Integer.parseInt(arr[2]);
			} else {
				
				cx = Integer.parseInt(arr[0]);
				cy = Integer.parseInt(arr[1]);
				cz = Integer.parseInt(arr[2]);
			}
		}

		// az + bx, ay * by, ax + bz
		// 연산에 맞게 각각 bx, by, bz 구하기
		int bx = cx - az;
		int by = cy / ay;
		int bz = cz - ax;
		
		// bx, by, bz 출력
		System.out.println(bx + " " + by + " " + bz);
		
		
	}	
}