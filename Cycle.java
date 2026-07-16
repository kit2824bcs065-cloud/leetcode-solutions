import java.util.*;

public class Cycle {

    static void dfs(int node, ArrayList<ArrayList<Integer>> graph, boolean[] visited) {
        visited[node] = true;

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, graph, visited);
            }
        }
    }

    static int countComponents(int n, ArrayList<ArrayList<Integer>> graph) {
        boolean[] visited = new boolean[n];
        int components = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, graph, visited);
                components++;
            }
        }
        return components;
    }

    public static void main(String[] args) {
        int n = 5;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        addEdge(graph, 0, 1);
        addEdge(graph, 1, 2);
        addEdge(graph, 2, 0); 
        addEdge(graph, 3, 4);

        int edges = countEdges(graph);
        int components = countComponents(n, graph);

        int cycles = edges - n + components;

        System.out.println("Number of cycles: " + cycles);
    }

    static void addEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    static int countEdges(ArrayList<ArrayList<Integer>> graph) {
        int total = 0;

        for (ArrayList<Integer> list : graph) {
            total += list.size();
        }

        return total / 2; 
    }
}