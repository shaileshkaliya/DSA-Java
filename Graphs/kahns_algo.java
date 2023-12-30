import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class kahns_algo {

    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    private static void calc_indeg(ArrayList<Edge>[] graph, int[] indeg){
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].size();j++){
                Edge e = graph[i].get(j);
                indeg[e.dest]++;
            }
        }
    }

    public static void kahnsALgo(ArrayList<Edge>[] graph){
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[graph.length];
        int[] indeg = new int[graph.length];
        
        calc_indeg(graph, indeg);

        for(int i=0;i<indeg.length;i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            int curr = q.remove();
            vis[curr] = true;
            System.out.print(curr+" ");

            for(int i=0;i<graph[curr].size();i++){
                Edge e = graph[curr].get(i);
                if (!vis[e.dest]) {
                    indeg[e.dest]--;
                    if (indeg[e.dest] == 0) {
                        q.add(e.dest);
                    }
                }
            }
        }
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
        kahnsALgo(graph);
    }
}
