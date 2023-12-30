public class coin_change {

    public static int coinChange(int[] coins, int[][] dp, int sum){

        for(int i=0;i<dp.length;i++){
            dp[i][0]=1;
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (coins[i-1] <= j) {
                    dp[i][j] = dp[i][j-coins[i-1]]+dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[dp.length-1][sum];
    }
    public static void main(String[] args) {
        int[] coins = {1,2,3};
        int sum = 4;
        int dp[][] = new int[coins.length+1][sum+1];

        System.out.println(coinChange(coins, dp, sum));

    }
}
