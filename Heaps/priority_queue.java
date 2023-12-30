import java.util.*;

public class priority_queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(1);
        pq.add(6);
        pq.add(0);
        while(!pq.isEmpty()){
            System.out.print(pq.remove()+" ");
        }

    }    
}
