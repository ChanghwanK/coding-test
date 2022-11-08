package org.example.algorithm.sort;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    static List<Integer> split(List<Integer> array) {
        if (array.size() == 1) {
            return array;
        }
        int mid = array.size() / 2;
        var left = split(array.subList(0, mid));
        var right =split(array.subList(mid, array.size()));
        return merge(left, right);
    }

    static List<Integer> merge(List<Integer> left, List<Integer> right) {
        ArrayList<Integer> sortedArr = new ArrayList<>();
        int leftPoint = 0;
        int rightPoint = 0;
        // merge를 위해선 케이스 분할과 임시 배열이 필요함


        // 왼쪽 오른쪽 모두 정렬해야할 경우
        while(left.size() > leftPoint && right.size() > rightPoint) {
           if(left.get(leftPoint) > right.get(rightPoint)) {
               sortedArr.add(right.get(rightPoint));
               rightPoint+=1;
           } else {
               sortedArr.add(left.get(leftPoint));
               leftPoint+=1;
           }
        }

        // 왼쪽 정렬을 마무리 해야할 경우
        while(left.size() > leftPoint) {
            sortedArr.add(left.get(leftPoint));
            leftPoint+=1;
        }

        // 오른쪽 정렬을 마무리 해야할 경우
        while(right.size() > rightPoint) {
            sortedArr.add(right.get(rightPoint));
            rightPoint+=1;
        }

        return sortedArr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> testDatas  = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            testDatas.add((int) (Math.random() * 100));
        }

        System.out.println(MergeSort.split(testDatas));
    }

}
