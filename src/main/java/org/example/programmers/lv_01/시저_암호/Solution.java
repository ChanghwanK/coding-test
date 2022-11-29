package org.example.programmers.lv_01.시저_암호;

public class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for(char word : s.toCharArray()) {
            if(word == ' ') {
                answer.append(word);
                continue;
            }

            if(Character.isAlphabetic(word)) {
                // 대문자 인경우
                if(word >= 'A' && word <= 'Z') {
                    char a = (char) (word + n);
                    if(a > 'Z') {
                        answer.append((char) (a - 26));
                    } else {
                        answer.append(a);
                    }
                }
                // 소문자 인경우
                if(word >= 'a' && word <= 'z') {
                    char a = (char) (word + n);
                    if(a > 'z') {
                        answer.append((char) (a - 26));
                    } else {
                        answer.append(a);
                    }
                }
            }
        }
        return answer.toString();
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution("a B z", 4);
//        var result = solution.solution("P", 15);
        System.out.println("result: " + result);
//        System.out.println((char) ('a' + 3));
    }
}
