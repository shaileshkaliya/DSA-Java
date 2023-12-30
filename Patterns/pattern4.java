import java.util.*;
public class pattern4 {
    public static void main(String args[]) {
        int n,i,j;
        char ch='A';
        System.out.println("Enter number of lines :");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        // System.out.println("Enter starting character ");
        // ch=sc.next();
        
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    
}
