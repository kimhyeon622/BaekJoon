import java.math.BigInteger;
import java.util.*;

public class Main {

	public static void main(String[] args)  {
		
        // 입출력에 사용할 객체
		Scanner sc = new Scanner(System.in);
		
		BigInteger Apple = sc.nextBigInteger();
		BigInteger difference = sc.nextBigInteger();
		
		// 사과를 차이만큼 빼주기
		BigInteger subtract = Apple.subtract(difference);
		
		// 빼준 사과를 반으로 나누기
		BigInteger Divide = subtract.divide(BigInteger.valueOf(2));
		
		// Klaudia : 나눈 사과에서 뺀만큼 다시 더해주기
		System.out.println(Divide.add(difference));
		// Natalia : 나눈 사과를 그대로 출력
		System.out.println(Divide);
		
	}
}