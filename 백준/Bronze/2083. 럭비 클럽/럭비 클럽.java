import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 무한반복
		while(true) {
			// 공백을 기준으로 분리하여 배열에 저장한다
			String[] arr = br.readLine().split(" "); 
			
			// 나누어진 데이터들을 밑에 처럼 저장한다
			// 이름 : name, 나이 : age, 몸무게 : kg
			String name = arr[0];
			int age = Integer.parseInt(arr[1]);
			int kg = Integer.parseInt(arr[2]);
			
			// 만약 이름이 #이라면
			if(name.equals("#")) {
				// 반복문 나가기
				break;
			}
			
			// 나이가 17세보다 많거나, 몸무게가 80kg 이상이면 
			if(age > 17 || kg >= 80) {
				// 성인부
				System.out.println(arr[0] + " Senior");
			// 그렇지 않으면 청소년부
			} else {
				System.out.println(arr[0] + " Junior");
			}
			
		}
	}	
}