import java.util.ArrayList;

public class bellma_ford {
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

    public static void BellemanFord(ArrayList<Edge>[] graph, int src) {
        int[] dist = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (src != i) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        for (int i = 0; i < graph.length - 1; i++) {
            for (int j = 0; j < graph.length; j++) {
                for (int k = 0; k < graph[j].size(); k++) {
                    Edge e = graph[j].get(k);

                    if (dist[e.src] != Integer.MAX_VALUE && dist[e.src] + e.wt < dist[e.dest]) {
                        dist[e.dest] = dist[e.src] + e.wt;
                    }
                }
            }
        }

        for (int j = 0; j < graph.length; j++) {
            for (int k = 0; k < graph[j].size(); k++) {
                Edge e = graph[j].get(k);

                if (dist[e.src] != Integer.MAX_VALUE && dist[e.src] + e.wt < dist[e.dest]) {
                    System.out.println("Negative Weight Cycle Detected !");
                    return;
                }
            }
        }

        for(int i=0;i<dist.length;i++){
            System.out.println(i +"  -->  "+ dist[i]);
        }
    }

    public static void main(String[] args) {
        int v = 5;

        ArrayList<Edge>[] graph = new ArrayList[v];

        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));

        BellemanFord(graph, 0);

    }
}
