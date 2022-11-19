package org.example.programmers.lv_0.평행;

import java.util.ArrayList;

public class Solution {

    /**
     * 기울기가 같으면 평행
     *  기울기 = y 증가량 / x 증가량
     *  x 증가량은 x2 - x1
     *  y 증가량은 y2 - y1
     */
    public int solution(int[][] dots) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>(); // 기울기를 담음
        /**
         * 어떻게 찾을 것인가?
         * 하나의 좌표를 기준으로 나머지 좌표들과 평행하는지 검사할 것
         *
         * 하나의 기준 좌표는 dots[i]
         * 하나의 기준 좌표를 검사했다면 다음 차례에서 이전 좌표랑은 검사할 필요가 있는가?
         * - No
         * 한 번 검사를 했다면 해당 좌표랑 평행하는 것은 없다는 것을 의미
         */
        for(int i = 0; i < dots.length; i++) {
            for(int j = i + 1; j < dots.length; j++) {
                int inclination = dots[i][1]-dots[j][1] / dots[i][0] - dots[j][0];
                if(arr.contains(inclination)) return 1;
                arr.add(inclination);
            }
        }
        
        return answer;
    }

    private boolean isParallel(int [] point, int[][] others) {
        int x1 = point[0];
        int y1 = point[1];
        System.out.println("==== parallel ====");
        for(int i = 0; i < others.length; i++) {
            int x2 = others[i][0];
            int y2 = others[i][1];
            System.out.println(x2);
            System.out.println(y2);
        }

        System.out.println("=========");

        return false;
    }

    public static void main(String[] args) {
        int [][] arr = new int[][] {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
        int [][] arr2 = new int[][] {{3, 5}, {4, 1}, {2, 4}, {5, 10}};
        Solution solution = new Solution();
        System.out.println("Result: " + solution.solution(arr));
    }

}
