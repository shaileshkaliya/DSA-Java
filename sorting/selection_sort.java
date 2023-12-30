public class selection_sort {
//Time complexity is O(n^2) only as two loops are running or executing but only number of swapping is less than bubble sort.
    public static void SelectionSort(int a[]) {
        
        for(int i=0 ; i<a.length-1 ; i++) {
            int min = i ;
            for(int j=i+1 ; j<a.length ; j++) {
                if(a[j] <= a[min]) {
                    min = j ;
                }
            }
            int temp = a[i];
            a[i] = a[min] ;
            a[min] = temp ;
        }

        System.out.println("Sorted array is : ");
        for(int i=0 ; i<a.length ; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,3,1,2,6,9,15,32,0,-15,-1};

        SelectionSort(arr);
    }
    
}
