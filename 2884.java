import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int H;
		int M;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("");
		H = sc.nextInt();
		System.out.print("");
		M = sc.nextInt();
		
		M = M - 45;
		
		if(M < 0) {
			if(H > 0) {
				M = M + 60;
				H = H - 1 ;
			}else {
				H = 24;
				M = M + 60;
				H = H - 1 ;
			}
		} else if(M >= 60 ){
			M = M - 60;
			H = H + 1 ;
		}
		System.out.println(H+" "+M);
		

		

	}

}
