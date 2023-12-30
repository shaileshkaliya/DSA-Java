// package arrays;
import java.util.*;

/*
 Kadane's algo is used to find the maximum sum among all possible subarrays. Time complexity is O(n) only so better than brute force and prefux sum algo. 
 */

public class kadane_algo {

    public static int KadansAlgo(int a[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE ;

        // all negative numbers case
        int flag = 0 ;
        for(int i = 0 ; i < a.length ; i++) {
            if(a[i] < 0) {
                flag++ ;
            }
        }

        if(flag == a.length) {
            for(int i = 0 ; i < a.length ; i++) {
                if(a[i] > maxSum) {
                    maxSum = a[i] ;
                }
                
            }
            return maxSum ;
        }


        for(int i = 0 ; i < a.length ; i++) {
            
            currSum += a[i] ;
            if(currSum < 0) {
                currSum = 0 ;
            }

            maxSum = Math.max(currSum, maxSum);
        
        }
        
        System.out.println();

        return maxSum ;
    }
    public static void main(String[] args) {
        
        int arr[] = new int [4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements : ");
        for(int i = 0 ; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array is : ");
        for(int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("Maximum sum of sub array is "+KadansAlgo(arr));

    }
    
}
