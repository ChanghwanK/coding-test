package org.example.algorithm.sort;

import java.util.Arrays;

public class SelectionSort {
    static int [] selectionSort(int [] arr) {
        // 몇번 반복할지
        for(int i = 0; i < arr.length ; i++) {
            // 최솟값 찾기
            int minIndex = i;
            for(int j = i+1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            // 최솟값과 맨 앞의 값과 바꾸기
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    static int [] swap(int [] arr, int arrIndex, int minIndex) {
        int temp = arr[arrIndex];
        arr[arrIndex] = arr[minIndex];
        arr[minIndex] = temp;
        return arr;
    }
    public static void main(String[] args) {
        int a [] = {4,2,1,5,3,6};
        var data = SelectionSort.selectionSort(a);
        System.out.println(Arrays.toString(data));
    }
}
