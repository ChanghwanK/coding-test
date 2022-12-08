package org.example.algorithm.search;

import java.util.Arrays;

public class BinarySearch {
    static boolean search(int [] arr, int target) {
        Arrays.sort(arr);

        int start = 0;
        int end = arr.length - 1;
        int mid;

        while(start <= end) {
            mid = (start + end) / 2;

            if (arr[mid] == target) {
                return true;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        var result = search(new int[] {1,3,2,5,7, 21, 43, 23, 4, 6, 9}, 82);
        System.out.println(result);
    }
}
