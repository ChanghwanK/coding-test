package org.example.programmers.lv_0.중복된_문자_제거;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for(int i = 0; i < my_string.length(); i++) {
            set.add(String.valueOf(my_string.charAt(i)));
        }
        var myData = new ArrayList<>(set);
        for(String myDatum : myData) {
            answer.append(myDatum);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        var result = solution.solution("We are the world");
        System.out.println("result: " + result);
    }

}
