import java.util.*;

public class Main {

	public static void main(String[] args){
		// 입출력에 사용할 객체
        Scanner sc = new Scanner(System.in);
		
        // 숫자 A
        long A = sc.nextLong();
        // 숫자 B
        long B = sc.nextLong();
        
        // 계산해서 출력
        System.out.println(Math.abs(A-B));
        
	}
}
