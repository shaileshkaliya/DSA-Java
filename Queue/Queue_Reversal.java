import java.util.*;
public class Queue_Reversal {

    public static void reverseQueue(Queue<Integer>q){
        Stack<Integer> st = new Stack<>();

        while(!q.isEmpty()){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);

        System.out.println(q);

        reverseQueue(q);

        System.out.println(q);
    }
}
