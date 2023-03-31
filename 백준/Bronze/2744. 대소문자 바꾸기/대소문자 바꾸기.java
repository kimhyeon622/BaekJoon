import java.util.*;

public class Main {

	public static void main(String[] args){
		// 입출력에 사용할 객체
        Scanner sc = new Scanner(System.in);
        
        // 문자열 입력받기
        String S = sc.next();
        String ch = "";
        
        for(int i = 0; i < S.length(); i++) {
        	char st = S.charAt(i);
        	// 대문자일떄
        	if(Character.isUpperCase(st)) {
        		// 소문자로 변환 후 저장
        		ch += Character.toLowerCase(st);
        	}
        	// 소문자일 떄
        	if(Character.isLowerCase(st)) {
        		// 대문자로 변환 후 저장
        		ch += Character.toUpperCase(st);
        	}
        }
        
        System.out.println(ch);
       

	}
}