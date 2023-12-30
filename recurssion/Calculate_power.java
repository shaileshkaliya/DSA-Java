// package recurssion;

public class Calculate_power {

    public static int CalculatePower(int a,int n)       // Time complexity is O(n)
    {
        if(n == 0){
            return 1;
        }

        return a*CalculatePower(a, n-1);
    }

    public static int CalcPowerOptimized(int a,int n)    //Time complexity is O(logN)
    {
        if(n == 0) {
            return 1;
        }
        int power = CalcPowerOptimized(a, n/2);
        int powerSq = power*power ;
        if(n % 2 != 0) {
            return a*powerSq ;
        }

        return powerSq;
    }
    public static void main(String[] args) {
        // System.out.println(CalculatePower(10, 9));
        System.out.println();

        System.out.println(CalcPowerOptimized(10, 9));
    }
}
