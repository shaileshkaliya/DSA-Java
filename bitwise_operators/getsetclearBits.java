public class getsetclearBits {

    public static int Get_ith_Bit(int n , int i) {
        int bitmask = (1 << i);
        if((n & bitmask) == 0) {
            return 0;
        }
        else {
            return 1;
        }
        
    }

    public static int Set_ith_Bit(int n , int i) {
        int bitmask = (1 << i);
        return (n | bitmask);
    }

    public static int Clear_ith_Bit(int n , int i) {
        int bitmask = ~(1 << i);
        return (n & bitmask);
    }

    public static int Update_ith_Bit(int n, int i , int newBit) {
        int r;
        if(newBit == 0) {
            r = Clear_ith_Bit(n, i);
        }
        else {
            r = Set_ith_Bit(n, i);
        }

        return r;
    }


    public static void main(String[] args) {
    System.out.println("I th bit is : "+Get_ith_Bit(10, 2));
    System.out.println("Set ith bit : "+Set_ith_Bit(15, 2));
    System.out.println("Clear ith bit : "+Clear_ith_Bit(11, 1));
    System.out.println("Update ith bit : "+Update_ith_Bit(20, 3, 1));
    }
}
