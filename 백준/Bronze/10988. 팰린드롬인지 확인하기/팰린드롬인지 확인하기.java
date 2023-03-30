import java.util.*;

public class Main {

	public static void main(String[] args){
		// 입출력에 사용할 객체
        Scanner sc = new Scanner(System.in);
        // 문자열 입력 받기
        String S = sc.next();
        // 최종으로 팰린트롬인지 아닌지 출력할 변수
        int cnt = 0;
        
        // 반복문
        for(int i = 1; i <= S.length(); i++) {
        	// 문자열의 첫글자 하나씩 올라감
        	char ch1 = S.charAt(i-1);
        	// 문자열의 맨 마지막글자부터 하나씩 내려감
        	char ch2 = S.charAt(S.length()-i);
        	// 비교한 문자가 같을 경우 1을 cnt에 대입
        	if(ch1 == ch2) {
        		cnt = 1;
        	// 다를 경우 0을 대입하고 반복문 나가기
        	}else {
        		cnt = 0;
        		break;
        	}
        }
        // 마지막으로 cnt를 출력
        System.out.println(cnt);
	}
}