import java.util.* ;

public class reverse_stack {

    public static void PushATBottom(Stack<Integer>s , int data)
    {
        if(s.isEmpty()){
            s.push(data) ;
            return ;
        }
        int top = s.pop() ;
        PushATBottom(s, data);
        s.push(top) ;
    }
    public static void ReverseStack(Stack<Integer> s)
    {
        if(s.isEmpty()){
            return ;
        }

        int top = s.pop() ;

        ReverseStack(s);

        PushATBottom(s, top);

    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>() ;
        s.push(90) ;
        s.push(100) ;
        s.push(80) ;
        s.push(50) ;

        ReverseStack(s);

        while (!s.isEmpty()) {
            System.out.println(s.pop()+" ");
        }
        System.out.println();
    }
}
