
public class fibonacci {

    public static int find_fibonacci_memoization(int n, int[] dp){
        if (n==0 || n==1) {
            return n;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = find_fibonacci_memoization(n-1, dp)+find_fibonacci_memoization(n-2, dp);

        return dp[n];

    }

    public static int find_fibonacci_tabulation(int n, int[] dp){
        dp[0]=0;
        for(int i=1;i<dp.length;i++){
            if (i==1) {
                dp[i]=1;    
            }else{
                dp[i] = dp[i-1]+dp[i-2];
            }
        }

        return dp[n];
    }
    public static void main(String[] args) {
        int n=100;
        int dp[] = new int[n+1];
        System.out.println("Ans by memoization -> "+find_fibonacci_memoization(n, dp));
        System.out.println("Ans by tabulation -> "+find_fibonacci_tabulation(n, dp));
    }
}
