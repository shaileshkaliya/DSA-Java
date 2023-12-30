import java.util.*;
public class hollow_square {

    public static void HollowSquare (int m, int n) {
        for(int i = 1 ; i <= m ; i++) {
            for(int j = 1 ; j <= n ; j++) {
                if(i == 1 || i == m || j == 1 || j == n) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
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
        HollowSquare(rows, cols);
    } 
}
