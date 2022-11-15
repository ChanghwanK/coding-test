package org.example.programmers.lv_0.인덱스_바꾸기;

public class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder answer = new StringBuilder();
        char a = my_string.charAt(num1);
        char b = my_string.charAt(num2);

        for(int i = 0; i < my_string.length(); i++) {
            if(i == num1) {
                answer.append(my_string.charAt(num2));
            }
            else if(i == num2) {
                answer.append(my_string.charAt(num1));
            } else {
                answer.append(my_string.charAt(i));
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        var data = solution.solution("hello", 1, 2);
        System.out.println(data);

        System.out.println();

        var data2 = solution.solution("I love you", 3, 6);
        System.out.println(data2);


    }

}
