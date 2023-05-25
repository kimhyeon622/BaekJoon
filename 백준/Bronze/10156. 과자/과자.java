import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 한 줄에 주어진 정수들을 입력 받아 배열에 저정한다
		String[] arr = br.readLine().split(" ");
		
		// 과자 한 개의 가격 : K, 사려고 하는 과자의 개수 : N, 현재 가진 돈 : M
		int K = Integer.parseInt(arr[0]);
		int N = Integer.parseInt(arr[1]);
		int M = Integer.parseInt(arr[2]);
		
		// 부모님께 받아야 하는 돈의 액수 : money
		// K * N : 과자를 사는데 필요한 금액
		// K * N - M : 과자를 사는데 필요한 금액 - 현재 돈 = 필요한 금액 
		int money = K * N - M;
		
		// 필요한 금액은 양수로 나오니 0보다 클때
		if(money > 0) {
			// money를 출력한다
			System.out.println(money);
		// 그렇지 않으면 돈이 딱 맞아 떨어지거나 남기때문에 부족한 돈은 없다
		} else {
			// 그렇기 떄문에 모두 0으로 출력한다
			System.out.println(0);
		}
		
	}	
}