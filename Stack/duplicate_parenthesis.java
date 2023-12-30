import java.util.Stack;

public class duplicate_parenthesis {

    public static boolean isDuplicateParenthesis(String str)
    {
        Stack<Character> s = new Stack<>() ;

        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i) ;

            if(ch == ')'){
                int cnt = 0 ;
                while(s.peek() != '('){
                    s.pop() ;
                    cnt++ ;
                }
                if(cnt < 1){
                    return true ;         // duplicate exists
                }else {
                    s.pop() ;              // pop the remaining '('
                }
            } else {
                s.push(ch) ;
            }
        }

        return false ;
    }
    public static void main(String[] args) {
        String str = "((a+b)+(c+d))" ;

        System.out.println(isDuplicateParenthesis(str));
    }
}
