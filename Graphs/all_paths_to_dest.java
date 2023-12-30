import java.util.*;
public class all_paths_to_dest {
    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void allPaths(ArrayList<Edge>[] graph, int src, int dest, String path){
        if (src == dest) {
            System.out.println(path+dest);
            return;
        }

        for(int i=0;i<graph[src].size();i++){
            Edge e = graph[src].get(i);
            allPaths(graph, e.dest, dest, path+src);
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
        allPaths(graph, 0, 4, "");
    }
}
