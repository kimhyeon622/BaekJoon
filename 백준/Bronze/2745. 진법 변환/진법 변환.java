import java.util.*;

public class Main {

	public static void main(String[] args){
		// 입출력에 사용할 객체
        Scanner sc = new Scanner(System.in);
        
        // 변환할 문자열 : N, 진법 수 : B
        String N = sc.next();
        int B = sc.nextInt();
        
        // B진법 수 N을 10진법으로 변환
        System.out.println(Integer.parseInt(N, B));
        
        
	}
}