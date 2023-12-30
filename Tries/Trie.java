public class Trie {

    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        Node(){
            for(int i=0;i<children.length;i++){
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int i=0;i<word.length();i++){
            int index = word.charAt(i)-'a';
            if(curr.children[index] == null){
                curr.children[index] = new Node();
            }
            curr = curr.children[index];
        }
        curr.eow = true;
    }

    public static boolean search(String word){
        Node curr = root ;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i)-'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }

        return curr.eow == true;
    }
    public static void main(String[] args) {
        String[] words = {"dog", "dove", "duck", "zen", "mango"};
        for(String word : words){
            insert(word);
        }
        System.out.println(search("dove"));
    }
}