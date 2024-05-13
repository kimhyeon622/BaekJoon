class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        // 문자열 2개(str1, str2)의 길이는 같기 때문에 길이 구할 때 str1,str2 상관X
        for(int i = 0; i < str1.length(); i++){
            // 각각 String 배열에 글자를 하나씩 분리하여 집어 넣기
            // split();는 괄호안에 있는 조건에 따라서 문자를 뺀다
            // 현재는 ("")이므로 그냥 하나씩 뺸다
            
            // * 배열에 안 넣고 바로 answer에 넣을 시 [Ljava.lang.String;@759ebb3d]가 들어간다
            String s1[] = str1.split("");
            String s2[] = str2.split("");
            
            // String 배열에 넣은 문자를 하나씩 answer에 넣기
            answer += s1[i];
            answer += s2[i];
            
            
        }
        return answer;
    }
}