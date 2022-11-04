package org.example.programmers.lv_0.최빈값_구하기;

public class Solution {

    /**
     * 알고리즘
     * 1. 입력받은 배열에서 등장하는 숫자들을 임시 배열에 저장 3이 2번 나오면 index 3 = 2가 매핑되는 원리
     * 2. 배열의 최대값을 찾음
     * 3. 최댓값과 동일한 값이 배열에 있다면 -1
     */
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;
        if(array.length == 1) {
            return array[0];
        }
        // array length = 10;
        // 등장횟수를 인덱스 번호에 맵핑할 배열
        int [] tempArr = new int[array.length];

        // array의 숫자들을 index에 맞게 저장
        for(int i = 0; i < array.length; i++) {
            tempArr[array[i]] += 1;
        }

//        for(int i = 0; i < tempArr.length; i++) {
//            System.out.println(tempArr[i]);
//        }

        // 최대 등장 횟수를 조회
        // 근데 여러개가 존재할 수 있음
        int cnt = 0;
        for(int i = 0; i < tempArr.length; i++) {
            if (max < tempArr[i]) {
                max = tempArr[i];
            }
        }

        // 등장횟수가 동일한 케이스 찾기
        for(int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] == max) {
                cnt++;
            }
        }

        if (cnt >= 2) {
            return -1;
        } else {
            for(int i = 0; i < tempArr.length; i++) {
                if(tempArr[i] == max) {
                    answer = i;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 3, 3, 4};
        int [] arr2 = {1, 1, 2, 2};
        int [] arr4 = {1, 2, 5, 5, 5, 4, 999};
        int [] arr3 = {0};
        Solution solution = new Solution();
        var data = solution.solution(arr4);
        System.out.println("result: " + data);
    }

}
