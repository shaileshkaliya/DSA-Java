import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class fractional_knapsack {
    public static void main(String args[])
    {
        int[] value = {60,100,120};
        int[] weight = {10,20,30};
        double cost = 0 ;
        int w = 50 ;

        double ratio[][] = new double[value.length][2];

        for(int i=0;i<value.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = (double)(value[i]/weight[i]);
        }

        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));

        for(int i=ratio.length-1;i>=0;i--){
            int idx = (int)ratio[i][0];

            if(w > weight[idx]){
                cost += value[idx];
                w -= weight[idx];
            }else{
                cost += w*ratio[i][1];
                break;
            }
        }

        System.out.println("Total max cost is "+cost);
    }
}
