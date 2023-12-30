
import java.util.*;

public class bubble_sort {

    public static void BubbleSort(int a[]) {
        for(int i=0 ; i<a.length-1 ; i++) {
            for(int j=0 ; j<a.length-1-i ; j++) {
                if(a[j] > a[j+1] ) {
                    int temp = a[j];
                    a[j] = a[j+1] ;
                    a[j+1] = temp; 
                }
            }
        }

        for(int i=0 ; i<a.length ; i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {9,8,1,5,6};

        BubbleSort(arr);
    }
}
