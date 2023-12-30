import java.util.*;

public class palindrome {

    public static boolean Palindrome(String str) {
        for(int i=0 ; i<str.length()/2 ; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                System.out.println("Given string is not Palindrome ");
                return false;
            }
        }
        System.out.println("Given string is palindrome.");
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.next();
        System.out.println(Palindrome(str));
    }
}
