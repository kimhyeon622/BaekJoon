import java.io.IOException;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// 입출력에 사용할 객체
		Scanner sc = new Scanner(System.in);

		// 테스트 케이스 개수 : T
		int T = sc.nextInt();
		// 테스트 케이스만큼 반복
		for (int i = 0; i < T; i++) {
			// 조규현의 좌표(x1, y1)와 조규현이 계산한 류재명과의 거리(r1)
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double r1 = sc.nextDouble();
			// 백승환의 좌표(x2, y2)와 백승환이 계산한 류재명과의 거리(r2)
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double r2 = sc.nextDouble();

			// 두 중점 거리 : d, 반지름의 합 : R, 반지름의 차 : r
			double d = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
			double R = Math.pow(r1 + r2, 2);
			double r = Math.pow(r1 - r2, 2);

			// 두 원의 중심이 같고, 반지름도 같을 때(접점의 개수가 무한)
			if (x1 == x2 && y1 == y2 && r1 == r2) {
				System.out.println(-1);
				// 두 원이 서로 외접하지 않을 떄 || 서로 내접하지 않을 때
			} else if (d > R || d < r) {
				System.out.println(0);
				// 내접일 때 || 외접일 때
			} else if (d == r || d == R) {
				System.out.println(1);
				// 그 외에는 접점이 두개다
			} else {
				System.out.println(2);
			}

		}
	}
}