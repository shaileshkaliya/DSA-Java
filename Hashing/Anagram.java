import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static boolean isAnagram(String s, String t) {
        if(s.length() == t.length()){

        Map <Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i=0;i<t.length();i++){
            if(map.get(t.charAt(i)) != null){
                if(map.get(t.charAt(i))==1){
                    map.remove(t.charAt(i));
                }else{
                    map.put(t.charAt(i), map.get(t.charAt(i))-1);
                }
            }
        }
        if(map.isEmpty()){
            return true;
        }else{
            return false;
        }
    }else{
        return false;
    }
        

} 
    public static void main(String[] args) {
        String st = "lipid";
        String st2 = "tulip";
        System.out.println(isAnagram(st, st2));
    }
}
