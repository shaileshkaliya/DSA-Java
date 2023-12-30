

/*
 Time complexity of this algo is O(nLogn)
 But space complexity is O(n) because we have to use an extra temp array in Merge function
 */
public class merge_sort {

    public static void Merge(int arr[],int si,int mid,int ei)
    {

        int temp[] = new int[ei-si+1];
        int i=si;  // for lefter array
        int j=mid+1;  // for righter array
        int k=0;  //for temp array

        while(i <= mid && j <= ei)
        {
            if(arr[i] < arr[j]) {
                temp[k] = arr[i] ;
                i++;
                k++;
            }
            else {
                temp[k] = arr[j] ;
                j++;
                k++;
            }
        }

        while(i <= mid)  // for ramaining elements from lefter array
        {
            temp[k] = arr[i];
            k++;
            i++;
        }
        while(j <= ei)  // for remaining elements from righter array
        {
            temp[k] = arr[j];
            k++;
            j++;
        }
        
        for(k=0,i=si ; k<temp.length ; k++,i++) {
            arr[i] = temp[k];
        }
    }

    public static void MergeSort(int arr[],int si,int ei)
    {
        if(si >= ei) {
            return ;
        }
        int mid = si+((ei-si)/2);
        MergeSort(arr, si, mid);
        MergeSort(arr, mid+1, ei);
        Merge(arr, si,mid, ei);
    }
    public static void main(String[] args) {
        int arr[] = {9,2,6,4,3,1};

        MergeSort(arr, 0, arr.length-1);

        for(int i=0 ; i<arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
