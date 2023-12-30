import java.util.*;

public class hollow_rhombus {

    public static void HollowRhombus(int m) {
        for(int i = 1 ; i <= m ; i++) {
            for(int j = 1 ; j <= (m - i) ; j++) {
                System.out.print(" ");
            }

            for(int j = 1 ; j <= m ; j++) {

                if(i == 1 || i == m || j ==1 || j == m){
                System.out.print("*" );
                }
                else {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number of rows : ");
        rows = sc.nextInt();

        HollowRhombus(rows);
    }
}
