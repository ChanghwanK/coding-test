package org.example.algorithm.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * 1,2,3 배열에서 2개를 뽑는 조합 출력
 */
public class Main3 {
    static int [] nums = {1,2,3};
    static boolean[] selected = new boolean[nums.length];

    static void comb(int r, List<Integer> cur, int idx) {
        if(cur.size() == r) {
            System.out.println(cur);
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            if(! selected[i]) {
                selected[i] = true;
                cur.add(nums[i]);
                comb(r, cur, i);
            }
        }
    }

    public static void main(String[] args) {
        comb(2,new ArrayList<>(), 0);
    }

}
