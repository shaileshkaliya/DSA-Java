public class Tilling_problem {

    public static int TillingMethods(int n) //floor size is 2*n
    {   
        //base case
        if(n == 1 || n == 2) {
            return n;
        }

        // vertical method of fitting tiles case
        int fnm1 = TillingMethods(n-1);

        // horizontal method of fitting tiles case 
        int fnm2 = TillingMethods(n-2);

        //total number of ways 
        return fnm1+fnm2 ;
    }
    public static void main(String[] args) {
        System.out.println(TillingMethods(4));
    }
}
