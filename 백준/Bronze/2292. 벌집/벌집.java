import java.util.*;

public class Main {

	public static void main(String[] args) {
		// 입출력에 사용할 객체
		Scanner sc = new Scanner(System.in);
		// 숫자 N, 도달가능한 방의 번호 : room, 지나가는 방의 개수 : cnt
		int N = sc.nextInt();
		int room = 1;
		int cnt = 1;

		// N이 1일떄는 실행이 안되게 i < N으로 해준다
		for (int i = 1; i < N; i++) {
			// 도달 가능한 방의 번호를 구한다
			// 1, 7, 19, 37, 61... 이렇게 각 횟수에 따라 최대로 갈 수 있는 방의 번호가 나온다.
			// 방 개수는 1, 6, 12, 18, 24개 순으로 방의 개수가 많아지므로, 
			// i * 6으로 room에 누적하면 최대로 도달 가능한 방의 번호를 구할 수 있다.
			room += i * 6;
			// room이 N보다 크거나 같다면 실행한다
			if (N <= room) {
				// i가 1부터 시작하지만, N이 1일경우 실행되지 않으니 +1를 해준다
				cnt = i + 1;
				// 그리고 반복문을 나간다
				break;
			}
		}
		// 지나가는 방의 개수가 들어있는 cnt 출력
		System.out.println(cnt);
	}
}