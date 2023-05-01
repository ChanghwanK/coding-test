package org.example.programmers.lv_01.k번째수;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


// k 번째 수
public class Solution2 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            answer[i] = getAnswer(array, commands[i]);
        }
        return answer;
    }

    private int getAnswer(int[] array, int[] command) {
        int startPoint = command[0];
        int slicePoint = command[1];
        int targetIndex = command[2];

        int [] slicedArr = Arrays.copyOfRange(array, startPoint-1, slicePoint);
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int j : slicedArr) {
            arrayList.add(j);
        }
        // 정렬하고
        Collections.sort(arrayList);

        //찾고 리턴
        return arrayList.get(targetIndex-1);
    }
}