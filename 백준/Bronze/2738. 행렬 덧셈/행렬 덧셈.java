import java.util.*;

public class Main {

	public static void main(String[] args){
		// 입출력에 사용할 객체
        Scanner sc = new Scanner(System.in);
        
        // N, M 입력 받기
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[][] arr = new int[N+1][M+1]; 
        int[][] arr1 = new int[N+1][M+1]; 
        
        // A행렬
        for(int i = 0; i < N; i++) {
        	for(int j = 0; j < M; j++) {
        		arr[i][j] = sc.nextInt();
        	}
        	
        }
        // B행렬
        for(int i = 0; i < N; i++) {
        	for(int j = 0; j < M; j++) {
        		arr1[i][j] = sc.nextInt();
        	}
        	
        }
        
        // A행렬 + B행렬
        for(int i = 0; i < N; i++) {
        	for(int j = 0; j < M; j++) {
        		System.out.print(arr[i][j] + arr1[i][j] + " ");
        	}
        System.out.println("");	
        }

	}
}