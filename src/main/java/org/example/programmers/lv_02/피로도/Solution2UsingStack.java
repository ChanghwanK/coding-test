package org.example.programmers.lv_02.피로도;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution2UsingStack {
    public boolean[] visit;
    public int answer = 0;

    static class Dungeon {
        int needPirodo;
        int cunsumPirodo;
        boolean isVisit;

        public Dungeon(int needPirodo, int cunsumPirodo) {
            this.needPirodo = needPirodo;
            this.cunsumPirodo = cunsumPirodo;
        }
    }

    public int solution(int k, int[][] dungeons) {
        // 던전 init
        List<Dungeon> dungeonList = new ArrayList<>();
        for (int [] dug : dungeons) {
            dungeonList.add(new Dungeon(dug[0], dug[1]));
        }

        dfs(dungeonList, k);

        return answer;
    }

    public void dfs(List<Dungeon> dungeonList, int currentPirodo) {
        for(int i = 0; i < dungeonList.size(); i++) {
            Stack<Dungeon> stack = new Stack<>();
            stack.push(dungeonList.get(i));

            while(!stack.isEmpty()) {
                Dungeon dungeon = stack.pop();
                if (!dungeon.isVisit && dungeon.needPirodo > currentPirodo) {
                    break;
                } else {
                    dungeon.isVisit = true;
                    stack.push(dungeonList.get(i));
                    answer++;
                    dfs(dungeonList, (currentPirodo - dungeon.cunsumPirodo));
                }
            }
        }

    }


    public static void main(String [] args) {
        Solution2UsingStack solution = new Solution2UsingStack();
        int [][] dungeons = {
            {80,20}, {50,40}, {30,10}
        };
        var result = solution.solution(80, dungeons);
        System.out.println("result: " + result);
    }
}
