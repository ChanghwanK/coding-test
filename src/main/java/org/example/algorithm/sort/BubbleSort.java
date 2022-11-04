package org.example.algorithm.sort;

public class BubbleSort {
    public static int [] sort(int [] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j +1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] a = {312,2,349,3129,31,234,39450,32131};
        var data = BubbleSort.sort(a);
        for(int num : data) {
            System.out.println(num);
        }
    }

}
