import java.util.*;

public class Main {

	public static void main(String[] args) {
		// 입출력에 사용할 객체
		Scanner sc = new Scanner(System.in);
		// 성적과 평점을 index에 맞춰서 각각의 배열에 저장한다
		String[] arr1 = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D+", "D0", "D-", "F"};
		double[] arr2 = {4.3, 4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0};
		
		// C언어 성적
		String S = sc.next();
		
		// S에 입력받은 성적이 arr1에 몇번째 index에 있는지 찾는다
		int idx = Arrays.asList(arr1).indexOf(S);
		// 찾은 index값으로 arr2[찾은index]를 출력하면 해당 평점이 나온다
		System.out.println(arr2[idx]);

	}
}