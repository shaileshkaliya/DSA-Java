import java.util.*;

public class rotated_sorted_array_pair_sum {

    public static ArrayList<Integer> PairSum(ArrayList<Integer> arr,int target)
    {
        int leftPtr=0,rightPtr=0 ;
        ArrayList<Integer> ans = new ArrayList<>() ;
        for(int j=0 ; j<arr.size()-1 ; j++){
            if(arr.get(j) > arr.get(j+1)) {
                leftPtr = j+1 ;
                rightPtr = j ;
                break;
            }
        }

        while(leftPtr != rightPtr) {
            if(arr.get(rightPtr)+arr.get(leftPtr) == target){
                ans.add(rightPtr);
                ans.add(leftPtr);

                return ans ;
            }
            if(arr.get(leftPtr)+arr.get(rightPtr) < target) {
                leftPtr = (leftPtr+1)%arr.size();
            }
            else {
                rightPtr = (arr.size()+rightPtr-1)%arr.size();
            }
        }
        return ans ;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>() ;
        list.add(7);
        list.add(6);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(PairSum(list, 13));
    }
}
