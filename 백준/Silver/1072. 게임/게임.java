import java.util.*;

public class Main {

	public static void main(String[] args){
		// 입출력에 사용할 객체
        Scanner sc = new Scanner(System.in);
        // 게임 수 : X, 이긴 게임 : Y, 승률 : Z
        long X = sc.nextInt();
        long Y = sc.nextInt();
        long Z = 100 * Y/X;
        
        // 99프로 이상은 확률이 변하지 않는다
        if(Z >= 99) {
        	System.out.println("-1");
        }else {
        	// 확률이 변하는 최소값은 Z+1로 변했을 떄
        	long A = (Z + 1) * X - 100 * Y;
        	long B = 100 - (Z + 1);
        	if(A % B == 0) {
        		System.out.println(A/B);
        	}else {
        		// 나머지가 있다면 소수점 떄문이니 +1을 해준다
        		System.out.println(A/B + 1);
        	}

        }


	}
}