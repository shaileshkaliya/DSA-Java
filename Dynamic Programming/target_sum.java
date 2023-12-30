public class target_sum {

    public static boolean subsetSum(int[] nums, boolean [][]dp, int n, int target){
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = true;
        }

        for(int i=1;i<dp.length;i++){
            for (int j = 1; j < dp[0].length; j++) {
                if (nums[i-1]<=j && dp[i-1][j-nums[i-1]]) {
                    dp[i][j] = true;
                }else if (dp[i-1][j]) {
                    dp[i][j]=true;
                }
            }
        }

        return dp[n][target];
    }
    public static void main(String[] args) {
        int[] nums = {4, 2, 7, 1, 3};
        int target = 20;
        boolean[][] dp = new boolean[nums.length+1][target+1];

        System.out.println(subsetSum(nums, dp, 5, target));
    } 
}
