import java.util.*;

public class Main {

	public static void main(String[] args){
		// 입출력에 사용할 객체
        Scanner sc = new Scanner(System.in);
        
        // 숫자를 저장할 2차원배열 : arr, 최댓값을 저장할 변수 : max, 최댓값의 좌표 : idx, jdx 
        int[][] arr = new int[9][9];
        int max = -1;
        int idx = 0;
        int jdx = 0;
        
        
        for(int i = 0; i < 9; i++) {
        	for(int j = 0; j < 9; j++) {
        		arr[i][j] = sc.nextInt();
        		if(max < arr[i][j]) {
        			max = Math.max(max, arr[i][j]);
        			idx = i;
        			jdx = j;
        		}
        	}
        }
        
        System.out.println(max);
        // 0부터 시작하기 때문에 좌표를 맟추려면 1씩 더해줘야함
        System.out.println((idx+1) + " " + (jdx+1));
	}    
}