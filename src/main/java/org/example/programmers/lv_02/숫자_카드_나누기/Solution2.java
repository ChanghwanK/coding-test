package org.example.programmers.lv_02.숫자_카드_나누기;

class Solution2 {

    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;

        // arrayA의 최소 공배수를 구함
        int gcdA = arrayA[0];
        int gcdB = arrayB[0];

        // A의 최대 공약수 하기
        for(int i = 1; i < arrayA.length; i++) {
            gcdA = gcd(gcdA, arrayA[i]);
            gcdB = gcd(gcdB, arrayB[i]);
        }

        if(notDivisible(arrayA, gcdB))
            if (answer < gcdB)
                answer = gcdB;

        if(notDivisible(arrayB, gcdA))
            if (answer < gcdA)
                answer = gcdA;


        return answer;
    }

    private boolean notDivisible(int[] array, int gcd) {
        for (int n : array)
            if (n % gcd == 0) return false;
        return true;
    }

    // B 값으로 A원소를 나눌 수 있느지?
    int gcd(int a, int b) {
        if (a % b == 0) return b;
        else return gcd(b, a % b);
    }

    public static void main(String [] args) {
        Solution2 solution = new Solution2();
//        int [] a = new int[] {10, 17};
//        int [] b = new int[] {5, 17};
//        int [] a = new int[] {10, 20};
//        int [] b = new int[] {5, 17};
        int [] a = new int[] {14, 35, 119};
        int [] b = new int[] {18, 30, 102};
        var result = solution.solution(a,b);
        System.out.println("result: " + result);
    }
}
