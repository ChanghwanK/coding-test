package org.example.programmers.lv_02.귤_고르기;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new TreeMap<>(); // 귤 size,  개수 cnt

        for(int size : tangerine)
            map.put(size, map.getOrDefault(size, 0) +1);


        List<Integer> keyList = new ArrayList<>(map.keySet());
        keyList.sort((o1, o2) -> map.get(o2) - map.get(o1));

        for(Integer key : keyList) {
            if (k <= 0)
                break;
            answer++;
            k -= map.get(key);
        }

        return answer;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
//        var result = solution.solution(6, new int[] {1, 3, 2, 5, 4, 5, 2, 3});
        var result = solution.solution(4, new int[] {1, 3, 2, 5, 4, 5, 2, 3});
        System.out.println("result: " + result);
    }
}
