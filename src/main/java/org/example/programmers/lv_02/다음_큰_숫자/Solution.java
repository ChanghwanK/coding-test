package org.example.programmers.lv_02.다음_큰_숫자;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int nCnt = 0; // 주어진 정수 N의 이진수 1의 개수

        for (char a : Integer.toBinaryString(n).toCharArray())
            if (a == '1') nCnt ++;

        for(int i = n + 1; i <= 1000000; i++) {
            if(nCnt == getOneCntOfBinary(i)) {
                return i;
            }
        }

        return answer;
    }

    public int getOneCntOfBinary(int num) {
        int nCnt = 0;
        for (char a : Integer.toBinaryString(num).toCharArray())
            if (a == '1') nCnt ++;
        return nCnt;
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        var result = solution.solution(15);
        System.out.println("result: " + result);
    }
}
