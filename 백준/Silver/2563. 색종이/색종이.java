import java.util.*;

public class Main {

	public static void main(String[] args){
		// 입출력에 사용할 객체
        Scanner sc = new Scanner(System.in);
        
        // 도화지의 크기 100 * 100
        int[][] arr = new int[100][100];
        // 색종이의 수
        int N = sc.nextInt();
        
        // 색종이의 수만큼 만복
        for(int i = 0; i < N; i++) {
        	// 색종이를 어디서부터 붙일지 좌표값을 받음
        	int Y = sc.nextInt();
        	int X = sc.nextInt();
        	// 각각 x,y부터 10*10의 크기로 색종이를 붙인다
        	for(int y = Y; y < Y+10; y++) {
        		for(int x = X; x < X+10; x++) {
        			// 색종이를 붙이는 영역을 1로 바꾸어줌
        			arr[y][x] = 1;
        		}
        	}
        }
        
        // 색종이가 붙은 영역을 알기 위한 변수
        int count = 0;
        // 색종이가 붙은 검은 영역의 넓이 출력
        for(int i = 0; i < 100; i++) {
        	for(int j = 0; j < 100; j++) {
        		// 색종이가 붙은 영역이라면 count를 증가시킨다
            	if(arr[i][j] == 1) {
            		count++;
            	}
        	}
        }
        
        // 색종이가 붙은 검은 영역의 넓이
        System.out.println(count);
        
	}
}