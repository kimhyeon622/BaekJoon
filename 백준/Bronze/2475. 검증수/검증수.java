import java.util.*;

public class Main {

	public static void main(String[] args){
		// 입출력에 사용할 객체
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        
        for(int i = 0; i < 5; i++) {
        	int num = sc.nextInt();
        	sum += num*num;
        }
        
        System.out.println(sum%10);
	}
}