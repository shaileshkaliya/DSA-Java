import java.util.* ;

public class reverse_string {
    
    public static String ReverseString(String str)
    {
        Stack<Character> s = new Stack<>() ;
        for(int i=0 ; i<str.length() ; i++){
            s.push(str.charAt(i)) ;
        }
        str = "" ;
        while (!s.empty()) {
            str += s.pop() ;
        }

        return str ;
    }
    public static void main(String[] args) {

        String str = "abcde" ;
        
        System.out.println(ReverseString(str)) ;

    }
}
