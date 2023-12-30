import java.util.*;
public class triangle_0_1 {

    public static void triangle01(int m) {
        for(int i = 1 ; i <= m ; i++) {
            for(int j = 1 ; j <= i ; j++) {
                if((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                }
                else {
                    System.out.print(0 + " ");
                }

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

        triangle01(rows);
    }
}
