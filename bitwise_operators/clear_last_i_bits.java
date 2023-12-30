public class clear_last_i_bits {

    public static int ClearLastIBits(int n,int i) {
        int bitmask = (~0)<<i ;
        return (n & bitmask);
    }
    public static void main(String[] args) {
        System.out.println(ClearLastIBits(15, 2));
    }
    
}
