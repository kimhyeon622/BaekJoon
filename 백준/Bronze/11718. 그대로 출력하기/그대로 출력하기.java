import java.util.*;

public class Main {

	public static void main(String[] args){
		// 입출력에 사용할 객체
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextLine()) {
        	String S = sc.nextLine();
        	System.out.println(S);
		}
        sc.close();
	}
}