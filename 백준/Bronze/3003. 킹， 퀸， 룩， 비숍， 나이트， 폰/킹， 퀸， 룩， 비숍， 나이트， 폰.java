import java.util.*;

public class Main {

	public static void main(String[] args){
		// 입출력에 사용할 객체
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[6];
        int[] arr1 = {1, 1, 2, 2, 2, 8};
        
        for(int i = 0; i < 6; i++) {
        	arr[i] = sc.nextInt();
        }
        
        for(int i = 0; i < 6; i++) {
        	System.out.print(arr1[i]-arr[i] + " ");
        }
        
        
	}
}