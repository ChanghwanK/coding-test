package org.example.programmers.lv_0.공_던지기;

public class Solution {

    /**
     * answer = k번째로 공을 던지는 친구의 번호
     * 공은 한 칸을 건너뛴 사람에게만 던질 수 있음 즉, 바로 옆으로 던지지 못함 1 => 3 3 => 5 => 1
     * 즉, 순환큐와 비슷
     */
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int pointer = 0;

        for(int i = 0; i < k; i++) {
            if(pointer > numbers.length) {
                pointer -= numbers.length;
            }
            pointer += 2;
        }
//        System.out.println(pointer);
//        answer = numbers[pointer-1];

        return pointer - 1;
    }

    public static void main(String[] args) {
        int [] numbers = new int[] {1,2,3,4};
        int [] numbers2 = new int[] {1,2,3,4,5,6};
        int [] numbers3 = new int[] {1,2,3};
        int k = 2;
        Solution solution = new Solution();
        var result = solution.solution(numbers, k);
        System.out.println("result: " + result);
    }

}
