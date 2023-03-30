import java.math.BigInteger;
import java.util.*;

public class Main {

	public static void main(String[] args){
		// 입출력에 사용할 객체
        Scanner sc = new Scanner(System.in);
		
        // 숫자 A
        BigInteger A = sc.nextBigInteger();
        // 숫자 B
        BigInteger B = sc.nextBigInteger();
        
        // 계산해서 출력
        System.out.println(A.add(B));
        System.out.println(A.subtract(B));
        System.out.println(A.multiply(B));
	}
}