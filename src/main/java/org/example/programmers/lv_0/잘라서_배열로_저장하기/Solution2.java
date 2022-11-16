package org.example.programmers.lv_0.잘라서_배열로_저장하기;

import java.util.ArrayList;
import java.util.Arrays;


public class Solution2 {
    public String[] solution(String my_str, int n) {
        int loopCnt = (my_str.length() % n == 0) ? my_str.length() / n : my_str.length() / n + 1;
        ArrayList<String> answers = new ArrayList<>();

        for(int i = 0; i < loopCnt; i++) {
            if(my_str.length() >= n) {
                String subed = my_str.substring(0, n);
                answers.add(subed);
                my_str = my_str.replace(subed, "");
            } else {
                answers.add(my_str);
            }
        }
        return answers.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
//        System.out.println("Result: "+ Arrays.toString(solution.solution("abc1Addfggg4556b", 6)));
        System.out.println("Result: "+ Arrays.toString(solution.solution("abcdef123", 3)));

    }

}
