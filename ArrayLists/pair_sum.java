import java.util.*;

// It is done in sorted array


public class pair_sum {
    public static ArrayList<Integer> BruteForce(ArrayList<Integer> arr,int target)
    {
        ArrayList<Integer> ans = new ArrayList<>() ;
        for(int i=0 ; i<arr.size() ; i++){
            for(int j=i+1 ; j<arr.size() ; j++){
                if(arr.get(i)+arr.get(j) == target){
                    ans.add(i) ;
                    ans.add(j) ;
                    
                    return ans ;
                }
            }
        }
        return ans ;
    }

    public static ArrayList<Integer> TwoPointerApproach(ArrayList<Integer> arr,int target)
    {
        ArrayList<Integer> ans = new ArrayList<>() ;
        int leftPtr = 0 ;
        int rightPtr = arr.size()-1 ;

        while(leftPtr != rightPtr) {
            if(arr.get(leftPtr)+arr.get(rightPtr) == target) {
                ans.add(leftPtr);
                ans.add(rightPtr);

                return ans ;
            }

            if(arr.get(leftPtr)+arr.get(rightPtr) < target){
                leftPtr++ ;
            }
            else {
                rightPtr-- ;
            }
        }
        return ans ;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>() ;
        list.add(1) ;
        list.add(2) ;
        list.add(3) ;
        list.add(4) ;
        list.add(5) ;
        list.add(6) ;

        System.out.println(BruteForce(list, 20));

        System.out.println("Answer wit two pointer approach is : "+TwoPointerApproach(list, 7));
    }
}
