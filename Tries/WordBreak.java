public class WordBreak {

    static class Node {
        Node[] children = new Node[26];
        boolean eow = false ;

        Node(){
            for(int i=0;i<26;i++){
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root ;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i)-'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String word){
        Node curr = root ;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i)-'a';
            if(curr.children[idx] == null){
                return false ;
            }
            curr = curr.children[idx];
        }

        return curr.eow == true ;
    }

    public static boolean Wordbreak(String key){
        if(key.length() == 0){
            return true;
        }

        for(int i=1; i<=key.length(); i++){
            if(search(key.substring(0, i)) && Wordbreak(key.substring(i))){
                return true ;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        String[] words = {"i", "like", "samsung", "sam", "mobile", "ice"} ;
        for(String str:words){
            insert(str);
        }

        String key = "ilikesamsung" ;

        System.out.println(Wordbreak(key));
    }
}
