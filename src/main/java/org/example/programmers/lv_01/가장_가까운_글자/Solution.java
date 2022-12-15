package org.example.programmers.lv_01.가장_가까운_글자;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Solution {
    // 각 단어별 인덱스를 관리해야하지 않을까?
    // 원하는 것은 2번째 나올 경우 전에 나온 인덱스에서 몇번째 뒤에 나왔는지를 알아야함
    // index 하나만 할 경우 각 문자열별로 계산을 할 수 없음

    public int[] solution(String s) {
        List<Integer> answer = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        int index = 0;

        Map<String, Integer> map = new HashMap<>(); // 문자와 문자의 위치

        for (char a : s.toCharArray()) {
            // 없다면 그냥 넣기
            String word = String.valueOf(a);
            if (!stack.contains(word)) {
                // stack에다 push할 필요가 있는지?
                stack.push(word);
                // 어떤 값을 넣어야 할 지?
                map.put(word, index);
                answer.add(-1);
                index ++;
            }
            // 있다면 순서 계산
            else {
                int temp = index - map.get(word); // 현 위치 - 첫 번째 등장한 위치 = 몇번째 뒤에 나온 것인지
                answer.add(temp);
                map.put(word, index);
                index++;
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution("banana");
        System.out.println("result: " + Arrays.toString(result));
    }
}
