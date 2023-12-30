// package arrays;
import java.util.*;
public class buy_and_sell_stocks {

    public static int BuySellStocks(int a[]) {
        int maxProfit = 0;
        int BuyingPrice = Integer.MAX_VALUE ; 
        for(int i = 0 ; i < a.length ; i++) {
            int SellingPrice = a[i] ;

            if(BuyingPrice < SellingPrice) {
                int profit = (SellingPrice - BuyingPrice) ;
                maxProfit = Math.max(maxProfit, profit);
            }
            else {
                BuyingPrice = a[i] ;
            }

        }

        return maxProfit ;
    }
    public static void main(String[] args) {
        int prices[] = new int[6];
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < prices.length ; i++){
            prices[i] = sc.nextInt();
        }

        System.out.println("Maximum profit done is : "+BuySellStocks(prices));

    }
}
