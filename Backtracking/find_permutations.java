public class find_permutations {

    public static void FindPermutations(String str,String ans)
    {
        // base case
        if(str.length() == 0){
            System.out.println(ans);
            return ;
        }

        //recursion
        for(int i=0 ; i<str.length() ; i++)
        {
            char currChar = str.charAt(i) ;
            String newStr = str.substring(0, i)+str.substring(i+1) ;
            FindPermutations(newStr, ans+currChar);
        }
    }
    public static void main(String[] args) {
        String str = "abc" ;
        FindPermutations(str, "");
    }
}
