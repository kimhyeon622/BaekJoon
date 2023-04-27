import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력에 사용할 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 단어의 개수 : N, 단어를 저장할 배열 : arr
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		
		// N번 단어 입력받기
		for(int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}
		
		Stream<String> stream = Stream.of(arr);
		
		// 스트림 사전순으로 정렬
		stream.sorted()
		// 사전순으로 정렬 후 길이에 따라 정렬
		.sorted(Comparator.comparingInt(String::length))
		// 중복 제거
		.distinct()
		// 출력 - println으로
		.forEach(System.out::println);

	}	
}