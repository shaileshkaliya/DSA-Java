import java.util.Arrays;

public class knapsack {

    // Regular recurssion code : TC = O(2n)
    public static int findMaxProfit(int[] val, int[] wt, int cap, int n) {
        if (n == 0 || cap == 0) {
            return 0;
        }

        if (wt[n - 1] <= cap) {
            int includeItem = val[n - 1] + findMaxProfit(val, wt, cap - wt[n - 1], n - 1);
            int excludeItem = findMaxProfit(val, wt, cap, n - 1);
            return Math.max(includeItem, excludeItem);
        } else {
            int excludeItem = findMaxProfit(val, wt, cap, n - 1);
            return excludeItem;
        }
    }

    // dp memoization : TC = O(n*w);
    public static int findMAxProfitMemo(int[] val, int[] wt, int W, int[][] dp, int n) {
        if (n == 0 || W == 0) {
            return 0;
        }

        if (dp[n][W] != 0) {
            return dp[n][W];
        }

        if (wt[n - 1] <= W) {
            dp[n][W] = Math.max(val[n - 1] + findMAxProfitMemo(val, wt, W - wt[n - 1], dp, n - 1),
                    findMAxProfitMemo(val, wt, W, dp, n - 1));
            return dp[n][W];
        } else {
            dp[n][W] = findMAxProfitMemo(val, wt, W, dp, n - 1);
            return dp[n][W];
        }

    }

    // dp tabulation : tc = O(n*w);
    public static int findMaxProfitTab(int[] val, int[] wt, int W, int[][] dp, int n) {

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (wt[i - 1] <= j) {
                    dp[i][j] = Math.max(val[i - 1] + dp[i - 1][j - wt[i - 1]],
                            dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][W];
    }

    //unbounded knapsack : means one item can be added multiple times 
    public static int findMaxProfitUnbounded(int[] val, int[] wt, int W, int[][] dp, int n){
        for(int i=1;i<dp.length;i++){
            for (int j = 0; j < dp[0].length; j++) {
                if (wt[i-1]<=j) {
                    dp[i][j] = Math.max(val[i-1]+dp[i][j-wt[i-1]], dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][W];
    }


    public static void main(String[] args) {
        int[] val = { 10, 20, 50, 15, 50 };
        int[] wt = { 2, 1, 5, 3, 2 };
        int cap = 8;

        int dp[][] = new int[val.length + 1][cap + 1];
        System.out.println(findMaxProfitUnbounded(val, wt, cap, dp, 5));
    }
}
