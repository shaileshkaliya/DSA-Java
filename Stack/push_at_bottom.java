import java.util.Stack;

public class push_at_bottom {

    public static void pushATBottom(Stack<Integer> s,int data)
    {
        if(s.empty()){
            s.push(data) ;
            return ;
        }
        int top = s.pop() ;

        pushATBottom(s, data);

        s.push(top) ;
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>() ;

        s.push(5) ;
        s.push(6) ;
        s.push(7) ;
        s.push(8) ;

        System.out.println(s.peek());
        
        pushATBottom(s,9) ;

        while(!s.empty()){
            System.out.println(s.pop()+" ");
        }
        System.out.println();

    }
}
