import java.util.*;
public class bipartiteGraph {

    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            src = s;
            dest = d;
        }
    }

    public static boolean isBipartite(ArrayList<Edge>[] graph){
        int v = graph.length;
        int[] col = new int[v];

        for(int i=0;i<v;i++){
            col[i] = -1;
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<v;i++){
            if(col[i] == -1){
                col[i] = -1;
                q.add(i);

                while(!q.isEmpty()){
                    int curr = q.remove();

                    for(int j=0;j<graph[curr].size();j++){
                        Edge e = graph[curr].get(j);

                        if(col[e.dest] == -1){
                            int nextCOl = col[curr] == 0 ? 1 : 0 ;
                            col[e.dest] = nextCOl;
                            q.add(e.dest);
                        }else if(col[e.dest] == col[curr]){
                            return false;
                        }
                    }
                }
            }
        }

        return true;
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

        System.out.println(isBipartite(graph));
    }
}
