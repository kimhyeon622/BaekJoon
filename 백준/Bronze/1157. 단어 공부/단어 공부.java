import java.util.*;

public class Main {

	public static void main(String[] args){
		// 입출력에 사용할 객체
        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        int max = 0;
        char ch = '?';
        int[] arr = new int[26];
        
        S = S.toUpperCase();
        
        for(int i = 0; i < S.length(); i++) {
        	
        	arr[S.charAt(i) - 'A']++;
        }
        
        for(int i = 0; i < 26; i++) {
        	if(arr[i] > max) {
        		max = arr[i];
        		ch = (char)(i + 65);
        	}else if(arr[i] == max){
        		ch = '?';
        	}
        }
        
       System.out.println(ch);

	}
}