public class isOddEven {

    public static void IsOddEven(int n) {
        int bitMask = 1 ;

        if((n & bitMask) == 0 ) {
            System.out.println("Number is even ");
        }
        else {
            System.out.println("Number is odd ");
        }
    }
    public static void main(String[] args) {
        IsOddEven(3);
        IsOddEven(4);
        IsOddEven(0);

    }
    
}
