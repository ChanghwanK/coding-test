package org.example.programmers.lv_0.분수의_덧셈;

/**
 * 분모를 맞춘다.
 * 맞춘 분모에 맞게 분자를 바꾼다.
 * 둘을 더한다.
 */
public class Solution2 {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];

        // denum 이 num의 배수인지 체크

        if (denum1 % num1 == 0) {
            denum1 = denum1 % num1;
            num1 = 1;
        }

        if (denum2 % num2 == 0) {
            denum2 = denum2 % num2;
            num2 = 1;
        }

        // 공약수 찾아 약분하기
        int zd = 1;
        int zc = 1;
        for(int i = 1; i < 1000; i++) {
           if ((denum1 % i) == 0 && (num1 % i) == 0) {
               zd = i;
            }
        }

        for(int i = 1; i < 1000; i++) {
            if ((denum2 % i) == 0 && (num2 % i) == 0) {
                zc = i;
            }
        }

        denum1 = denum1 / zd;
        denum2 = denum2 / zc;

        if (num1 == num2) {
            answer[0] = denum1 + denum2;
            answer[1] = num1;
        } else {
            int lcm = lcm(num1, num2);
            int a = lcm / num1;
            int b = lcm / num2;

            int c = a * denum1;
            int d = b * denum2;

            answer[0] = c+d;
            answer[1] = lcm;
        }
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
        Solution2 solution = new Solution2();
        var data = solution.solution(1,	2,	3,	4);
//        var data = solution.solution(9,	2,	1,	3);
//        var data = solution.solution(3,	5,	2,	4);
        System.out.println(data[0]);
        System.out.println(data[1]);
    }
}
