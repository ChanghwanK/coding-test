package org.example.data_structure.graph_인접리스트;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<ArrayList<Integer>> graph;

    static void print() {
        for(int i = 1;  i < graph.size(); i++) {
            ArrayList<Integer> node = graph.get(i);
            for(int j = 0; j < node.size(); j++) {
                System.out.print(node.get(j) + "->");
            }
            System.out.println();
        }
    }
    static void putEdge(int x, int y) {
        graph.get(x).add(y);
        // 만약 단방향이면 아래는 생략한다.
        graph.get(y).add(x);
    }
    public static void main(String[] args) {
        int n = 5;
        graph = new ArrayList<>();

        // array list의 0번 index는 사용하지 않고 1~n까지 사용하기 때문에 <= n이다.
        for(int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        putEdge(1,2);
        putEdge(1,3);
        putEdge(1,4);
        putEdge(2,3);
        putEdge(2,5);
        putEdge(3,4);

        print();
    }
}
