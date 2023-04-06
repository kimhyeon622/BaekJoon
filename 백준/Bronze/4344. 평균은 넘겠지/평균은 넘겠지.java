import java.util.*;

public class Main {

	public static void main(String[] args){
		// 입출력에 사용할 객체
        Scanner sc = new Scanner(System.in);
        // 테스트 케이스의 개수 : C, 성적을 저장할 배열 : arr
        int C = sc.nextInt();
        int[] arr;
        
        for(int i = 0; i < C; i++) {
        	int N = sc.nextInt();
        	arr = new int[N];
        	// sum 선언 및 초기화
        	double sum = 0;
        	
        	for(int j = 0; j < N; j++) {
        		// 성적 입력
        		int num = sc.nextInt();
        		arr[j] = num;
        		// 성적 누적
        		sum += num;
        	}
        	// 평균
        	double age = sum / N;
        	// 평균이 넘는 학생 수
        	double cnt = 0;
        	
        	// 평균이 넘는 학생들의 비율
        	for(int j = 0; j < N; j++) {
        		if(arr[j] > age) {
        			cnt++;
        		}
        	}
        	
        	// printf를 써서 %.3f로 소수점 3자리까지만 출력
        	System.out.printf("%.3f%%\n", (cnt/N)*100);
        	
        }
        

	}    
}