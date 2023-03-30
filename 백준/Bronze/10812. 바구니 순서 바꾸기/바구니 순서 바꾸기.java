import java.util.*;

public class Main {

	public static void main(String[] args){
		// 입출력에 사용할 객체
        Scanner sc = new Scanner(System.in);
        
        // 바구니의 개수
        int N = sc.nextInt();
        // 회전 시키는 수
        int M = sc.nextInt();
        
        // 회전하기 전 배열
        int[] arr = new int[N+1];
        // 회전한 후 배열
        int[] arr1 = new int[N+1];
        
        // 시작점부터 하나씩 넣기 위한 변수
        int cnt = 0;
        
        // 배열에 숫자 넣기
        for(int a = 1; a < N+1; a++) {
        	arr[a] = a;
        	arr1[a] = a;
        }
        
        // M번 반복
        for(int st = 0; st < M; st++) {
        
        // 시작점 i, 끝점 j, 중간지점 k
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        
        // 시작점부터 cnt시작
        cnt = i;
        
        // 중간지점부터 끝지점까지 배열에 저장
        for(int mid = k; mid <= j; mid++) {
        	arr1[cnt] = arr[mid];
        	cnt++;
        }
        // 처음지점 바구니부터 중간전까지의 바구니 저장
        for(int begin = i; begin < k; begin++) {
        	arr1[cnt] = arr[begin];
        	cnt++;
        }
        
        // 배열을 똑같게 설정
        for(int save = 1; save < arr1.length; save++) {
        	arr[save] = arr1[save];
        }
        } 
        
        // 다 끝나고 배열 출력
        for(int i = 1; i < arr1.length; i++) {
        	System.out.print(arr1[i] + " ");
        }
	}
}