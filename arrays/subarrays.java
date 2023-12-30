// package arrays;
import java.util.*;
public class subarrays {

    public static void sub_arrays(int a[]) {

        System.out.println("Subarrays are : ");
        for(int i = 0 ; i < a.length ; i++) {
            int start = i ;
            for(int j = i ; j < a.length ; j++) {
                int end = j ;
                for(int k = start ; k <= end ; k++) {
                    System.out.print(a[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
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

        sub_arrays(arr);
    }
}
