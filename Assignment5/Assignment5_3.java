
public class Assignment5_3 {

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

    public Assignment5_3() {
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


    public Node findSuccessor(int key) {
        Node successor = null;
        Node trav = root;

        while (trav != null) {
            if (key < trav.data) {

                successor = trav;
                trav = trav.left;
            } else if (key > trav.data) {
                trav = trav.right;
            } else {


                if (trav.right != null) {
                    successor = trav.right;
                    while (successor.left != null) {
                        successor = successor.left;
                    }
                }

                break;
            }
        }

        return successor;
    }

    public static void main(String[] args) {
        Assignment5_3 bst = new Assignment5_3();

        bst.addNode(50);
        bst.addNode(30);
        bst.addNode(70);
        bst.addNode(20);
        bst.addNode(40);
        bst.addNode(60);
        bst.addNode(80);


        int key1 = 30;
        Node succ1 = bst.findSuccessor(key1);
        System.out.println("Successor of " + key1 + " : " + (succ1 != null ? succ1.data : "None"));

        int key2 = 40;
        Node succ2 = bst.findSuccessor(key2);
        System.out.println("Successor of " + key2 + " : " + (succ2 != null ? succ2.data : "None"));

        int key3 = 80;
        Node succ3 = bst.findSuccessor(key3);
        System.out.println("Successor of " + key3 + " : " + (succ3 != null ? succ3.data : "None"));
    }
}
