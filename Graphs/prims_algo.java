import java.util.ArrayList;
import java.util.PriorityQueue;

public class prims_algo {

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
        int n;
        int cost;

        Pair(int n, int c) {
            this.n = n;
            this.cost = c;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }
    }

    public static void MST(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(new Pair(0, 0));
        int finalCost = 0;
        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!vis[curr.n]) {
                vis[curr.n] = true;
                finalCost += curr.cost;
                for(int i=0;i<graph[curr.n].size();i++){
                    Edge e = graph[curr.n].get(i);
                    pq.add(new Pair(e.dest, e.wt));
                }
            }
        }

        System.out.println("Minimum cost is : "+finalCost);
    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge>[] graph = new ArrayList[v];

        for(int i=0;i<v;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 3, 30));
        graph[0].add(new Edge(0, 2, 15));

        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 3, 50));

        // graph[3].add(new Edge(i, v, i))

        MST(graph);
    }
}
