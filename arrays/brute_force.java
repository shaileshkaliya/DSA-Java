import java.util.*;


/*
 Time complexity is O(n^3) which is very worst as three loops are running in the program.
 */


public class brute_force {

    public static int BruteForce(int a[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0 ; i < a.length ; i++) {
            int start = i ;
            for(int j = i ; j < a.length ; j++) {
                int end = j ;
                currSum = 0 ;
                for(int k = start ; k <= end ; k++) {
                    currSum += a[k] ;
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
    public static void main(String args[])
    {
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

        System.out.println("Maximum subarray sum is : " + BruteForce(arr));
        

    }
}
