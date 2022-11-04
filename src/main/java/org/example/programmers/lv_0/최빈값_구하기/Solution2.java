package org.example.programmers.lv_0.최빈값_구하기;

public class Solution2 {
    public int solution(int[] array) {
        int answer = 0;
        int arr_max = 0;
        // array의 최댓값?
        for (int i = 0; i < array.length; i++) {
            if (array[i] > arr_max) {
                arr_max = array[i];
            }
        }

        int[] count = new int[arr_max + 1];
        int max = 0;

        int n = 0;
        int mode = 0;

        //count array에 등장 횟수를 담는다.
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                // i번째 값을 리턴
                answer = i;
            }
        }

        for (int i = 0; i < count.length; i++) {
            mode++;

            if (count[i] == max) {
                n++;
            }
        }

        if (n > 1)
            answer = -1;

        return answer;
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 3, 3, 4};

        int [] arr2 = {1, 1, 2, 2};
        int [] arr3 = {0};
        Solution2 solution2 = new Solution2();
        var data = solution2.solution(arr);
        System.out.println("result: " + data);
    }

}
