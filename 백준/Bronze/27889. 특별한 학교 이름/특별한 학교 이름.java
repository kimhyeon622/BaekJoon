import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 학교의 약칭을 입력받는다
		String School = br.readLine();
		
		// 만약 입력받은 약칭이 "NLCS"라면
		if(School.equals("NLCS")) {
			// 노스 런던 대학교 학교 정식 명칭 출력
			System.out.println("North London Collegiate School");
		// 만약 입력받은 약칭이 "BHA"라면
		} else if(School.equals("BHA")) {
			// 브랭섬홀 아시아 학교 정식 명칭 출력
			System.out.println("Branksome Hall Asia");
		// 만약 입력받은 약칭이 "KIS"라면
		} else if(School.equals("KIS")) {
			// 한국국제학교 학교 정식 명칭 출력
			System.out.println("Korea International School");
		// 만약 입력받은 약칭이 "SJA"라면
		} else if(School.equals("SJA")) {
			// 세인트존시베리아카데미 제주 정식 명칭 출력
			System.out.println("St. Johnsbury Academy");
		}
	}	
}