package org.example.programmers.lv_0.대문자와소문자;

public class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        // 65 ~ 90 대문자
        // 97 ~ 122 소문자
        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) >= 'a' && my_string.charAt(i) <= 'z') {
                answer.append((char) (my_string.charAt(i) - 32));
            }
            if(my_string.charAt(i) >= 'A' && my_string.charAt(i) <= 'Z') {
                answer.append((char) (my_string.charAt(i) + 32));
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        var data = solution.solution("cccCCC");
        System.out.println(data);
        var data2 = solution.solution("abCdEfghIJ");
        System.out.println(data2);
    }
}
