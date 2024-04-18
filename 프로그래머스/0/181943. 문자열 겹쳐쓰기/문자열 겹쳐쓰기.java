class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        char[] ch1 = my_string.toCharArray();
        char[] ch2 = overwrite_string.toCharArray();
        int cnt = s;
        
        for(int i = 0; i < my_string.length();i++){
            if(i == s){
                String str = new String(ch2);
                answer += str;
                break;
            } else{
                answer += ch1[i];
            }
        }
        
        for(int i = answer.length(); i < my_string.length();i++){
             answer += ch1[i];
        }
        
        
        return answer;
    }
}