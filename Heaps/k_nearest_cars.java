import java.util.PriorityQueue;
import java.util.Scanner;

public class k_nearest_cars {

    static class cars implements Comparable<cars> {
        int x;
        int y;
        int dist;
        int idx;

        cars(int x, int y, int dist, int idx){
            this.x = x;
            this.y = y;
            this.dist = dist;
            this.idx = idx;
        }

        @Override
        public int compareTo(cars c){
            return this.dist-c.dist ;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<cars> pq = new PriorityQueue<>();
        int k=2;

        for(int i=0;i<4;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            int dist = x*x+y*y;
            pq.add(new cars(x, y, dist, i));
        }

        for(int i=0;i<k;i++){
            System.out.println("C"+pq.remove().idx);
        }
    }
}
