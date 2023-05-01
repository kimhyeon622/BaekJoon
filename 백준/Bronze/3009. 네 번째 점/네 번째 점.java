import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력에 사용할 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
		// 좌표의 최댓값으로 배열 x, y 선언
		int[] x = new int[1001];
		int[] y = new int[1001];
		
		// 3번 입력을 받으니 3번 반복
		for(int i = 0; i < 3; i++) {
			// 입력 받기
			String[] arr = br.readLine().split(" ");
			// 각각 X와 Y에 저장
			int X = Integer.parseInt(arr[0]);
			int Y = Integer.parseInt(arr[1]);
			
			// 배열x의 인덱스 X번에 X를 저장
			if(x[X] == 0) {
				x[X] = X;
			// 만약 0이 아니면 -X를 해준다
			}else if(x[X] != 0) {
				x[X] -= X;
			}
			
			// 배열y의 인덱스 Y번에 Y를 저장
			if(y[Y] == 0) {
				y[Y] = Y;
			// 만약 0이 아니면 -Y를 해준다
			}else if(y[Y] != 0) {
				y[Y] -= Y;
			}
			
		}
		
		// 배열 x의 길이만큼 반복
		for(int i = 0; i < x.length; i++) {
			// 만약 해당 인덱스의 값이 0이 아닐경우
			if(x[i] != 0) {
				// 해당 인덱스 출력 후 반복문 끝내기
				System.out.print(x[i] + " ");
				break;
			}
		}
		
		// 배열 y의 길이만큼 반복
		for(int i = 0; i < y.length; i++) {
			// 만약 해당 인덱스의 값이 0이 아닐경우
			if(y[i] != 0) {
				// 해당 인덱스 출력 후 반복문 끝내기
				System.out.print(y[i]);
				break;
			}
		}
		
		
	}	
}