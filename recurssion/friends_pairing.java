public class friends_pairing {

    public static int FriendsPairing(int n) // n  is number of friends
    {   
        //base case
        if(n == 1 || n == 2) {
            return n ;
        }

        //for making no pair i.e. all friends single 
        int fnm1 = FriendsPairing(n-1);

        //for making pairs of friends 
        int fnm2 = FriendsPairing(n-2);
        int total_pairings = (n-1)*fnm2 ;

        return fnm1+total_pairings ;
        
    }
    public static void main(String[] args) {
        System.out.println(FriendsPairing(2));
        System.out.println(FriendsPairing(3));
        System.out.println(FriendsPairing(4));
        System.out.println(FriendsPairing(1));
        System.out.println(FriendsPairing(5));


    }
}
