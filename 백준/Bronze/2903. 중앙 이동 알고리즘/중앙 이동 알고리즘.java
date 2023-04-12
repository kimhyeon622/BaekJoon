import java.util.*;

public class Main {

	public static void main(String[] args){
		// 입출력에 사용할 객체
        Scanner sc = new Scanner(System.in);
        // 몇번을 반복할지 받을 변수 N
        int N = sc.nextInt();
        // 한줄의 점 개수
        int count = 2;
        
        // N번 반복
        for(int i = 0; i < N; i++) {
        	// 2, 3, 5, 9, 17....
        	count += count-1;
        }
        // count의 제곱
        System.out.println(count*count);    
	}
}