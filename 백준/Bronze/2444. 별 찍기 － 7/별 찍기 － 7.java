import java.util.*;

public class Main {

	public static void main(String[] args){
		// 입출력에 사용할 객체
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        for(int i = 1; i <= N; i++) {
        	for(int j = 1; j <= N-i; j++) {
        		System.out.print(" ");
        	}
        	for(int j = 1; j <= 2*i-1; j++) {
        		System.out.print("*");
        	}
        	System.out.println("");
        }
        for(int i = N-1; i >= 1; i--) {
        	for(int j = 1; j <= N-i; j++) {
        		System.out.print(" ");
        	}
        	for(int j = 1; j <= 2*i-1; j++) {
        		System.out.print("*");
        	}
        	System.out.println("");
        }
        
        
	}
}