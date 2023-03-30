import java.util.*;

public class Main {

	public static void main(String[] args){
		// 입출력에 사용할 객체
        Scanner sc = new Scanner(System.in);
        
        // 문자열 입력 받기
        String S = sc.nextLine();
        int st = 0;
        int sp = 0;
        
        // 앞뒤로 공백제거 trim
        S = S.trim(); 
        
        for(int i = 0; i < S.length(); i++) {
			char ck = S.charAt(i);
			if(ck == ' ') {
				sp++;
			}else {
				st++;
			}
		}
        if(st != 0) {
        	System.out.println(sp+1);
        }else {
        	System.out.println(0);
        }
        
        
	}
}