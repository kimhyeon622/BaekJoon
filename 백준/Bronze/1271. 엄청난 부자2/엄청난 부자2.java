import java.math.BigInteger;
import java.util.*;

public class Main {

	public static void main(String[] args){
		// 입출력에 사용할 객체
        Scanner sc = new Scanner(System.in);
		
        // 숫자 n
        BigInteger n = sc.nextBigInteger();
        // 숫자 m
        BigInteger m = sc.nextBigInteger();
        
        // 계산해서 출력
        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));
	}
}