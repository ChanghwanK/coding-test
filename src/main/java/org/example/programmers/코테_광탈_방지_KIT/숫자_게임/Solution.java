package org.example.programmers.코테_광탈_방지_KIT.숫자_게임;

import java.util.Arrays;

public class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        // 근소한 차이로 이기는 것이 중요함
        // 근소하게 이기기 위해선 A,B둘 다 sort하면 됨
        Arrays.sort(A);
        Arrays.sort(B);
        int index = B.length - 1;

        for(int i = A.length - 1; i >= 0 ; i--) {
            // B가 이길 경우 B의 인덱스를 내리면 됨
            // 이유는 모든 값을 비교하는 것이 아니라 이기는 경우만 index를 줄여서 근소한 차이로 이기도록 하기 위해서임
            if(A[i] < B[index]) {
                index--;
                answer++;
            }
            System.out.println();
        }
        return answer;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(new int[] {5,1,3,7}, new int[] {2,2,6,8});
        System.out.println("result: " + result);
    }
}
