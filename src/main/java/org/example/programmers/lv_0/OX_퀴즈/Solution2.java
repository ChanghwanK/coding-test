package org.example.programmers.lv_0.OX_퀴즈;

import java.util.Arrays;

public class Solution2 {
    public String[] solution(String[] quiz) {
        for(int i=0; i<quiz.length; i++){
            String[] text = quiz[i].split(" ");
            System.out.println(Arrays.toString(text));
            int result = Integer.parseInt(text[0]) + ( Integer.parseInt(text[2]) * ( text[1].equals("+") ? 1:-1) );
            System.out.println("result: " +result);
            quiz[i] = result == Integer.parseInt(text[4])? "O": "X";
        }
        return quiz;
    }


    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        var data = solution.solution(new String[] {"3 - 4 = -3", "5 + 6 = 11"});
        System.out.println(Arrays.toString(data));
        var data2 = solution.solution(new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"});
        System.out.println(Arrays.toString(data2));
    }

}
