import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int dice1;
		int dice2;
		int dice3;
		int money = 0;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("");
		dice1 = sc.nextInt();
		System.out.print("");
		dice2 = sc.nextInt();
		System.out.print("");
		dice3 = sc.nextInt();
	
		if (dice1 == dice2 && dice1 == dice3) {
			money = 10000 + dice1*1000;
		}
		else if(dice3 == dice2 || dice3 == dice1) {
			money = 1000 + dice3*100;
			
		}else if(dice1 == dice2) {
			money = 1000 + dice1*100;
			
		}else if(dice3 > dice2 && dice3 > dice1) {
			money = dice3*100;
			
		}else if(dice2 > dice3 && dice2 > dice1) {
			money = dice2*100;
			
		}else if(dice1 > dice2 && dice1 > dice3) {
			money = dice1*100;
		}
			
		System.out.println(money);
		
		
		
}
}
