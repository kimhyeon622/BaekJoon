import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] array = new int[N];
		int M = 0;
		
		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			
			if(array[i] > M) {
					M = array[i];
				}
	
			}
		
		double age = 0;
		double num = 0;
		double num2 = 0;
		double num3 = 0;
		
		for(int i = 0; i < array.length; i++) {
			num = (double)array[i] / M; 
			num2 = 0;
			num2 = num2 + num;
			num3 = num2 / N; 
			age += num3;
			}
		System.out.println(age*100);
		}
	}