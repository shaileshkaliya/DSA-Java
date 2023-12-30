// package arrays;
import java.util.*;

/*
 Trapped Rain Water DSA Problems.
 Here auxillary arrays also known as helping array is used .
 Here leftmaxboundary and rightmaxboundary are auxillary arrays.
 Formula is = ( (Minimum of leftmaxboundary and rightmaxboundary) - height of building ) * width of building .
 Here if two buildings only , 0 is the water trapped
 If buildings are in height sorted ways then trapped water is 0
 */

public class rain_water_trapping {

    public static int AreaOfWater(int a[],int width) 
    {
        int leftMaxBoundary[] = new int[a.length];
        int rightMaxBoundary[] = new int[a.length];

        leftMaxBoundary[0] = a[0];
        rightMaxBoundary[(a.length)-1] = a[(a.length - 1)] ;

        for(int i = 1 ; i < a.length ; i++ ) {
            leftMaxBoundary[i] = Math.max(a[i], leftMaxBoundary[i-1]) ;
        }

        for(int i = (a.length - 2) ; i >= 0 ; i--) {
            rightMaxBoundary[i] = Math.max(a[i], rightMaxBoundary[i+1]) ;
        }
        
        // Displaying auxillary arrays used 

        // for(int i = 0 ; i < a.length ; i++){
        //     System.out.print(leftMaxBoundary[i]+" ");
        // }
        // System.out.println();
        // for(int i = 0 ; i < a.length ; i++){
        //     System.out.print(rightMaxBoundary[i]+" ");
        // }

        
        int trapped_water = 0 ;
        for(int i = 0 ; i < a.length ; i++) {
            int temp ;

            temp = ( Math.min(leftMaxBoundary[i], rightMaxBoundary[i]) - a[i] ) * width ;
            trapped_water += temp ;
        }

        return trapped_water ;

    }
    public static void main(String[] args) {

        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of buildings : ");
        n = sc.nextInt();
        int arr[] = new int [n] ;
        System.out.println("Enter heights of buildings : ");
        for(int i = 0 ; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        int width;
        System.out.print("Enter width of each building : ");
        width = sc.nextInt();

        System.out.println("Total area filled with water between buildings is : " + AreaOfWater(arr, width));
    }
}
