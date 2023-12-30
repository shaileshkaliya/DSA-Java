import java.util.*;
public class diamond {

    public static void Diamond(int m) {
        
        for(int i = 1 ; i <= m/2 ; i++) {

            for(int j = 1 ; j <= ((m/2) - i) ; j++) {
                System.out.print(" ");
            }

            for(int j = 1 ; j <= ((2 * i)-1) ; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        for(int i = m/2 ; i >= 1 ; i--) {

            for(int j = 1 ; j <= ((m/2) - i) ; j++) {
                System.out.print(" ");
            }

            for(int j = 1 ; j <= ((2 * i)-1) ; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    

    public static void main(String[] args) {
        int rows;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        rows = sc.nextInt();
        Diamond(rows);
    }
}
