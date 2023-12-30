import java.util.ArrayList;

public class stack_arrayList_implementation {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>() ;

        public static boolean isEmpty()
        {
            return list.size() == 0 ;
        }

        public static void push(int data)
        {
            list.add(data) ;
        }

        public static int pop()
        {
            if(isEmpty()){
                return -1 ;
            }
            int temp = list.get(list.size()-1) ;
            list.remove(list.size()-1) ;
            return temp ;
        }

        public static int peek()
        {
            return list.get(list.size()-1) ;
        }

    }
    public static void main(String[] args) {
        Stack s = new Stack() ;

        s.push(2) ;
        s.push(3) ;
        s.push(3) ;

        System.out.println("Top is "+s.peek());

        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
        System.out.println();
    }
}
