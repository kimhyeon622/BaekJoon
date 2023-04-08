import java.math.BigInteger;
import java.util.*;

public class Main {

	public static void main(String[] args){
		// 입출력에 사용할 객체
        Scanner sc = new Scanner(System.in);
        
        // 큰 수를 받기위해 BigInteger형으로 받는다
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();
        
        // BigInteger를 더할 떄는 add()를 사용해야함
        System.out.println(A.add(B));
	}
}