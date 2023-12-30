import java.util.*;
public class pattern1 {
    public static void main(String args[]) {
        int n,i,j;
        System.out.println("Enter number of lines :");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
