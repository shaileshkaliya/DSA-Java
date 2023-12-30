import java.util.*;
public class butterfly {

    public static void Butterfly(int m , int n) {
        for(int i = 1 ; i <= m ; i++) {
            for(int j = 1 ; j <= i ; j++) {
                System.out.print("*");
            }
            for(int j = 1 ; j <= (n - (2 * i)) ; j++) {
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i = m ; i >= 1 ; i--) {
            for(int j = 1 ; j <= i ; j++) {
                System.out.print("*");
            }
            for(int j = 1 ; j <= (n - (2 * i)) ; j++) {
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int rows,cols;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number of rows and columns : ");
        rows = sc.nextInt();
        cols = sc.nextInt();

        Butterfly(rows, cols);

    }
}
