import java.util.ArrayList;
import java.util.PriorityQueue;

public class dijkstra_algo {
    static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static class Pair implements Comparable<Pair> {
        int node;
        int path;

        Pair(int n, int p) {
            node = n;
            path = p;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.path - p2.path;
        }
    }

    public static void dijkstras(ArrayList<Edge>[] graph, int src) {
        int dist[] = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean[] vis = new boolean[graph.length];
        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {
            Pair p = pq.remove();
            if (!vis[p.node]) {
                vis[p.node] = true;
                for (int i = 0; i < graph[p.node].size(); i++) {
                    Edge e = graph[p.node].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int w = e.wt;
                    // System.out.println(u, v, wt);
                    if ((dist[u] + w) < dist[v]) {
                        dist[v] = dist[u] + w;
                        pq.add(new Pair(v, dist[v])); // Corrected line
                    }

                }
            }
        }

        for (int i = 0; i < graph.length; i++) {
            System.out.println(dist[i]);
        }

    }

    public static void main(String[] args) {
        int v = 6;

        ArrayList<Edge>[] graph = new ArrayList[v];

        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        // graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 7));

        // graph[2].add(new Edge(2, 0));
        // graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 4, 3));

        // graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 5, 1));

        // graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));

        int src = 0;
        dijkstras(graph, src);
    }
}
