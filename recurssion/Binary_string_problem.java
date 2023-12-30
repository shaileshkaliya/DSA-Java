public class Binary_string_problem {

    public static void PrintBinaryStrings(int n,String str,int lastPos) //n is size of string to be printed
    {   
        //base case
        if(n == 0) {
            System.out.println(str);
            return ;
        }

        //kaam
        PrintBinaryStrings(n-1,str+"0", 0);
        if(lastPos != 1){
            PrintBinaryStrings(n-1, str+"1", 1);
        }
    }
    public static void main(String[] args) {
        PrintBinaryStrings(4, " ", 0);
    }
}
