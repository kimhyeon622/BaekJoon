import java.util.*;

public class Main {

	public static void main(String[] args){
		// 입출력에 사용할 객체
        Scanner sc = new Scanner(System.in);
        int ko = 0;
        int yo = 0;
        
        // 변환할 수 : N, 진법 수 : B
        String S = sc.next();
        
        for(int i = 0; i < S.length(); i++) {
        	char ch = S.charAt(i);
        	if(ch == 'K') {
        		if(ko == 0) {
        			ko++;
        		}
        	}

        	if(ch == 'O') {
        		if(ko == 1) {
        			ko++;
        		}
        		if(yo == 1) {
        			yo++;
        		}
        	}
        	
        	if(ch == 'R') {
        		if(ko == 2) {
        			ko++;
        		}
        	} 
        	
        	if(ch == 'E') {
        		if(ko == 3) {
        			ko++;
        		}
        		if(yo == 4) {
        			yo++;
        		}
        	} 
        	
        	if(ch == 'A') {
        		if(ko == 4) {
        			ko++;
        		}
        	} 
        	
        	if(ch == 'Y') {
        		if(yo == 0) {
        			yo++;
        		}
        	}
        	
        	if(ch == 'N') {
        		if(yo == 2) {
        			yo++;
        		}
        	}
        	
        	if(ch == 'S') {
        		if(yo == 3) {
        			yo++;
        		}
        	}
        	
        	if(ch == 'I') {
        		if(yo == 5) {
        			yo++;
        		}
        	}
        	
        	if(ko == 5) {
        		System.out.println("KOREA");
        		break;
        	}
        	if(yo == 6) {
        		System.out.println("YONSEI");
        		break;
        	}
        	
        }
        
	}
}