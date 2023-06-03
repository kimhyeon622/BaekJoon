import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 한 줄에 문스터의 방어율과 유저의 방무가 입력받아 배열에 저장합니다
		String arr[] = br.readLine().split(" ");
		
		// 해당 팀들의 점수 = 해당 팀의 수 * 해당 팀의 점수
		int Ur = Integer.parseInt(arr[0]) * 56;
		int Tr = Integer.parseInt(arr[1]) * 24;
		int Uo = Integer.parseInt(arr[2]) * 14;
		int To = Integer.parseInt(arr[3]) * 6;
		
		// 모든 팀의 점수를 합한다
		int sum = Ur + Tr + Uo + To;
		
		// 모든 팀의 점수를 출력
		System.out.println(sum);
		
	}	
}