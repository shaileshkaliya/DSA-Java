// package Stack;
import java.util.Stack;
public class stack_jcf {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>() ;

        s.push(100) ;
        s.push(90) ;
        s.push(80) ;

        System.out.println(s);

        System.out.println("The top is : "+s.peek());

        while(!s.empty()){
            System.out.print(s.pop()+" ");
        }
        System.out.println();
        System.out.println(s.empty() );

    }
}
