package org.example.data_structure;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

public class Graph {
    static class Node {
        String name;
        boolean visited;
        private final List<Node> links;

        public Node(String name) {
            this.name = name;
            this.links = new LinkedList<>();
            this.visited = false;
        }

        public boolean isVisited() {
            return this.visited;
        }

        public void visit() {
            this.visited = true;
        }

        public void link(Node node) {
            this.links.add(node);
        }

        @Override
        public boolean equals(Object o) {
            if(this == o) {
                return true;
            }
            if(o == null || getClass() != o.getClass()) {
                return false;
            }
            Node node = (Node) o;
            return name.equals(node.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return ""+name;
        }
    }

    public static void main(String[] args) {
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");

        a.link(b);
        a.link(d);
        b.link(a);
        b.link(c);
        b.link(e);
        c.link(b);
        c.link(d);
        d.link(a);
        d.link(c);
        d.link(e);
        e.link(b);
        e.link(d);

        Node target = e;
        // bfs queue 사용
        Queue<Node> queue = new LinkedList<>();
        // 시작점 초기화
        queue.offer(a);

        while(!queue.isEmpty()) {
            Node temp = queue.poll();
            System.out.println(temp);
            if(temp.equals(target)) {
                System.out.println("Found!! " + temp);
                break;
            }
            temp.links.stream()
                .filter(node -> ! node.visited)
                .filter(node -> !queue.contains(node))
                .forEach(queue::offer);
        }
    }
}
