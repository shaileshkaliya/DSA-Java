/*
 Time complexity is O(nLogn) same as merge sort 
 but space complexity is O(1) less than merge sort 
 But in worst case i.e when array is already sorted in ascneding or descending order and our pivot element is last element so our time complexity becomes O(n^2)
 */
public class quick_sort {
    public static int partition(int arr[],int si,int ei) {
        int pivot = arr[ei];
        int i =si-1;
        for(int j=si ; j<ei ; j++){
            if(arr[j] <= pivot) {
                i++;
                //swap the elements 
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }

        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void QuickSort(int arr[],int si,int ei)
    {
        if(si >= ei) {
            return ;
        }

        int pivotIndex = partition(arr, si, ei);

        QuickSort(arr, si, pivotIndex-1);
        QuickSort(arr, pivotIndex+1, ei);
    }
    public static void main(String[] args) {
        int arr[] = {9,6,3,2,5,8,7,4,1};

        QuickSort(arr, 0, arr.length-1);

        for(int i=0 ; i<arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
