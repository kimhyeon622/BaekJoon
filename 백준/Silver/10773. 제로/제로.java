import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력에 사용할 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 정수의 가장 최근에 쓴 수를 지우기 위해 스택을 사용
		Stack<Integer> stack = new Stack<>();
		
		// 정수 : K
		int K = Integer.parseInt(br.readLine());
		
		// 초기값 0 넣기
		stack.push(0);
		
		// 입력 받기
		for(int i = 0; i < K; i++) {
			// 입력을 받아서
			int push = Integer.parseInt(br.readLine());
			// push가 0이 아니면 스택에 push한다
			if(push != 0) {
				stack.push(push);
			// push가 0일 경우 가장 최근에 쓴 수를 지운다
			}else {
				stack.pop();
			}
		}
		
		// 스택에 남아있는 모든 값을 저장할 변수 : num
		int num = 0;
		// 스택의 size를 저장
		int size = stack.size();
		
		// 스택에 남아있는 값 더하기
		for(int i = 0; i < size; i++) {
			// 스택에 pop을 하여 남아있는 값을 뽑아서 num에 더한다
			num += stack.pop();
		}
		
		// 모든 값이 저장된 num출력
		System.out.println(num);
		
	}	
}