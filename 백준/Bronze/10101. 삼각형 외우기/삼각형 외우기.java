import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 삼각형의 각의 크기 : A, B, C
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		// 삼각형 세 각의 함 : Tr
		int Tr = A + B + C;
		
		// 세 각의 크기가 모두 60이라면
		if(A == 60 && B == 60 && C == 60) {
			// Equilateral
			System.out.println("Equilateral");
			
		// 세 각의 합이 180이고, 두 각이 같은 경우
		} else if(Tr == 180 && (A == B || B == C || C == A)){
			// Isosceles
			System.out.println("Isosceles");
			
		// 세 각의 합이 180이고, 같은 각이 없는 경우
		} else if(Tr == 180) {
			// Scalene
			System.out.println("Scalene");
			
		// 세 각의 합이 180이 아닌 경우
		} else {
			// Error
			System.out.println("Error");
		}
	}	
}