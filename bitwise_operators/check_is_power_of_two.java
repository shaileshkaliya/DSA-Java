public class check_is_power_of_two {

    public static boolean IsPowerOfTwo(int n) {
        if((n & (n-1)) != 0) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(IsPowerOfTwo(9));
        System.out.println(IsPowerOfTwo(256));

    }
}
