import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
public class QueueJCF {
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>() ;

        /*
         We can also use ArrayDeque instead of linked list as Queue is interface in java .
         There is no difference inworking but some cache level difference 
         */

        // Queue <Integer> q = new ArrayDeque<>() ;


        q.add(50);
        q.add(90);
        q.add(60) ;

        System.out.println(q);
    }
}
