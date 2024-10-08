import java.util.*;

public class Main{

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	 
    	// 송찬이가 필요한 배터리 : N
    	// 선생님이 가져온 배터리 : M
    	// 최대 10자리(10억) 정수까지 들어올 수 있다고 했으니 int 대신 long 사용
    	long N = sc.nextLong();
    	long M = sc.nextLong();
    	
    	// 송찬이가 원한 배터리면
    	if(N==M) {
    		// 1 출력
    		System.out.println(1);
    	// 그 외엔
    	} else {
    		// 0 출력
    		System.out.println(0);
    	}
    		
    	
    	
    }
    
   
};