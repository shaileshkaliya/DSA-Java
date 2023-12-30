import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class indian_coins {
    public static void main(String[] args) {
        Integer[] coins = {1,2,5,10,20,50,100,500,2000};

        int amount = 591;

        Arrays.sort(coins,Collections.reverseOrder());

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    amount -= coins[i];
                    ans.add(coins[i]);
                }

                if(amount==0){
                    break;
                }
            }
        }

        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
