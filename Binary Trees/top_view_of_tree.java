import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class top_view_of_tree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    static class Info {
        Node node;
        int horDist;

        Info(Node node, int data) {
            this.node = node;
            this.horDist = data;
        }
    }

    public static void findTopView(Node root) {
        HashMap<Integer, Node> map = new HashMap<>();
        Queue<Info> q = new LinkedList<>();

        int min = 0, max = 0;

        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info currInfo = q.remove();

            if (currInfo == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {

                if (!map.containsKey(currInfo.horDist)) {
                    map.put(currInfo.horDist, currInfo.node);
                }

                if (currInfo.node.left != null) {
                    q.add(new Info(currInfo.node.left, currInfo.horDist - 1));
                    min = Math.min(min, currInfo.horDist-1);
                }

                if (currInfo.node.right != null) {
                    q.add(new Info(currInfo.node.right, currInfo.horDist + 1));
                    max = Math.max(max, currInfo.horDist+1);
                }
            }
        }

        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);

        root2.left.right = new Node(4);
        root2.left.right.right = new Node(5);
        root2.left.right.right.right = new Node(6);

        // findTopView(root);
        System.out.println();
        findTopView(root2);
    }

}
