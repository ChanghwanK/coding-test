package org.example.programmers.자료구조_알고리즘_강의.완주하지_못한_선수;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();

        for(String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }

        System.out.println(map);

        for(String c : completion) {
            int n = map.get(c) - 1;
            if(n == 0) map.remove(c);
            else map.put(c, n);
        }

        return map.keySet().iterator().next();
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();

        var a = solution.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[] {"stanko", "ana", "mislav"});
        System.out.println(a);
    }

}
