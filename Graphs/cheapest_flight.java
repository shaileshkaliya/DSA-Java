import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class cheapest_flight {
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

    static class Pair{
        int n;
        int cost;
        int stops;

        Pair(int n, int c, int st){
            this.n = n;
            this.cost = c;
            this.stops = st;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph, int[][] flights){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0;i<flights.length;i++){
            graph[flights[i][0]].add(new Edge(flights[i][0], flights[i][1], flights[i][2]));
        }
    }

    public static int cheapestFlight(ArrayList<Edge>[] graph, int src, int dest, int k){
        int[] dist = new int[graph.length];
        for(int i=0;i<dist.length;i++){
            if (i!=src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(src, 0, 0));

        while (!q.isEmpty()) {
            Pair curr = q.remove();

            if(curr.stops > k){
                break;
            }
            
            for(int i=0;i<graph[curr.n].size();i++){
                Edge e = graph[curr.n].get(i);
                if(curr.cost+e.wt < dist[e.dest]){   // if coded not worked for any case then add this condition also  && curr.stops<=k
                    dist[e.dest] = e.wt+curr.cost;
                    q.add(new Pair(e.dest, dist[e.dest], curr.stops+1));
                }
            }
        }

        if (dist[dest] == Integer.MAX_VALUE) {
            return -1;
        }else{
            return dist[dest];
        }
    }
    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge>[] graph = new ArrayList[v];

        int flights[][] = { { 0, 1, 1 }, { 0, 2, 5 }, {1,2,1}, { 2, 3, 1 }};
        int src = 0;
        int dest = 3;
        int k = 1;

        createGraph(graph, flights);
        System.out.println(cheapestFlight(graph, 0, 3, 1));
    }
}
