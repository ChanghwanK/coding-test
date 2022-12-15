package org.example.programmers.코테_광탈_방지_KIT.기지국_설치;

public class Solution2 {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int si = 0;
        int position = 1;


        while(position <= n) {
            if(si < stations.length && stations[si] - w <= position) {
                position = stations[si] + w + 1;
                si++;
            } else {
                answer++;
                position += w * 2 + 1;
            }

        }

        return answer;
    }

    public static void main(String [] args) {
        Solution2 solution = new Solution2();
        var result = solution.solution(11, new int[]{4, 11}, 1);
        System.out.println("result: " + result);
    }
}
