import java.util.*;

public class Main {

	public static void main(String[] args){
		// 입출력에 사용할 객체
        Scanner sc = new Scanner(System.in);
        
        // 사람의 수 : N
        int N = sc.nextInt();
        
        System.out.println(N*N-N);
	}
}