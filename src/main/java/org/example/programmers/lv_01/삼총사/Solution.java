package org.example.programmers.lv_01.삼총사;

public class Solution {

    /**
     * 삼총사: 주어진 배열 중 3개의 합이 0이 되는 것
     * @return : 삼총사가 되는 경우의 수
     *
     * Point
     * - 구현 어떻게 합이 0이 되는 케이스들을 다 찾을 것인가?
     * - 임의로 선택한 두 개의 값의 합의 * -1 값이 배열에 있는지 찾을 것
     * - 임의로 선택하는 경우를 먼저 구현
     */
    public int solution(int[] numbers) {
        int answer = 0;
        // 임의의 값 두 개를 선택
        for(int i = 0; i < numbers.length - 2; i++) {
            for(int j = i+1; j < numbers.length - 1; j++) {
                for(int k = j+1; k < numbers.length; k++) {
                    if(numbers[i] + numbers[j] + numbers[k] == 0) answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String [] args) {
        int [] number = new int[] {-2, 3, 0, 2, -5};
//        int [] number = new int[] {-3, -2, -1, 0, 1, 2, 3};
        Solution solution = new Solution();
        System.out.println("result: " + solution.solution(number));
    }
}
