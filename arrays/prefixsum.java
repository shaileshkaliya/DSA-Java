import java.util.*;

/*
 This is called prefix sum algorithm.Time complexity is O(n^2) as two loops only used,better than Brute force algorithm.
 */
public class prefixsum {

    public static int Prefix_Sum(int a[]) {
        
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int prefix[] = new int[a.length];
        prefix[0] = a[0] ;
        for(int i = 1 ; i < a.length ; i++) {
            prefix[i] = prefix[i-1] + a[i] ;
        }


        for(int i = 0 ; i < a.length ; i++) {
            int start = i ;
            for(int j = i ; j < a.length ; j++) {
                int end = j ;
                // currSum = 0 ;
                
                if(start == 0) {
                    currSum = prefix[end] ;
                }
                else {
                    currSum = prefix[end] - prefix[start-1] ;
                }

                System.out.println(currSum);
                
                if(currSum >= maxSum) {
                    maxSum = currSum ;
                }
            }
            System.out.println();
        }

        return maxSum;
        }

    public static void main(String[] args) {

        int arr[] = new int [5];
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
        
        System.out.println("Maximum sub array sum is : " + Prefix_Sum(arr));

    }
}
