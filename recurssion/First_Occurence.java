// package recurssion;

public class First_Occurence {

    public static int FirstOccurence(int arr[],int key,int i) {
        
        if(i == arr.length) {
            return -1;
        }
        if(arr[i] == key) {
            return i;
        }

        return FirstOccurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,6,9,8};
        System.out.println(FirstOccurence(arr, 10, 0));
        
    }
}
