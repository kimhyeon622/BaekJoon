import java.util.*;

public class Main {

	public static void main(String[] args) {
		// 입출력에 사용할 객체
		Scanner sc = new Scanner(System.in);
		
		// 재환이가 가장 길게 "ah" : S, 의사가 요구하는 "ah" : s
		String S = sc.next();
		String s = sc.next();
		
		// 의사가 "h"만 요구 했을 때
		if(S == "h" && s == "h") {
			System.out.println("go");
		// 그렇지 않을 때
		}else {
			// 재환이가 가장 길게 낼수 있는 "ah"가 의사가 요구하는 "ah"보다 길면 "go" 아니면 "no"
			System.out.println(S.length() >= s.length() ? "go" : "no");
		}

		
		
		
		
	}
}