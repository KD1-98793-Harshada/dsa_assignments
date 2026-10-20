import java.util.*;

public class Assignment8_5 {

    private int vertices;
    private LinkedList<Integer>[] adj;


    @SuppressWarnings("unchecked")
    public Assignment8_5(int vertices) {
        this.vertices = vertices;
        adj = new LinkedList[vertices];

        for (int i = 0; i < vertices; i++) {
            adj[i] = new LinkedList<>();
        }
    }


    public void addEdge(int source, int destination) {
        adj[source].add(destination);
        adj[destination].add(source);
    }


    public void BFS(int start) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        System.out.print("BFS: ");

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int neighbour : adj[vertex]) {
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    queue.add(neighbour);
                }
            }
        }

        System.out.println();
    }


    public void DFS(int start) {
        boolean[] visited = new boolean[vertices];

        System.out.print("DFS: ");
        dfsRecursive(start, visited);
        System.out.println();
    }

    private void dfsRecursive(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int neighbour : adj[vertex]) {
            if (!visited[neighbour]) {
                dfsRecursive(neighbour, visited);
            }
        }
    }

    public static void main(String[] args) {
        Assignment8_5 graph = new Assignment8_5(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);

        graph.BFS(0);
        graph.DFS(0);
    }
}