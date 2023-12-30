public class UniqueSubstrings {
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

    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int count = 0;
        for(int i=0;i<root.children.length;i++){
            if(root.children[i] != null){
                count += countNodes(root.children[i]);
            }
        }

        return count+1 ;
    }


    public static void main(String[] args) {
        String str = "ababa";
        for(int i=0;i<str.length();i++){
            insert(str.substring(i));
        }
        System.out.println(countNodes(root));
    }
}
