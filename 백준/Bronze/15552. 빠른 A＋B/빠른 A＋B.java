import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Main {
	
	public static void main(String[] atgs) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());	// 입력받은 횟수를 int로 변환
		
		for(int i = 1; i <= N; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());	// 첫번쨰 호출
			int b = Integer.parseInt(st.nextToken());	// 두번쨰 호출
			
			bw.write(a + b +"\n");
		}
		bw.flush();
	}
}
