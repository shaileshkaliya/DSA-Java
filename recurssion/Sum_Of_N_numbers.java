// package recurssion;

public class Sum_Of_N_numbers {
    public static int SumOfNnumbers(int n) {
        if(n == 1){
            return 1;
        }

        return (n+SumOfNnumbers(n-1));
    }
    
    public static void main(String[] args) {
        System.out.println(SumOfNnumbers(10));
    }
    
}
