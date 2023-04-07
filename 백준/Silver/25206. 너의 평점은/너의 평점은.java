import java.util.*;

public class Main {

	public static void main(String[] args){
		// 입출력에 사용할 객체
        Scanner sc = new Scanner(System.in);
        
        // 단어 개수 : N, 문자열을 저장 : arr, 그룹 단어의 개수 : cnt
        String[] arr1 = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
        double[] arr2 = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};
        
        double sum1 = 0;
        double sum2 = 0;
        
        for(int i = 0; i < 20; i++) {
        	// 공백을 제거하여 나눠서 배열에 저장
        	String[] arr = sc.nextLine().split(" ");

        	if(!arr[2].equals("P")) {
        		// arr2와 같은 문자열을 arr1에서 찾는다
        		int idx = Arrays.binarySearch(arr1, arr[2]);
        		// 학점의 총합
        		sum1 += Double.parseDouble(arr[1]);
        		// 학점 * 과목평점의 총합
        		sum2 += Double.parseDouble(arr[1]) * arr2[idx];
        	}
        }
        System.out.printf("%.6f", sum2/sum1);
	}    
}