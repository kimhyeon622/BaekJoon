import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 입출력 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 안테나 갯수 : antenna, 눈의 갯수 : eyes
		int antenna = Integer.parseInt(br.readLine());
		int eyes = Integer.parseInt(br.readLine());
		
		// 각조건에 맞는 외계인을 출력하는 문제
		// 최소 3개의 안테나와 최대 4개의 눈이 달린 트로인 화성인
		if(antenna >= 3 && eyes <= 4) {
			System.out.println("TroyMartian");
		} 
		
		// 최대 6개의 안테나와 최소 2개의 눈이 달린 블라드 토성인
		if(antenna <= 6 && eyes >= 2) {
			System.out.println("VladSaturnian");	
		} 
		
		// 최대 2개의 안테나와 최대 4개의 눈이 달린 그래미 수성인
		if(antenna <= 2 && eyes <= 3) {
			System.out.println("GraemeMercurian");
		}
		
	}		
}