import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 첫번째 줄 입력받은 숫자들 배열 arr에 저장
		String[] arr1 = br.readLine().split(" ");
		
		// 사람의 수 : L, 파티가 열렸던 곳의 넓이 : P
		int L = Integer.parseInt(arr1[0]);
		int P = Integer.parseInt(arr1[1]);
		
		// 상근이가 계산한 참가자의 수 : num
		int num = L * P;
		
		// 두번째 줄 입력받은 숫자들 배열 arr2에 저장
		String[] arr2 = br.readLine().split(" ");
		
		// int형 배열 Parr 생성
		int[] Parr = new int[arr2.length];
		
		// String형 배열인 arr2에 있는 데이터를 int형으로 바꾸어 int형 배열 Parr에 저장
		for(int i = 0; i < Parr.length; i++) {
			Parr[i] = Integer.parseInt(arr2[i]);
		}
		
		for(int i = 0; i < Parr.length; i++){
			// 상근이가 계산한 참가자의 수 - 각 기사에 적혀있는 참가자의 수
			System.out.print(Parr[i] - num);
			
			// 마지막에는 공백이 필요없으니 -1을 해주어 마지막에서 두번째 까지만 공백을 넣는다
			if(i < Parr.length - 1) {
				System.out.print(" ");
			}
		}
		
	}	
}