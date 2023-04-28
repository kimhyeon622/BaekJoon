import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력에 사용할 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력 받기
		String[] arr = br.readLine().split(" ");
		
		// 한수의 좌표 : (x, y), 직사각형 오른쪽 위 꼭짓점 : (w, h)
		int x = Integer.parseInt(arr[0]);
		int y = Integer.parseInt(arr[1]);
		int w = Integer.parseInt(arr[2]);
		int h = Integer.parseInt(arr[3]);
		
		// 2가지 중 더 거리가 적을 쪽을 출력
		// 1. x나 y에서 0, 0이 더 가까울 때 (x or y)
		// 2. x에서 w또는 y에서 h이 더 가까울 때 ((w -x) or (h - y))
		
		// x보다 (w - x)가 작다면 x를 X에 저장, 그렇지 않으면 (w - x)를 저장
		int X = x < (w - x) ? x : (w - x);
		// y보다 (h - y)가 작다면 y를 Y에 저장, 그렇지 않으면 (h - y)를 저장
		int Y = y < (h - y) ? y : (h - y);
		
		// 거리릐 최솟값을 구해야하기 때문에 더 작은 쪽 구하기
		if(X < Y) {
			// X가 더작으면 X출력
			System.out.println(X);
		} else {
			// Y가 더작으면 Y출력
			System.out.println(Y);
		}
		
	}	
}