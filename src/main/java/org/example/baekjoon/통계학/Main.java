package org.example.baekjoon.통계학;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static int N;
    static Integer [] nums;

    static void input() {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        nums = new Integer[N];

        for(int i = 0; i < N; i++)
            nums[i] = sc.nextInt();

    }

    static void solve() {
        // 산술평균 구하기
        System.out.println(getAvg());
        // 중앙값 구하기
        System.out.println(getMiddleNumInArray());
        // 최빈값 구하기
        System.out.println(getMode());
        // 범위 구하기
        System.out.println(getRange());
    }

    static int getAvg() {
        return (int) Math.round(Arrays.stream(nums).mapToInt(Integer::intValue).average().orElse(0));
    }

    static int getMiddleNumInArray() {
        int mid = nums.length / 2;
        Arrays.sort(nums);
        return nums[mid];
    }

    static int getRange() {
        return nums[nums.length - 1] - nums[0];
    }

    /**
     * 다시 고민하기
     */
    static int getMode() {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> arr = new ArrayList<>();

        for(int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        int maxValue = Collections.max(map.values());

        for (Integer key : map.keySet()) {
            if (map.get(key) == maxValue) arr.add(key);
        }

        if(arr.size() == 1) {
            return arr.get(0);
        } else {
            Collections.sort(arr);
            return arr.get(1);
        }
    }

    public static void main(String[] args) {
        input();
        solve();
    }
}
