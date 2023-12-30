import java.util.ArrayList;

public class directed_graph_cycle_detection {
    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static boolean isCycle(ArrayList<Edge>[] graph) {
        boolean[] stack = new boolean[graph.length];
        boolean[] vis = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (isCycleUtil(graph, vis, i, stack)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isCycleUtil(ArrayList<Edge>[] graph, boolean[] vis, int curr, boolean[] stack) {
        vis[curr] = true;
        stack[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (stack[e.dest]) {
                return true;
            }
            if (!vis[e.dest] && isCycleUtil(graph, vis, e.dest, stack)) {
                return true;
            }
        }
        stack[curr] = false;
        return false;
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
        // graph[2].add(new Edge(2, 4));

        // graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        // graph[4].add(new Edge(4, 3));

        System.out.println(isCycle(graph));
    }
}
