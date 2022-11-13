package org.example.programmers.lv_0.컨트롤_제트;

import java.util.ArrayList;

public class Solution {
    public int solution(String s) {
        int answer = 0;
        String [] strs = s.split(" ");
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < strs.length; i++) {
            String str = strs[i];
            if (str.equals("Z")) {
                if (arr.size() == 0) continue;
                else arr.remove(arr.size() - 1);
            } else {
                arr.add(Integer.parseInt(str));
            }
        }

        answer = arr.stream().mapToInt(num -> num).sum();
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        var result = solution.solution("10 Z 20 Z 1");
        System.out.println("result: " + result);
    }

}
