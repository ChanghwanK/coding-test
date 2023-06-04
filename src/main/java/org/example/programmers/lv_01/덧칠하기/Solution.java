package org.example.programmers.lv_01.덧칠하기;

public class Solution {

    // 1m 길이로 n로 나눔 즉, n개의 벽을 칠해야 함
    // 왼쪽부터 순서대로 1 ~ n번까지 번호가 붙는 형태
    // 롤러의 길이는 m미터이고
    // 다시 페인트를 칠하기로 정한 구역들의 번호가 담긴 정수 배열 section
    //
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int start = section[0];
        int end = start + (m - 1) ;

        for (int curNum : section) {
            if (! (curNum >= start && curNum <= end)) {
                start = curNum;
                end = start + m - 1;
                answer++;
            }
        }

        return answer;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(8, 4, new int[] {2,3,6});
        System.out.println("result: " + result);
    }

}
