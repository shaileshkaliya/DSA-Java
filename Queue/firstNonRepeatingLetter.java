import java.util.LinkedList;
import java.util.Queue;

public class firstNonRepeatingLetter {

    public static void first_repeating_letter(String s){
        Queue<Character> q = new LinkedList<>();

        int arr[] = new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            arr[ch-'a']++;
            q.add(ch);

            while(!q.isEmpty() && arr[q.peek()-'a']>1){
                q.remove();
            }

            if(q.isEmpty()){
                System.out.print(-1+" ");
            }else{
                System.out.print(q.peek()+" ");
            }
        }
    }
    public static void main(String[] args) {
        String s = "aabbcddexc";
        first_repeating_letter(s);
    }
}
