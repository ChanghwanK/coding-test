package org.example.algorithm.search;

import java.util.Arrays;

public class BinarySearch {
    static void search(int [] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int start = 0;
        int end = arr.length - 1;
        int mid;

        while(start <= end) {
            mid = (start + end) / 2;
            if(arr[mid] == 9) {
                System.out.println("Find it: " + 9);
                break;
            } else if(9 > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println("Not Found");
    }

    public static void main(String[] args) {
        search(new int[] {1,3,2,5,7});
    }
}
