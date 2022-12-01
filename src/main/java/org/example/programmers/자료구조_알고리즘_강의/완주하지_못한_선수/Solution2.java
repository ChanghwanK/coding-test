package org.example.programmers.자료구조_알고리즘_강의.완주하지_못한_선수;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    // 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
    // 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
    public String solution(String[] participant, String[] completion) {
        // 이름을 키로 등장한 횟수를 value로 저장
        Map<String, Integer> pMap = new HashMap<>();

        for(String pName : participant) {
            pMap.put(pName, pMap.getOrDefault(pName, 0) + 1);
        }

        for(String cName : completion) {
            int a = pMap.get(cName) - 1;
            if (a == 0) pMap.remove(cName);
            else pMap.put(cName, a);
        }

        // completion에서 등장하는 key들로 조회해서 있다면 value - 1
        return pMap.keySet().iterator().next();
    }
    
    public static void main(String[] args) {
        Solution2 solution = new Solution2();

        var a = solution.solution(
            new String[]{"mislav", "stanko", "mislav", "ana"},
            new String[] {"stanko", "ana", "mislav"}
        );

        System.out.println("result: " + a);
    }

}
