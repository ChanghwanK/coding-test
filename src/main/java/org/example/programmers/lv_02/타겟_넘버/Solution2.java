package org.example.programmers.lv_02.타겟_넘버;

class Solution2 {
    int ans;
    int [] numbers;
    int target;

    public int solution(int[] numbers, int target) {
        ans = 0;
        this.numbers = numbers;
        this.target = target;

        dfs(0, 0);
        return ans;
    }

    void dfs(int index, int sum) {
        // 탈출 조건
        // index == numbers.length까지 무조건 더해질 것이기 때문에
        // 우리는 index까지의 누적합을 던져주는 것으로 해결할 수 있다.
        if (index == numbers.length) {
            if (sum == target) ans++;
            return;
        }
        // 수행도작
        dfs(index + 1, sum + numbers[index]);
        dfs(index + 1, sum - numbers[index]);
    }


    public static void main(String [] args) {
        Solution2 solution2 = new Solution2();
        int [] numbers = new int[] {1,1,1,1,1};
        int target = 3;

        var result = solution2.solution(numbers, target);
        System.out.println("result: " + result);
    }
}
