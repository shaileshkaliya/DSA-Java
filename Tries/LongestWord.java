public class LongestWord {

    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;

        Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (curr.children[index] == null) {
                curr.children[index] = new Node();
            }
            curr = curr.children[index];
        }
        curr.eow = true;
    }

    public static String ans = "";

    public static void longestWord(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }
        for (int i = 0; i < root.children.length; i++) {
            if (root.children[i] != null && root.children[i].eow) {
                char ch = (char) (i + 'a');
                temp.append(ch);
                
                // Check if the current word is longer than the current ans
                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);

                // backtrack
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        String[] words = {"a", "banana", "app", "ap", "appl", "apple", "apply"};
        for (String word : words) {
            insert(word);
        }

        longestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }
}
