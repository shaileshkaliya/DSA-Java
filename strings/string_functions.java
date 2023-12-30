// package strings;
import java.util.*;
public class string_functions {

    public static void printCharacters(String str) {
        for(int i=0; i<str.length() ; i++) {
            System.out.print(str.charAt(i)+" ");
        }
    }

    public static boolean CheckEquallity(String str,String str1) {
        return str.equals(str1);
    }

    public static String substring(String str,int si,int ei) {
        //si = starting index 
        //ei = ending index
        
        return str.substring(si, ei) ;
    }

    public static int compareStrings(String str1,String str2) {
        
        return str1.compareTo(str2);
    }

    
    public static void main(String[] args) {
        String str = "Shailesh" ;
        String str2 = "Kaliya" ;
        String str3 ;

        Scanner sc = new Scanner(System.in);

        str3 = sc.nextLine();

        str3 = str3 +" "+ str +" " +str2 ;    //String concatenation

        System.out.println(str3);

        System.out.println(str2.equals(str2));
        
        System.out.println(CheckEquallity(str,str2));

        System.out.println("Substring from given indices is "+substring(str, 2, 6));
        

        if(compareStrings(str, str2) == 0) {
            System.out.println("Strings are equal ");
        }
        else if(compareStrings(str, str2) < 0) {
            System.out.println("First string is smaller than second string.They are unequal.");
        }

        
        else if(compareStrings(str, str2) > 0) {
            System.out.println("Second string is smaller than firstd string.They are unequal.");
        }

        
    }   

}
