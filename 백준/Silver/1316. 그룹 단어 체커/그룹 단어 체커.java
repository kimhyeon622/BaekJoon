import java.util.*;

public class Main {

	public static void main(String[] args){
		// 입출력에 사용할 객체
        Scanner sc = new Scanner(System.in);
        
        // 단어 개수 : N, 문자열을 저장 : arr, 그룹 단어의 개수 : cnt
        int N = sc.nextInt();
        String[] arr = new String[N];
        int cnt = 0;
        
        // 문자열 N번 받기
        for(int i = 0; i < N; i++) {
        	arr[i] = sc.next();
        }
        
        // 그룹 단어 확인
        for(int i = 0; i < N; i++) {
        	// 이전 문자를 저장 : c, 한번 나온 문자 저장 : check
        	char c = ' ';
            int[] check = new int[26];
        	for(int j = 0; j < arr[i].length(); j++) {
        		char ch = arr[i].charAt(j);
            	// 이전 문자와 현재 문자가 같지 않을 경우
        		if(c != ch) {
            		// 해당 문자가 처음일 경우
            		if(check[ch - 'a'] == 0) {
            			check[ch - 'a'] = 1;
            			c = ch;
            		}
            		
            		// 이미 나온 적이 있을 경우
            		else {
            			// 반복분 끝
            			break;
            		}
            	}
        		
        		// 해당문자가 문자열의 마지막 문자라면
            	if(j == arr[i].length()-1) {
            		// cnt 증가
            		cnt++;
            	}
        	}
        	
        }
        
        System.out.println(cnt);
        
	}    
}