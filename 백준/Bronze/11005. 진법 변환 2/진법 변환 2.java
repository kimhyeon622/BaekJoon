import java.util.*;

public class Main {

	public static void main(String[] args){
		// 입출력에 사용할 객체
        Scanner sc = new Scanner(System.in);
        
        // 변환할 수 : N, 진법 수 : B
        int N = sc.nextInt();
        int B = sc.nextInt();
        
        // 10진법 수 N을 B진법으로 변환
        String S = Integer.toString(N, B);
        
        // 소문자로 나오기 때문에 대문자로 변환하여 출력
        System.out.println(S.toUpperCase());
        
        
	}
}