import java.util.*;

public class Main {

	public static void main(String[] args){
		// 입출력에 사용할 객체
        Scanner sc = new Scanner(System.in);
		
        // 숫자 A
        String S = sc.next();
        
        for(char c = 'a'; c <= 'z'; c++) {
        	System.out.print(S.indexOf(c) +" ");
        }
        
	}
}