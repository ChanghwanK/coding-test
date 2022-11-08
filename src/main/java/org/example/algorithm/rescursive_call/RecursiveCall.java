package org.example.algorithm.rescursive_call;

import java.util.ArrayList;
import java.util.Arrays;

public class RecursiveCall {
    static int factorial(int num) {
        if (num == 1) {
            return num;
        }
        return num * factorial(num - 1);
    }

    static int arrayTotalResult(ArrayList<Integer> arr) {
        if (arr.size() <= 1) {
            return arr.get(0);
        }
        return arr.get(0) * arrayTotalResult(new ArrayList<>(arr.subList(1, arr.size())));
    }

    static ArrayList<int []> combination(int num) {
        ArrayList<int []> arr = new ArrayList<>();
        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <=3 ; j++) {
                if ((i + j) == num) {
                    arr.add(new int[]{i, j});
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        var result = RecursiveCall.factorial(5);
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
//        var result2 = RecursiveCall.arrayTotalResult(arr);
//        System.out.println("result2: " + result2);
        var data = RecursiveCall.combination(4);
        for (int [] arr2 : data) {
            System.out.println(Arrays.toString(arr2));
        }
    }
}
