import java.util.*;

public class Main {

	public static void main(String[] args){
		// 입출력에 사용할 객체
        Scanner sc = new Scanner(System.in);
		
        // 숫자를 받을 횟수
        int N = sc.nextInt();
        // 숫자를 문자열로 입력 받기
        String S = sc.next();
        // 더한 값을 저장하기 위한 변수
        int num = 0;
        
        // N번 만큼 반복
        for(int i = 0; i < N; i++) {
        	// 문자열의 처음부터 하나씩 num에 더한다
        	num += Integer.parseInt(S.substring(i,i+1));
        }
        
        // num 출력
        System.out.println(num);
	}
}