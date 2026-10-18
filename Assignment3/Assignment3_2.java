
public class Assignment3_2 {


    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    static class SortedLinkedList {
        private Node head;

        public SortedLinkedList() {
            this.head = null;
        }


        public void insertSorted(int value) {
            Node newNode = new Node(value);


            if (head == null || value < head.data) {
                newNode.next = head;
                head = newNode;
                return;
            }


            Node trav = head;
            while (trav.next != null && trav.next.data < value) {
                trav = trav.next;
            }


            newNode.next = trav.next;
            trav.next = newNode;
        }


        public void display() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            Node trav = head;
            System.out.print("Sorted List: ");
            while (trav != null) {
                System.out.print(trav.data + " -> ");
                trav = trav.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        SortedLinkedList list = new SortedLinkedList();


        list.insertSorted(40);
        list.insertSorted(10);
        list.insertSorted(30);
        list.insertSorted(20);
        list.insertSorted(50);
        list.insertSorted(5);

        list.display();
    }
}
