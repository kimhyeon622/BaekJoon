import java.util.*;

public class Main {

	public static void main(String[] args) {
		// 입출력에 사용할 객체
		Scanner sc = new Scanner(System.in);
		// 몇개를 입력받을지 없으니 무한으로 입력받기
		while(sc.hasNext()){
			// 사람의 수 : N, 분배할 주식의 개수 : S
			int N = sc.nextInt();
			int S = sc.nextInt();
			System.out.println(S/(N+1));
		}
	}
}