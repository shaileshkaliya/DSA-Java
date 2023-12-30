import java.util.* ;

public class valid_parenthesis {

    public static boolean isValidParenthesis(String str)
    {
        Stack<Character> s = new Stack<>() ;
        for(int i=0 ; i<str.length() ; i++) {

            if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
                s.push(str.charAt(i)) ;
            }

             else if(s.isEmpty()){
                return false ;
            }

            else if((s.peek() == '(' && str.charAt(i) == ')' )
            || (s.peek() == '[' && str.charAt(i) == ']' )
            || (s.peek() == '{' && str.charAt(i) == '}' )) {

                s.pop() ;

            } else{
                return false ;
            }
            
        }
        if(!s.isEmpty()){
            return false ;
        }

        return true ;
    }
    public static void main(String[] args) {
        String str = "]" ;

        System.out.println(isValidParenthesis(str));
    }
}
