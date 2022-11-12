package org.example.data_structure.heap;

import java.util.ArrayList;
import java.util.Collections;

public class MaxHeap {
    private MaxHeap() {}
    private static ArrayList<Integer> arr = new ArrayList<>();

    public static void insert(int data) {
        int parentIdx;
        int currentIdx;

        if (arr.size() == 0) {
            arr.add(null);
        }

        arr.add(data);
        currentIdx = arr.size() - 1;

        while(isNeedSwap(currentIdx)) {
            parentIdx = currentIdx / 2;
            Collections.swap(arr, parentIdx, currentIdx);
            currentIdx = parentIdx;
        }
    }

    public static void showHeap() {
        System.out.println(arr);
    }

    private static boolean isNeedSwap(int currentIdx) {
        if (currentIdx == 1) {
            return false;
        }

        int parentIdx = currentIdx / 2;

        if (arr.get(parentIdx) < arr.get(currentIdx)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        MaxHeap.insert(10);
        MaxHeap.insert(8);
        MaxHeap.insert(5);
        MaxHeap.insert(4);
        MaxHeap.insert(20);

        MaxHeap.showHeap();
    }
}
