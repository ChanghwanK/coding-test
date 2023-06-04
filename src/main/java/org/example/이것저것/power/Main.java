package org.example.이것저것.power;

public class Main {
    static int power(int n, int m) {
        if (m == 0)
            return 1;
        if (n == 1)
            return 1;
        if (n == 0)
            return 1;

        return n * power(n, m - 1);
    }

    public static void main(String[] args) {
        System.out.println(power(2, 3));
    }

}
