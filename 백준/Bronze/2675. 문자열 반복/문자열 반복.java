import java.util.*;

public class Main {

	public static void main(String[] args){
		// 입출력에 사용할 객체
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        String[] arr = new String[T];
        int cnt = 0;
        int SS = -1;
        for(int i = 0; i < T; i++) {
        	arr[i] = "";
        }
        for(int i = 0; i < T; i++) {
        	int R = sc.nextInt();
        	String S = sc.next();
        	for(int j = 0; j < S.length(); j++ ) {
        		SS++;
        		for(int k = 0; k < R; k++) {
        			arr[cnt] += S.charAt(SS);
        		}
        		
        	}
        	cnt++;
        	SS = -1;
        	
        	
        }
        
        	for(int i = 0; i < arr.length; i++) {
        		System.out.println(arr[i]);
        	}
        
	}
}