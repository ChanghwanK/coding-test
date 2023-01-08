package org.example.algorithm.유클리드;

/**
 * 유클리드 호제법
 */
public class EuclideanAlgorithm {

    int gcdR(int a, int b) {
        if (a % b == 0) return b;
        else return gcd(b, a % b);
    }


    static int recursiveGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return recursiveGCD(b, a % b);
    }

    static int gcd(int a, int b) {
        while(b > 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a,b);
    }

    public static void main(String[] args) {
        System.out.println(gcd(12,15));
    }
}
