import java.util.*;

public class Main {

	public static void main(String[] args){
		// 입출력에 사용할 객체
        Scanner sc = new Scanner(System.in);
        
        // 문자열 A,B 입력 받기
        String A = sc.next();
        String B = sc.next();
        
        // 거꾸로 저장할 배열
        String[] arr = new String[2];
        
        // 배열 초기화
        arr[0] = "";
        arr[1] = "";
        
        
        for(int i = 1; i < 4; i++) {
        	arr[0] += A.charAt(A.length()-i);
        }
        for(int i = 1; i < 4; i++) {
        	arr[1] += B.charAt(B.length()-i);
        }
        
        int A2 = Integer.parseInt(arr[0]);
        int B2 = Integer.parseInt(arr[1]);
        
        if (A2 > B2) {
			System.out.println(A2);
		}else {
			
			System.out.println(B2);
		}
        
	}
}