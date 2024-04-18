import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char[] ascii = a.toCharArray();
        
        for(int i = 0; i < a.length(); i++){
            if(ascii[i] < 91){
                ascii[i] += 32;
                System.out.print(ascii[i]);
                
            }else{
                ascii[i] -= 32;
                System.out.print(ascii[i]);
            }
            }
        
        
        
    }
}