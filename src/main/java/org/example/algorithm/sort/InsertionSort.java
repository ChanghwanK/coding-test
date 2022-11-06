package org.example.algorithm.sort;

import java.util.Arrays;

public class InsertionSort {
    public static int [] insertionSort(int [] arr) {
        for(int i = 1; i < arr.length - 1; i++) {
            for(int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                } else {
                    break;
                }
            }
        }
        return arr;
    }

    public static int [] insertSort2(int [] arr) {
        // 뒤로 미는 방식으로
        for(int i = 1; i < arr.length; i++) {
            int selectedNum = arr[i];
            int j = i - 1;
            // 쭉 다 밀고 들어가야할 자리에(while문 통과 못하는 그 조건에서) 들어감
            while(j >= 0 && selectedNum < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
                System.out.println(Arrays.toString(arr));
            }
            arr[j + 1] = selectedNum;
        }
        return arr;
    }
    public static void main(String[] args) {
//        var data = InsertionSort.insertionSort(new int[] {3,1,2,5,4,5});
        var data = InsertionSort.insertSort2(new int[] {7,4,3,1,2,6});
        System.out.println(Arrays.toString(data));
    }

}
