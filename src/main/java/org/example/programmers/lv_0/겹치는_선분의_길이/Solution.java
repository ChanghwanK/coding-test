package org.example.programmers.lv_0.겹치는_선분의_길이;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    /**
     * 겹치는 선분이라는 것은
     *  범위 사이에 포함되는 것 (2,5) (3,9)
     *  34가 포함됨
     *
     */
    public int solution(int[][] lines) {

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        for(int i = 0; i < 3; i++) {
            int start = lines[i][0];
            int end = lines[i][1];
            for(int j = start; j <= end; j++) {
                arr.add(j);
            }
        }

        System.out.println("arr: " + arr);


        for(int i = 0; i < arr.size(); i++) {
            int point = arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                if (point == arr.get(j) && j != i + 1) {
                    arr2.add(arr.get(j));
                }
            }
        }

        System.out.println("arr2: " + arr2);

        if(arr2.isEmpty()) return 0;
        int min = arr2.get(0);
        int max = arr2.get(arr2.size() - 1);
        return max - min;
    }

    public int solution2(int[][] lines) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<lines.length; i++) {
//            System.out.println(lines[i][0]);
//            System.out.println(lines[i][1]);
//            System.out.println("====");
            int min = Math.min(lines[i][0], lines[i][1]);
            int max = Math.max(lines[i][0], lines[i][1]);
            System.out.println("max: "  + max);
            for (int j = lines[i][0]; j < lines[i][1]; j++) {
                /**
                 * key: j
                 * 즉, 등장 횟수를 카운팅 함
                 */
                map.put(j, map.getOrDefault(j, 0) + 1);
            }
        }

        int answer = 0;

        System.out.println(map);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int arr [][] = new int[][] {{0, 1}, {2, 5}, {3, 9}};
//        int arr [][] = new int[][] {{-1, 1}, {1, 3}, {3, 9}};
        Solution solution = new Solution();
//        System.out.println(solution.solution(arr));
        System.out.println(solution.solution2(arr));
    }

}
