import java.util.*;
public class inverted_half_pyramid_numbers {

    public static void InvertedHalfPyramidNumbers (int m , int n) {
        for(int i = 1 ; i <= m ; i++) {
            for(int j = 1 ; j <= (n-i+1) ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int rows,cols;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number of rows and columns : ");
        rows = sc.nextInt();
        cols = sc.nextInt();

        InvertedHalfPyramidNumbers(rows, cols);
    }
}
