import java.util.*;

public class Main {

	public static void main(String[] args){
		// 입출력에 사용할 객체
        Scanner sc = new Scanner(System.in);
		
        // 문자열 S
        String S = sc.next();
        
        // 반복문
        for(char c = 'a'; c <= 'z'; c++) {
        	System.out.print(S.indexOf(c) +" ");
        }
        
	}
}
