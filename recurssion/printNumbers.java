// package recurssion;

public class printNumbers {
    public static void PrintDescendingNumbers(int n) {
        if(n == 1) {
            System.out.print(n+" ");
            return ;
        }
        System.out.print(n+" ");
        PrintDescendingNumbers(n-1);

    }

    public static void PrintAscendingNumbers(int n) {
        if(n == 1) {
            System.out.print(n+" ");
            return ;
        }
        PrintAscendingNumbers(n-1);
        System.out.print(n+" ");

    }

    public static void main(String[] args) {
        PrintDescendingNumbers(10);
        System.out.println();
        PrintAscendingNumbers(10);;
    }
}
