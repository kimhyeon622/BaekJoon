import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int H;
		int M;
		int S;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("");
		H = sc.nextInt();
		System.out.print("");
		M = sc.nextInt();
		System.out.print("");
		S = sc.nextInt();
		
		M = M + S;
		boolean run = true;
		while(run) {
			if(M >= 60) {
				M -= 60;
				H += 1;
			}
			else if(M < 0){
				M += 60;
				H -= 1;
			}else if(H >= 24){
				H -= 24;
			}
			else if(M < 60 || H < 24 ) {
				run = false;
			}
		}
		
		System.out.print(H+" "+M);
		
}
}