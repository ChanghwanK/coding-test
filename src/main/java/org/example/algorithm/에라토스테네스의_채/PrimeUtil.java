package org.example.algorithm.에라토스테네스의_채;

public class PrimeUtil {
    static int n = 100000;
    static boolean isPrime(int n) {
        for(int i = 2; i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static int primeNumberSieve() {
        int [] a = new int[n + 1];
        int cnt = 0;
        for(int i = 2; i <= n; i++) {
            a[i] = i;
        }

        for(int i = 2; i <= n; i++) {
            if(a[i] == 0) continue;
            for(int j = i + i; j <= n; j+= i) {
                a[j] = 0;
            }
        }

        for(int i = 2; i <= n; i++) {
            if(a[i] != 0) {
                cnt ++;
                System.out.println(a[i]);
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        int cnt = primeNumberSieve();
        System.out.println(cnt);
    }
}
