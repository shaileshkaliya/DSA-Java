import java.util.*;

import javax.swing.plaf.synth.SynthStyle;

public class activity_selection {
    public static void main(String args[])
    {
        int start [] = {1,3,0,5,8,5};
        int end [] = {2,4,6,7,9,9};

        int arr[][] = new int[start.length][3]; 

        for(int i=0;i<start.length;i++){
            arr[i][0] = i;
            arr[i][1] = start[i];
            arr[i][2] = end[i];
        }

        Arrays.sort(arr, Comparator.comparingDouble(o -> o[2]));  //(o -> o[2]) is a lambda function

        int cnt = 1;

        ArrayList <Integer> ans = new ArrayList<>();

        ans.add(0);
        int lastActivity = arr[0][2];

        for(int i=1;i<start.length;i++){
            if(arr[i][1] > lastActivity){
                ans.add(arr[i][0]);
                cnt++;
                lastActivity = arr[i][2];
            }
        }

        System.out.println("Total number of activities is "+cnt);

        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
    }
}
