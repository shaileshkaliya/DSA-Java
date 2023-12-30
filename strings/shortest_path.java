// package strings;
import java.util.*;

public class shortest_path {

    public static float ShortestPath(String str) {
        
        int X=0;
        int Y=0;

        for(int i=0 ; i<str.length() ; i++) {
            if(str.charAt(i) == 'N') {
                Y++;
            }

            else if(str.charAt(i) == 'S') {
                Y--;
            }

            if(str.charAt(i) == 'E') {
                X++;
            }

            if(str.charAt(i) == 'W') {
                X--;
            }
        }

        return (float)Math.sqrt(((X*X)+(Y*Y))) ;
    }
    public static void main(String[] args) {
        String str = "NSNNEE";
        System.out.println(ShortestPath(str));
    }
}
