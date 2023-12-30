public class rod_cutting {

    public static int max_price_rod_cutting(int[] length, int[] price, int rodLen){
        int[][] dp = new int[length.length+1][rodLen+1];

        for(int i=0;i<dp.length;i++){
            for (int j = 0; j < dp[0].length; j++) {
                if (i==0 || j==0) {
                    dp[i][j]=0;
                }
                else{
                    if (length[i-1] <= j) {
                        dp[i][j] = Math.max(price[i-1]+dp[i][j-length[i-1]], dp[i-1][j]);
                    }else{
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
        }

        return dp[length.length][rodLen];
    }
    public static void main(String[] args) {
        int[] length = {1,2,3,4,5,6,7,8};
        int[] price = {1,5,8,9,10,17,17,20};
        int rodLen = 8;
        System.out.println(max_price_rod_cutting(length, price, rodLen));
    }
}
