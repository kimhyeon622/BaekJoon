import java.util.*;

public class Main {

	public static void main(String[] args){
		// 입출력에 사용할 객체
        Scanner sc = new Scanner(System.in);
        
        // 테스트 케이스의 개수 : C, 성적을 저장할 배열 : arr
        String S = sc.next();
        int cnt = 0;
        
        for(int i = 0; i < S.length(); i++) {
        	char ch = S.charAt(i);
        	
        	// index가 초과되는 일을 방지
        	if(i == S.length()-1){
        		cnt++;
        		break;
        	}
        	
        	// 글자가 c일떄
        	if(ch == 'c') {
        		// c=
        		if(S.charAt(i+1) == '=') {
        			i++;
        			cnt++;
        			continue;
        		}
        		// c-
        		if(S.charAt(i+1) == '-') {
        			i++;
        			cnt++;
        			continue;
        		}
        	} 
        	
        	// 글자가 d일떄
        	if(ch == 'd') {
        		// dz
        		if(S.charAt(i+1) == 'z') {
        			// dz=
        			if(i+1 == S.length()-1) {
        				
        			}else if(S.charAt(i+2) == '=') {
        				i++;
        				i++;
            			cnt++;
            			continue;
        			}
        			
        		}
        		
        		// d-
        		if(S.charAt(i+1) == '-') {
        			i++;
        			cnt++;
        			continue;
        		}
        	}
        	// 글자가 l일떄
        	if(ch == 'l') {
        		// lj
        		if(S.charAt(i+1) == 'j') {
        			i++;
        			cnt++;
        			continue;
        		}
        	}
        	
        	// 글자가 n일떄
        	if(ch == 'n') {
        		// nj
        		if(S.charAt(i+1) == 'j') {
        			i++;
        			cnt++;
        			continue;
        		}
        	}
        	
        	// 글자가 s일떄
        	if(ch == 's') {
        		// s=
        		if(S.charAt(i+1) == '=') {
        			i++;
        			cnt++;
        			continue;
        		}
        	}
        	
        	// 글자가 일떄
        	if(ch == 'z') {
        		// z=
        		if(S.charAt(i+1) == '=') {
        			i++;
        			cnt++;
        			continue;
        		}
        	}
        	
        	cnt++;
		}
        
        System.out.println(cnt);
        
	}    
}