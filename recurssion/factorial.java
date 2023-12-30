// package recurssion;

public class factorial {

    public static int Factorial(int n) {
        if(n == 0){
            return 1;
        }

        return (n*Factorial(n-1));
    }
    public static void main(String[] args) {
        System.out.println(Factorial(6));
    }
}
