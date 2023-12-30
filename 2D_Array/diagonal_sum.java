import java.util.*;

/*
 Primary diagonal - from ledt to right ; sum = sum of all a[i][i];
 Secondary diagonal - from right to left ; sum = sum of all a[i][j] where i+j = n-1 ;
 Only square matrix is allowed of size n * n
 */
public class diagonal_sum {

    public static int DiagonalSum(int a[][]) {
        int sum = 0;

        //Brute force code means with simplest logic but time complexity is O(n^2)

        // for(int i=0 ; i<a.length ; i++) {
        //     for(int j=0 ; j<a[0].length ; j++) {
        //         if(i == j) {

        //             sum += a[i][j];
        //         }
        //         if(i+j == (a.length-1)) {
        //             if(i == j)
        //             {}
                    
        //             else {
        //                 sum += a[i][j];
        //             }
        //         }
        //     }

        // }
        // return sum ;
        
        //Optimized code time complexity is O(n)
        
        for(int i=0 ; i<a.length ; i++) {
            sum += a[i][i];

            if(i != a.length-1-i) {
                sum += a[i][a.length-1-i] ;
            }
        }

        return sum ;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        System.out.println("Sum of primary and secondary diagonal elements is : "+DiagonalSum(arr));
    }
}
