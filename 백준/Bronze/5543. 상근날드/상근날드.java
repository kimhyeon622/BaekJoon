import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 햄버거 배열 : food, 음료 배열 : drink
		int[] food = new int[3];
		int[] drink = new int[2];
		
		// 입력은 총 5개가 들어온다
		// 그중 세번째까지는 햄버거 네번째, 다섯번째는 음료
		for(int i = 0; i < 5; i++) {
			// i가 3보다 적다면 실행
			// 0부터 시작하니 2까지만 받는다
			if(i < 3) {
				// food에 햄버거 가격 입력받은 후 저장
				food[i] = Integer.parseInt(br.readLine());
			// 그렇지 않으면 네번째부터 이니
			} else {
				// i에 3을 마이너스를 해주어 저장
				// index갯수는 2개로 지정해두었디 떄문
				drink[i - 3] = Integer.parseInt(br.readLine());
			}
			
		}
		
		// food와 drink 둘다 오름차 순으로 정렬해준다
		Arrays.sort(food);
		Arrays.sort(drink);
		
		// 세트메뉴는 제일 싼 햄버거 + 음료에서 50원을 뺀가격이기때문에
		// (food[0] + drink[0]) 이렇게 제일 싼 햄버거와 음료를 더한 후 -50으로 50원 할인 해준다
		int set = (food[0] + drink[0]) - 50;
		
		// set에 저장된 세트메뉴의 가격만 출력하면 끝
		System.out.println(set);
		
		
	}	
}