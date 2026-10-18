
import java.util.Stack;

public class Assignment5_2 {

    static class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int value) {
            data = value;
            left = null;
            right = null;
        }
    }

    private Node root;

    public Assignment5_2() {
        root = null;
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
                }
                trav = trav.left;
            } else {
                if (trav.right == null) {
                    trav.right = newnode;
                    break;
                }
                trav = trav.right;
            }
        }
    }

    public boolean isEmpty() {
        return root == null;
    }


    public void preOrder() {
        if (isEmpty()) return;

        Stack<Node> st = new Stack<>();
        st.push(root);

        System.out.print("Preorder : ");
        while (!st.isEmpty()) {
            Node trav = st.pop();
            System.out.print(trav.data + " ");


            if (trav.right != null) {
                st.push(trav.right);
            }
            if (trav.left != null) {
                st.push(trav.left);
            }
        }
        System.out.println();
    }


    public void inOrder() {
        if (isEmpty()) return;

        Stack<Node> st = new Stack<>();
        Node trav = root;

        System.out.print("Inorder  : ");
        while (trav != null || !st.isEmpty()) {

            while (trav != null) {
                st.push(trav);
                trav = trav.left;
            }


            trav = st.pop();
            System.out.print(trav.data + " ");


            trav = trav.right;
        }
        System.out.println();
    }


    public void postOrder() {
        if (isEmpty()) return;

        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();

        st1.push(root);

        while (!st1.isEmpty()) {
            Node trav = st1.pop();
            st2.push(trav);


            if (trav.left != null) {
                st1.push(trav.left);
            }
            if (trav.right != null) {
                st1.push(trav.right);
            }
        }

        System.out.print("Postorder: ");

        while (!st2.isEmpty()) {
            System.out.print(st2.pop().data + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Assignment5_2 bst = new Assignment5_2();

       
        bst.addNode(50);
        bst.addNode(30);
        bst.addNode(70);
        bst.addNode(20);
        bst.addNode(40);

        bst.preOrder();  
        bst.inOrder();   
        bst.postOrder(); 
    }
}
