import java.util.ArrayList;

public class hasPath {

    static class Edge{
        int src;
        int dest;

        Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static boolean haspath(ArrayList<Edge>[] graph, int dest){
        boolean[] vis = new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i] && haspathUtil(graph, vis, i, dest)){
                return true;
            }
        }
        return false;
    }

    private static boolean haspathUtil(ArrayList<Edge>[] graph, boolean[] vis, int curr, int dest){
        if(curr == dest){
            return true ;
        }

        vis[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest] && haspathUtil(graph, vis, e.dest, dest)){
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

        System.out.println(haspath(graph, 1));
    }
}
