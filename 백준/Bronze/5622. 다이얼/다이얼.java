import java.util.*;

public class Main {

	public static void main(String[] args){
		// 입출력에 사용할 객체
        Scanner sc = new Scanner(System.in);
        
        // 문자열 S 입력 받기
        String S = sc.next();
        // 최소시간을 출력할 count
        int count = 0;
        
        // 문자열 크기만큼 반복
        for(int i = 0; i < S.length(); i++) {
        	// 문자를 하나씩 받는다
        	char st = S.charAt(i);
        // 문자에 해당하는 만큼 count증가
        switch (st) {
		case 'A': case 'B': case 'C':
			count += 3;
			break;
			
		case 'D': case 'E': case 'F':
			count += 4;
			break;

		case 'G': case 'H': case 'I':
			count += 5;
			break;
			
		case 'J': case 'K': case 'L':
			count += 6;
			break;	
			
		case 'M': case 'N': case 'O':
			count += 7;
			break;
			
		case 'P': case 'Q': case 'R': case 'S':
			count += 8;
			break;
			
		case 'T': case 'U': case 'V':
			count += 9;
			break;
			
		case 'W': case 'X': case 'Y': case 'Z':
			count += 10;
			break;
			
		default:
			// 다른값이 나오면 그냥 통과
			break;
        }
		}
        // 최종 카운트 출력
        System.out.println(count);
	}
}