package org.example.programmers.lv_0.숨어있는_숫자의_덧셈;

import java.util.ArrayList;

public class Solution {
    public int solution(String my_string) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < my_string.length(); i++) {
            char a = my_string.charAt(i);
            if(Character.isDigit(a)) {
                sb.append(a);
            } else {
                if(!sb.toString().equals("")) {
                    String str = sb.toString();
                    arr.add(Integer.parseInt(str));
                    sb.delete(0, str.length());
                }
            }
        }

        if(!sb.toString().equals("")) {
            arr.add(Integer.parseInt(sb.toString()));
        }

        answer = arr.stream().mapToInt(num -> num).sum();
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.solution("aAb1B2cC34oOp"));
//        System.out.println(solution.solution("1a2b3c4d123Z"));
        System.out.println(solution.solution("1234"));
    }

}
