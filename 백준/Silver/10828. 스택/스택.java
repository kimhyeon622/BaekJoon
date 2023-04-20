import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {

	public static void main(String[] args) throws IOException {
		// 입출력에 사용할 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 스택 : st
		Stack<String> st = new Stack<>();
		// 명령의 수 : N
		int N = Integer.parseInt(br.readLine());
		
		// 명령의 수만큼 반복
		for(int i = 0; i < N; i++) {
			// 명령 : m
			String m = br.readLine();
			// 공백을 기준으로 stack배열에 담기
			String[] stack = m.split(" ");
			
			// push
			if(stack[0].equals("push")) {
				// push명령어 수행(출력 X)
				st.push(stack[1]);
			
			// pop	
			} else if(stack[0].equals("pop")) {
				// st에 정수가 있으면 pop명령어 수행
				if(!st.empty()) {
					System.out.println(st.pop());
				// 정수가 없으면 -1
				} else {
					System.out.println(-1);
				}
				
			// size	
			} else if(stack[0].equals("size")) {
				// st의 size 출력
				System.out.println(st.size());
			
			// empty
			} else if(stack[0].equals("empty")) {
				// st에 정수가 없으면 1출력
				if(st.empty()) {
					System.out.println(1);
				// 있으면 0출력
				} else {
					System.out.println(0);
				}
			
			// top
			} else if(stack[0].equals("top")) {
				// st에 정수가 있으면 가장 위에 있는 정수 출력
				if(!st.empty()) {
					System.out.println(st.peek());
				// 정수가 없으면 -1출력
				} else {
					System.out.println(-1);
				}
			}
			
		}
	}
}