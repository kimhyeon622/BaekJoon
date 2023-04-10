import java.util.*;

public class Main {

	public static void main(String[] args){
		// 입출력에 사용할 객체
        Scanner sc = new Scanner(System.in);
        
        String[][] arr = new String[5][15];
        
        // 다섯줄의 입력
        for(int i = 0; i < 5; i++) {
        	String S = sc.next();
        	// 글자 개수 만큼 반복하여 배열에 저장
        	for(int j = 0; j < S.length(); j++) {
        		// 글자를 하나씩 뽑아온다
        		char ch = S.charAt(j);
        		// String타입으로 변환하여 배열에 저장
        		arr[i][j] = String.valueOf(ch);
        	}
        }
        // 최대의 글자 수만큼 돌린다
        for(int i = 0; i < 15; i++) {
        	// 최대 줄의 개수 만큼 돌린다
        	for(int j = 0; j < 5; j++) {
        		// 해당 index에 들어있는 값이 null값이 아니면 해당 index에 들어있는 값 출력
        		if(arr[j][i] != null) {
        			System.out.print(arr[j][i]);
        		}
        		
        	}
        }
        
	}
}