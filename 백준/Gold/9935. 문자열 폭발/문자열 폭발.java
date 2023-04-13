import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		// 입출력에 사용할 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 문자열을 받을 S, 폭발 문자열을 받을 B
        String S = br.readLine();
        String B = br.readLine();
        
        // char형 스택 선언
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < S.length(); i++) {
        	// 입력 받은 문자열을 문자 하나씩 stack에 push한다
        	stack.push(S.charAt(i));
        	// 만약 stack의 크기가 폭발 문자열의 길이랑 같거나 많으면
        	if(stack.size() >= B.length()) {
        		boolean check = true;
        		// 폭발 문자열의 길이만큼 반복
        		for(int j = 0; j < B.length(); j++) {
        			// 폭발 문자열이 stack에 push되고 있다면
        			if(stack.get(stack.size() - B.length() + j) != B.charAt(j)) {
        				// check를 flase로 변환하고
        				check = false;
        				// 반복문을 나가주면서 pop하는 부분은 건너뛰어 준다
        				break;
        			}
        		}
        	
        		// check가 true일 경우 폭발 문자열이 아닐떄 작동하기 떄문에
        		if(check) {
        			for(int j = 0; j < B.length(); j++) {
        				// 폭발 문자열 만큼 pop해준다(srack에서 폭발 문자 뺴기)
        				stack.pop();
        			}
        		}
        	}
        }
        
        // String을 사용시 메모리 초과
        StringBuilder sb = new StringBuilder();
        // stack에 저장되어있는 문자들을 sb에 하나씩 넣어서 문자열 완성
        for(char ch : stack) {
        	sb.append(ch);
        }
        
        // sb의 길이가 0이상일경우 문자열을 출력하고 그렇지 않으면 FRULA를 출력
        System.out.println(sb.length() > 0 ? sb.toString() : "FRULA");
        
	}
}