public class climbing_stairs {

    public static int findWaysMemo(int n, int[]dp){
        if (n==0 || n==1) {
            return 1;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = findWaysMemo(n-2, dp)+findWaysMemo(n-1, dp);

        return dp[n];
    }

    public static int findWaysTable(int n, int[] dp){
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<dp.length;i++){
            dp[i] = dp[i-2]+dp[i-1];
        }

        return dp[n];
    }
    public static void main(String[] args) {
        int n=5;
        int[] dp = new int[n+1];
        System.out.println("By memoization -> "+findWaysMemo(n,dp));
        System.out.println("By tabulation -> "+findWaysTable(n,dp));
    }
}
