// package 2-D Array;

public class search_in_sorted_matrix {

    public static boolean SearchElement(int a[][],int key) {
        int row = 0;
        int col = a[0].length-1;

        while(row < a.length && col >= 0) {
            

                if(key == a[row][col]) {
                    System.out.println("Key found at location ("+row+","+col+")");
                    return true;
                }
                else if(key > a[row][col]) {
                    row++ ;
                }
                else if(key < a[row][col]) {
                    col-- ;
                }
            }
        System.out.println("Element not found !");
        return false;
    }
    
    public static void main(String[] args) {
        int arr[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};

        System.out.println(SearchElement(arr, 33));
        

    }
}
