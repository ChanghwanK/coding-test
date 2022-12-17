package org.example.algorithm.search.dfs;

import java.util.LinkedList;
import java.util.List;

public class DFSRecursive {
    static class Node {
        private final String data;
        private boolean visited;
        private final List<Node> links;

        public Node(String data) {
            this.data = data;
            visited = false;
            links = new LinkedList<>();
        }

        void visit() {
            this.visited = true;
        }

        void link(Node node) {
            this.links.add(node);
        }
    }


    // 탐색할 그래프가 있어야함
    // 그래프를 만들어주는 코드가 추가되어야 함
    public static void main(String[] args) {
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");

        nodeA.link(nodeB);


    }
}
