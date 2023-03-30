import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int X;
		int Y;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("");
		X = sc.nextInt();
		System.out.print("");
		Y = sc.nextInt();
		
		if (X > 0 && Y > 0) {
			System.out.println("1");
		}
		else if(X < 0 && Y > 0){
			System.out.println("2");
		}
		else if(X < 0 && Y < 0){
			System.out.println("3");
		}
		else if(X > 0 && Y < 0){
			System.out.println("4");
		}
		

		

	}

}