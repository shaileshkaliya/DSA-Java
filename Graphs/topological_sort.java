import java.util.ArrayList;
import java.util.Stack;

public class topological_sort {
    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void topSort(ArrayList<Edge>[] graph) {
        boolean[] vis = new boolean[graph.length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                topSortUtil(graph, i, vis, st);
            }
        }
        System.out.println("Sorted : ");
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }

    private static void topSortUtil(ArrayList<Edge>[] graph, int curr, boolean[] vis, Stack<Integer> st) {
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                vis[e.dest] = true;
                topSOrtUtil(graph, e.dest, vis, st);
            }
        }
        st.push(curr);
    }

    public static void main(String[] args) {
        int v = 5;

        ArrayList<Edge>[] graph = new ArrayList[v];

        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        // graph[1].add(new Edge(1, 0));
        // graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        // graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 4));

        // graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        // graph[4].add(new Edge(4, 2));

        topSort(graph);
    }
}
