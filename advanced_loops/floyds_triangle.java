import java.util.*;
public class floyds_triangle {
    
    public static void FloydsTriangle(int m) {

        int counter = 1 ;
        for(int i = 1 ; i <= m ; i++) {
            for (int j = 1 ; j <= i ; j++) {
                System.out.print(counter + " ");
                counter ++ ;
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int rows ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number of rows : ");
        rows = sc.nextInt();

        FloydsTriangle(rows);
    }
}
