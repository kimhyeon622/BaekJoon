import java.util.*;

public class Main {

	public static void main(String[] args){
		// 입출력에 사용할 객체
        Scanner sc = new Scanner(System.in);
		
        // char타입으로 입력받기
        char S = sc.nextLine().charAt(0);
        // 정수형으로 변환
        int num = (int)S;
        
        // num 출력
        System.out.println(num);
	}
}