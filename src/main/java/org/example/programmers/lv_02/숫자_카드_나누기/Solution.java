package org.example.programmers.lv_02.숫자_카드_나누기;

import java.util.Arrays;

class Solution {
    int [] arrayA;
    int [] arrayB;

    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        this.arrayA = arrayA;
        this.arrayB = arrayB;

        // reesult = 0이면 A를 나눌 수 있는 숫자는 없다.
        int resultA = isDivisibleA(arrayA);

        if (resultA == 0) {
            // B는 그럼 나눌 수 있는지 체크
            int resultB = isDivisibleB(arrayB);
            if (resultB == 0) return 0;
            else {
                if(isADivisibleUsingResultB(resultB)) return resultB;
            }

        }
        // 나눌 수 없는지 체크
        else {
            if(!isBDivisibleUsingResultA(resultA)) return resultA;
        }

        return answer;
    }

    // B 값으로 A원소를 나눌 수 있느지?
    boolean isADivisibleUsingResultB(int resultB) {
        for (int num : arrayA) {
            if (num % resultB != 0) return false;
        }
        return true;
    }

    boolean isBDivisibleUsingResultA(int resultA) {
        for (int num : arrayB) {
            if (num % resultA != 0) return false;
        }
        return true;
    }

    // A 나눌 수 없는지?
    // 해당 정수 N을 리턴
    int isDivisibleA(int[] arrayA) {
        int min = Arrays.stream(arrayA).min().getAsInt();
        int maxNum = 0;

        for(int i = 2; i <= min ; i++) {
            for(int num : arrayA) {
                if (num % i == 0) {
                    if (maxNum < i) maxNum = i;
                } else {
                    maxNum = 0;
                }
            }
        }

        return maxNum;
    }

     // B 나눌 수 있는지?
    int isDivisibleB(int[] arrayB) {
        int min = Arrays.stream(arrayB).min().getAsInt();
        int maxNum = 0;

        for(int i = 2; i <= min ; i++) {
            for(int num : arrayB) {
                if (num % i == 0) {
                    if (maxNum < i) maxNum = i;
                } else {
                    maxNum = 0;
                }
            }
        }

        return maxNum;
    }


    public static void main(String [] args) {
        Solution solution = new Solution();
//        int [] a = new int[] {10, 17};
//        int [] b = new int[] {5, 17};
//        int [] a = new int[] {10, 20};
//        int [] b = new int[] {5, 17};
        int [] a = new int[] {14, 35, 119};
        int [] b = new int[] {18, 30, 102};
        var result = solution.solution(a,b);
        System.out.println("result: " + result);
    }
}
