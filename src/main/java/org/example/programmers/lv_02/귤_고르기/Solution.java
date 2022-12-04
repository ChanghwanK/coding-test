package org.example.programmers.lv_02.귤_고르기;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    // 다른 종류의 수를 최소화하고 싶습니다. 즉, 최대한 비슷하게
    // tangerine - k 만큼 빼야함
    // 최소로 등장한 귤을 찾고  tangerine - k 만큼 빼야함
    // tangerine - k는 등장 횟수가 작은 것부터 누적합이 tangerine - k 되면 됨
    // k는 한 상자에 몇개 담을 것인지?
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new TreeMap<>(); // 귤 size,  개수 cnt

        for(int size : tangerine)
            map.put(size, map.getOrDefault(size, 0) +1);


        List<Integer> keyList = new ArrayList<>(map.keySet());
        Collections.sort(keyList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o2) - map.get(o1);
            }
        });


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
