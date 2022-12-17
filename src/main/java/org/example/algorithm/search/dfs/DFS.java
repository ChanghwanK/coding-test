package org.example.algorithm.search.dfs;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DFS {

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

    public static void main(String[] args) {
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");

        nodeA.link(nodeB);
        nodeB.link(nodeD);
        nodeB.link(nodeC);
        nodeC.link(nodeE);

        Stack<Node> stack = new Stack<>();
        stack.push(nodeA);

        while(!stack.isEmpty()) {
            Node node = stack.pop();
            node.visit();
            System.out.println(node.data);
            for (Node n : node.links) {
                if (!n.visited) {
                    n.visit();
                    stack.push(n);
                }
            }
        }
    }
}
