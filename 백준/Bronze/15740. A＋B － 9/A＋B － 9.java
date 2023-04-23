import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력에 사용할 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력받기
		String[] arr = br.readLine().split(" ");
		
		// 정수 : A, B
		BigInteger A = new BigInteger(arr[0]);
		BigInteger B = new BigInteger(arr[1]);
		
		// A + B 출력
		System.out.println(A.add(B));
		
		
	}	
}