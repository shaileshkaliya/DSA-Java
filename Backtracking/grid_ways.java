public class grid_ways {

    public static int GridWays(int arr[][],int rows,int cols)
    {
        //base case
        if(rows == arr.length-1 || cols == arr[0].length-1){
            return 1;
        }
        else if(rows == arr.length || cols == arr[0].length) {
            return 0;
        }

        //recurssion calls

        return (GridWays(arr, rows+1, cols)+GridWays(arr, rows, cols+1));


    }
    public static void main(String[] args) {

        int rows=3,cols=3;
        int arr[][] = new int[rows][cols];

        System.out.println("Total number of ways to reach at final destination is : "+GridWays(arr, 0, 0));
    }
}
