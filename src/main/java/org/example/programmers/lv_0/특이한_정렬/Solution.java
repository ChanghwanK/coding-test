package org.example.programmers.lv_0.특이한_정렬;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] solution(int[] numlist, int n) {
        ArrayList<Integer> answers = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        // 거리 구하고 map에 넣기
        for(int num : numlist) {
            int distance = Math.abs(n - num);
            map.put(num, distance);
        }

        // map에서 최소 거리 찾기
        int minDistance = Integer.MAX_VALUE;
        int minDistanceKey = 0;
        for(int num : numlist) {
            int distance = map.get(num);
            System.out.println(distance);
            if (minDistance > distance) {
                minDistance = distance;
                minDistanceKey = num;
            }
        }
//        numlist는 array이기 때문에 삭제되었다는 flag = 0;

        System.out.println("최소거리: " + minDistance);
        System.out.println("최소거리 Key: " + minDistanceKey);

        // 삭제
        map.remove(minDistanceKey);

        System.out.println("최소거리가 삭제된 map: " + map);

        // 최소거리를 찾고 삭제하는 과정을 반복해야 함
        // 이것말고 방법은 뭐가 있을까?
        // 일단 원하는 것은 최소거리를 찾고 key크기에 무관하게 key를 answer 배열에 넣는 것

        return answers.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int [] numList = new int[] {1,2,3,4,5,6};
        Solution solution = new Solution();
        System.out.println("result: " + Arrays.toString(solution.solution(numList, 4)));;
    }

}
