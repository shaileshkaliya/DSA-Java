import java.util.PriorityQueue;

public class Connect_Ropes {

    public static int findMinCost(int[] ropes){
        int sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0;i<ropes.length;i++){
            pq.add(ropes[i]);
        }

        while(pq.size() > 1){
            int min1 = pq.remove();
            int min2 = pq.remove();

            sum+=(min1+min2);
            pq.add(min1+min2);
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] ropes = {4, 3, 2, 6};

        System.out.println(findMinCost(ropes));
    }
}
