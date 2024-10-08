import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 네 가지 구호 중 한 가지에 해당하는 문자열이 주어진다.
		String Text = sc.next();
		
		// 주어진 구호에 맞춰 알맞은 응원에 해당하는 문자열을 출력한다
		// 구호 SONGDO에 대해
		if(Text.equals("SONGDO")) {
			// HIGHSCHOOL로 응원.
			System.out.println("HIGHSCHOOL");
		// 구호 CODE에 대해
		}else if(Text.equals("CODE")) {
			// MASTER로 응원.
			System.out.println("MASTER");
		// 구호 2023에 대해
		}else if(Text.equals("2023")) {
			// 0611로 응원.
			System.out.println("0611");
		// 구호 ALGORITHM에 대해
		}else if(Text.equals("ALGORITHM")) {
			// CONTEST로 응원.
			System.out.println("CONTEST");
		}
		
	}	
}