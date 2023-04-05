import java.util.*;

public class Main {

	public static void main(String[] args){
		// 입출력에 사용할 객체
        Scanner sc = new Scanner(System.in);
        
        // 점괘 : S
        int N = sc.nextInt();
        String[] arr = new String[N];
        
        for(int i = 0; i < N; i++) {
        	arr[i] = sc.next();
        }
        int len = arr[0].length();
        for(int i = 0; i < len; i++) {
        	// 첫번쨰 파일의 i번쨰 단어
        	char ch = arr[0].charAt(i);
        	// 파일의 이름이 같으면 true, 다르면 false
        	boolean check = true;
        	
        	for(int j = 0; j < N-1; j++) {
        		if(arr[j].charAt(i) != arr[j+1].charAt(i)) {
        			check = false;
        			break;
        		}
        	}
        	
        	if(check) {
        		System.out.print(arr[0].charAt(i));
        	}else {
        		System.out.print("?");
        	
        	}
        }
        
	}    
}