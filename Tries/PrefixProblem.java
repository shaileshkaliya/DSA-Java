import org.w3c.dom.Node;

public class PrefixProblem {

    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;
        int freq;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
                curr.children[idx].freq = 1; // Move this line here

            } else {
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static void FindPrefix(Node root, String ans) {

        if (root == null) {
            return;
        }
        if (root.freq == 1) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < root.children.length; i++) {
            if (root.children[i] != null) {
                FindPrefix(root.children[i], ans + (char) (i + 'a'));
            }
        }
    }

    public static void main(String[] args) {
        String words[] = { "zebra", "dog", "duck", "dove" };
        for (String str : words) {
            insert(str);
        }
        FindPrefix(root, "");
    }
}
