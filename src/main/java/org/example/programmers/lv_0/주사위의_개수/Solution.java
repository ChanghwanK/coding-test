package org.example.programmers.lv_0.주사위의_개수;

public class Solution {
    public int solution(int[] box, int n) {
        int a = box[0] / n;
        int b = box[1] / n;
        int c = box[2] / n;

        return a * b * c;
    }

    public static void main(String[] args) {
        int [] box = new int [] {1,1,1};
        int [] box2 = new int [] {10, 8, 6};

        Solution solution = new Solution();
        var result = solution.solution(box, 1);
        var result2 = solution.solution(box2, 3);

        System.out.println("result1");
        System.out.println(result);
        System.out.println("result2");
        System.out.println(result2);
    }
}
