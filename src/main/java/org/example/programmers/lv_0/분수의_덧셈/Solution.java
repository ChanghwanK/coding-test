package org.example.programmers.lv_0.분수의_덧셈;

public class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];

        int n = num1 * num2;
        int de = num1 * denum2 + num2 * denum1;
        int max = 1;

        for(int i = 1; i <= n && i <= de; i++) {
            if (n % i == 0 && de % i == 0) {
                max = i;
            }
        }

        answer[0] = de/max;
        answer[1] = n/max;
        return answer;
    }

    static int gcd(int a, int b) { //최대 공약수

        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        while(b > 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }

        return a;
    }

    static int lcm(int a, int b) { //최소 공배수
        int gcd = gcd(a,b);
        return a*b / gcd;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        var data = solution.solution(1,	2,	3,	4);
//        var data = solution.solution(9,	2,	1,	3);
//        var data = solution.solution(3,	5,	2,	4);
        System.out.println(data[0]);
        System.out.println(data[1]);
    }
}
