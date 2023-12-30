import java.util.ArrayList;
import java.util.PriorityQueue;

public class connecting_cities {
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
    static class Pair implements Comparable<Pair>
    {
        int n;
        int cost;

        Pair(int n, int w) {
            this.n = n;
            this.cost = w;
        }

        @Override
        public int compareTo(Pair p2){
            return this.cost-p2.cost;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph, int[][] cities){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0;i<cities.length;i++){
            for(int j=0;j<cities[0].length;j++){
                graph[i].add(new Edge(i, j, cities[i][j]));
            }
        }
    }

    public static int MST(ArrayList<Edge>[] graph){
        boolean[] vis = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0,0));

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

        return finalCost;
    }


    public static void main(String[] args) {
        int[][] cities = {
            {0,1,2,3,4},
            {1,0,5,0,7},
            {2,5,0,6,0},
            {3,0,6,0,0},
            {4,7,0,0,0}
        };

        ArrayList<Edge>[] graph = new ArrayList[cities.length];

        createGraph(graph, cities);
        System.out.println(MST(graph));
    }
}
