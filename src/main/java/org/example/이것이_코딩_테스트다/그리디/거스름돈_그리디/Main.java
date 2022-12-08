package org.example.이것이_코딩_테스트다.그리디.거스름돈_그리디;

public class Main {
    static int n = 1260;
    static int [] coins = {500, 100, 50, 10};

    public static void main(String[] args) {
        int answer = 0;
        for(int coin : coins) {
            answer += n / coin;
            n %= coin;
        }
        System.out.println(answer);
    }
}
