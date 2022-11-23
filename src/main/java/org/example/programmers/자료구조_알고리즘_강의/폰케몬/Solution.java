package org.example.programmers.자료구조_알고리즘_강의.폰케몬;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class MyData {
    int v;

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if(o == null || getClass() != o.getClass()) {
            return false;
        }
        MyData myData = (MyData) o;
        return v == myData.v;
    }

    @Override
    public int hashCode() {
        return Objects.hash(v);
    }
}

public class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, 0);
        }

        int n1 = map.keySet().size();
        int n2 = nums.length / 2;
        return Math.min(n1, n2);
    }

    public static void main(String [] args) {
        Solution solution = new Solution();
        solution.solution(new int[] {3,1,2,3});
    }
}
