package org.example.algorithm.sort;

import java.util.ArrayList;

public class QuickSort {
    static ArrayList<Integer> sort(ArrayList<Integer> arr) {
        if(arr.size() <= 1) return arr;
        int pivot = arr.get(0);

        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) > pivot) right.add(arr.get(i));
            else left.add(arr.get(i));
        }

        ArrayList<Integer> mergedArr = new ArrayList<>(sort(left));
        mergedArr.add(pivot);
        mergedArr.addAll(sort(right));

        return mergedArr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> testCase1 = new ArrayList<>();
        for(int i = 0; i < 10; i++) testCase1.add((int) (Math.random() * 100));
        System.out.println("result: " + QuickSort.sort(testCase1));
    }

}
