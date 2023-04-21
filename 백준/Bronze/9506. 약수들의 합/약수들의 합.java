import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력에 사용할 객체
		Scanner sc = new Scanner(System.in);
		
		// 무한반복
		while(sc.hasNext()) {
			// 숫자 : n, 약수를 저장할 배열 : arr, 약수의 개수만큼 카운트 : cnt, 약수들의 합 : sum
			int n = sc.nextInt();
			int[] arr = new int[n + 1];
			int cnt = 0;
			int sum = 0;
			
			// n이 -1이면 반복문 나가기
			if(n == -1) {
				break;
			}
			
			// 약수들을 구해서 배열에 저장
			for(int i = 1; i <= n; i++) {
				if(n % i == 0) {
					arr[cnt++] = i; 
				}
			}
			
			// n 출력
			System.out.print(n);
			
			// 약수들의 합 구하기
			for(int i = 0; i < cnt - 1; i++) {
				sum += arr[i];
			}
			
			// n과 약수들의 합이 같으면
			if(n == sum) {
				// 출력 형식에 맞게 추가 출력
				for(int i = 0; i < cnt - 1; i++) {
					if(i == 0) {
						System.out.print(" = " + arr[i]);
					}else {
						System.out.print(" + " + arr[i]);
					}
				}
				System.out.println("");
			// n과 약수들의 합과 다르면
			} else {
				// is Not perfect. 추가 출력
				System.out.println(" is NOT perfect.");
			}
			
		}
		
	}
}