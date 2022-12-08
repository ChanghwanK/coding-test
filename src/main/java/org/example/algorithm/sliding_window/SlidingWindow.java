package org.example.algorithm.sliding_window;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SlidingWindow {

    /**
     * 슬라이딩의 핵심은
     * - window 사이즈를 구하고
     * - 좌측과 우측 모두 +1씩 하면서 이동하기
     */
    public static void main(String[] args) {
        int [] arr = new int[] {1, 3, 5, 7, 9};
        int start = 0;
        int end = start + 1;

        while(end < arr.length) {
            int[] ints = {arr[start], arr[end]};
            System.out.println(Arrays.toString(ints));
            start++;
            end++;
        }
    }
}
