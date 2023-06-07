import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 첫 줄에 주어지는 N과 M은 배열에 받는다
		String arr[] = br.readLine().split(" ");
		
		// int형으로 A와 B를 각각 받아 저장 후
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		// A * B를 출력한다
		System.out.println(A * B);
		
	}		
}