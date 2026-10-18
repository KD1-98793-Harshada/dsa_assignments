
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Assignment5_1 {

    static class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int value) {
            data = value;
            left = null;
            right = null;
        }

        public int getData() {
            return data;
        }
    }

    private Node root;

    public Assignment5_1() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void addNode(int value) {
        Node newnode = new Node(value);
        if (root == null) {
            root = newnode;
            return;
        }
        Node trav = root;
        while (true) {
            if (value < trav.data) {
                if (trav.left == null) {
                    trav.left = newnode;
                    break;
                } else {
                    trav = trav.left;
                }
            } else {
                if (trav.right == null) {
                    trav.right = newnode;
                    break;
                } else {
                    trav = trav.right;
                }
            }
        }
    }

    
    public int getNodeLevel(int value) {
        if (isEmpty()) {
            return -1; 
        }

        Node trav = root;
        int level = 1;

        while (trav != null) {
            if (trav.data == value) {
                return level; 
            } else if (value < trav.data) {
                trav = trav.left;
            } else {
                trav = trav.right;
            }
            level++;         }

        return -1; 
    }

    public void dfsTraversal() {
        if (isEmpty()) return;

        Stack<Node> st = new Stack<>();
        st.push(root);
        System.out.print("DFS :");
        while (!st.isEmpty()) {
            Node trav = st.pop();
            System.out.print(" " + trav.data);

            if (trav.right != null) st.push(trav.right);
            if (trav.left != null) st.push(trav.left);
        }
        System.out.println();
    }

    public void bfsTraversal() {
        if (isEmpty()) return;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        System.out.print("BFS :");

        while (!q.isEmpty()) {
            Node trav = q.poll();
            System.out.print(" " + trav.data);
            if (trav.left != null) q.offer(trav.left);
            if (trav.right != null) q.offer(trav.right);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Assignment5_1 bst = new Assignment5_1();

        
        bst.addNode(50);
        bst.addNode(30);
        bst.addNode(70);
        bst.addNode(20);
        bst.addNode(40);

        int key = 40;
        int level = bst.getNodeLevel(key);

        if (level != -1) {
            System.out.println("Node " + key + " is at Level/Depth: " + level);
        } else {
            System.out.println("Node " + key + " not found in BST.");
        }
    }
}


