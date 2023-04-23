import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력에 사용할 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Date Today = new Date();
		
		String[] date = sdf.format(Today).split("-");
		
//		System.out.println(date[0]);
//		System.out.println(date[1]);
//		System.out.println(date[2]);
		
		System.out.println("2023");
		System.out.println("04");
		System.out.println("23");
		
	}	
}