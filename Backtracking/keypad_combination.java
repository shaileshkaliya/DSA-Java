import java.util.Scanner;
import java.util.* ;

public class keypad_combination {
    public static String keypad[] = {"","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void PrintCombinations(String str,int index,String combinations)
    {
        if(index == str.length()){
            System.out.println(combinations);
            return ;
        }
        String temp= keypad[str.charAt(index)-'0'] ;
        
        for(int i=0 ; i<temp.length() ; i++){
            PrintCombinations(str, index+1,combinations+temp.charAt(i));
        }

    }

    

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>() ;
        String str ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter digits strings : ");
        str = sc.next() ;
        PrintCombinations(str,0,"");
        // System.out.println(keypad[str.charAt(0)-'0']);
    }
}
