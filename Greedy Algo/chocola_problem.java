import java.util.Arrays;
import java.util.Collections;

public class chocola_problem {
    public static void main(String[] args) {
        Integer[] h_cost = {4,1,2};
        Integer[] v_cost = {2,1,3,1,4};

        int h_pieces = 1;
        int v_pieces = 1;
        int h=0,v=0;
        int cost = 0;

        Arrays.sort(h_cost,Collections.reverseOrder());
        Arrays.sort(v_cost,Collections.reverseOrder());

        while(h<h_cost.length && v<v_cost.length){
            if(h_cost[h]<=v_cost[v]){
                cost += v_cost[v]*h_pieces;
                v_pieces++;
                v++;
            }else{
                cost += h_cost[h]*v_pieces;
                h_pieces++;
                h++;
            }
        }

        while(h<h_cost.length){
            cost += h_cost[h]*v_pieces;
            h++;
            h_pieces++;
        }

        while(v<v_cost.length){
            cost += v_cost[v]*h_pieces;
            v++;
            v_pieces++;
        }

        System.out.println("Total cost is rs "+cost);
    }
}
