package org.example.data_structure.graph_인접행렬;

public class Main {
    static int [][] adjacency_matrix; // 인접 행렬

    static void printGraph(int [][] graph) {
        for(int i = 1; i < graph.length ; i++) {
            for(int j = 1; j < graph.length; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void putEdge(int x, int y) {
        adjacency_matrix[x][y] = 1;
        adjacency_matrix[y][x] = 1;
    }

    public static void main(String[] args) {
        int n = 5; // 정점 개수

        // index를 1부터 맞추기 위해 n + 1한다.
        adjacency_matrix = new int[n + 1][n + 1];

        putEdge(1,2);
        putEdge(1,3);
        putEdge(2,3);
        putEdge(2,5);

        printGraph(adjacency_matrix);

    }

}
