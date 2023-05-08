import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력 받기
		String[] arr = br.readLine().split(" ");
		
        // 비교를 위한 배열
		// ascending배열 : as, descending베열 : des
		int[] as = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] des = {8, 7, 6, 5, 4, 3, 2, 1};
		
		// 배열이 어느정도 맞는지 확인해줄 변수 : a, b
		int a = 0;
		int d = 0;
		
		for(int i = 0; i < arr.length; i++) {
			// as배열과 arr배열이 같다면
			if(as[i] == Integer.parseInt(arr[i])) {
				// a 증가
				a++;
			// des배열과 arr배열이 같다면
			} else if(des[i] == Integer.parseInt(arr[i])){
				// d 증가
				d++;
			} 
		}
		
		// a가 8일때
		if(a == 8) {
			// ascending 출력
			System.out.println("ascending");
		}
		// d가 8일때
		else if(d == 8) {
			// descending 출력
			System.out.println("descending");
		// 둘다 아니면
		} else {
			// mixed 출력
			System.out.println("mixed");
		}
	}	
}