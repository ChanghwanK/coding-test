package org.example.programmers.lv_0.숨어있_숫자의_덧셈_1;

import java.util.ArrayList;

public class Solution {
    public int solution(String my_string) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i++) {
            if(Character.isDigit(my_string.charAt(i)))
                arr.add(Integer.parseInt(String.valueOf(my_string.charAt(i))));
        }
        answer = arr.stream().mapToInt(num -> num).sum();
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        var data = solution.solution("aAb1B2cC34oOp");
        System.out.println("result: " + data);
    }
}
