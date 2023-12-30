
public class search_in_sorted_rotated_array {
    public static int SearchInArray(int arr[],int key,int si,int ei) {
        if(si >= ei) {
            return -1 ;
        }

        int mid = si+((ei-si)/2) ;

        if(arr[mid] == key) {
            return mid ;
        }

        if(arr[si] <= arr[mid])  // line 1 case
        {
            if(arr[si] <= key && arr[mid] >= key) {
                return SearchInArray(arr, key, si, mid-1);
            }
            else {
                return SearchInArray(arr, key, mid+1, ei);
            }
        }
        else {
            if(arr[mid] <= key && key <= arr[ei]) {
                return SearchInArray(arr, key, mid+1, ei);
            }
            else {
                return SearchInArray(arr, key, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2} ;

        System.out.println(SearchInArray(arr, 0, 0, arr.length-1));
    }
}
