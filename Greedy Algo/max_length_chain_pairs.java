import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.Collection;
import java.util.Arrays;


public class max_length_chain_pairs {
    public static void main(String[] args) {
        int pairs [][] = {{5,24},{39,60},{5,28},{27,40},{59,90}};

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int cnt = 1;
        int pairEnd = pairs[0][1];

        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0] > pairEnd){
                cnt++;
            }
        }

        System.out.println("Total length of the chain is : "+cnt);
    }
}
