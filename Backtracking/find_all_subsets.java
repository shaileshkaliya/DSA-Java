/*
Any string of size n have 2 to the power n subsets i.e if string is abc then, n=3 and number of subsets is 2^3=8.
*/

public class find_all_subsets {

    public static void FindAllSubsets(String str,String ans,int i)
    {
        // base case
        if(i == str.length()) {
            if(ans == "") {
                System.out.println("Null");
            }
            else {
                System.out.println(ans);
            }
            return ;
        }

        // each letter will have two choices only , yes or no
        // recursion

        //yes case
        FindAllSubsets(str, ans+str.charAt(i), i+1) ;

        //no case
        FindAllSubsets(str, ans, i+1);

    }
    public static void main(String[] args) {
        String str = "abc" ;

        FindAllSubsets(str, "", 0);
    }
}
