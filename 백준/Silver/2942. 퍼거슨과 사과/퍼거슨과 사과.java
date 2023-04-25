import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력에 사용할 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 정수 : N, 수를 저장할 배열 : arr
		String[] arr = br.readLine().split(" ");
		
		// 빨간 사과 : R, 초록 사과 : G, 선수의 수 : players
		int R = Integer.parseInt(arr[0]);
		int G = Integer.parseInt(arr[1]);
		int players = 1;
		
		// 선수의 수보다 사과의 개수가 적을 때까지 반복한다
		while(players <= R || players <= G){
			// 빨간 사과와 초록 사과를 해당 선수의 수만큼 나누었을 때 남는 사과가 없으면
			if(R % players == 0 && G % players == 0) {
				// 출력 형식에 맞게 출력
				System.out.println(players + " " + R/players + " " + G/players);
			}
			
			// 선수 증가
			players++;
		}
		

		
	}	
}