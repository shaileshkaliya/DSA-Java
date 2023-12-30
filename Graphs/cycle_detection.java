import java.util.ArrayList;

public class cycle_detection {

    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            src = s;
            dest = d;
        }
    }

    public static boolean detectCycle(ArrayList<Edge>[] graph) {
        int v = graph.length;
        boolean[] vis = new boolean[v];

        for (int i = 0; i < v; i++) {
            if (!vis[i] && detectCycleUtil(graph, vis, i, -1)) {
                return true;
            }
        }
        return false;
    }

    private static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean[] vis, int curr, int par) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            // case 3
            if (!vis[e.dest]) {
                if (detectCycleUtil(graph, vis, e.dest, curr)) {
                    return true;
                }
            }

            // case 1
            else if (vis[e.dest] && e.dest != par) {
                return true;
            }
        }

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

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));

        System.out.println(detectCycle(graph));
    }
}
