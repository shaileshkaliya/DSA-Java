public class tower_of_henoi {

    public static void TOH(int n,char src,char dest,char helper) //TOH : Tower of Henoi
    {
        if(n == 1) {
            System.out.println("Move disk "+n+" from "+src+" to "+dest);
            return ;
        }

        TOH(n-1, src, helper, dest);
        System.out.println("Move disk "+n+" from "+src+" to "+dest);
        TOH(n-1, helper, dest, src);
    }
    public static void main(String[] args) {
        TOH(6, 'A', 'C', 'B');
    }
}