public class CircularLinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class circularLinkedList {
        Node head;

        // function to insert a new node at the head of the circular linked list
        public void insertAtHead(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                newNode.next = head; // Point to itself since it's the only node in the list
            } else {
                Node temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = newNode;
                newNode.next = head;
                head = newNode;
            }
        }

        // Function to display the circular linked list
        public void display() {
            if (head == null)
                return;
            Node temp = head;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
        }
    }

    public static class CircularLinkedlist {
        public static void main(String[] args) {
            CircularLinkedList list = new CircularLinkedList();
            list.insertAtHead(3);
            list.insertAtHead(2);
            list.insertAtHead(1);

            System.out.println("Circular Linked List after inserting at head:");
            list.display();
        }
    }

    private void display() {
    }

    private void insertAtHead(int i) {
//        System.out.println();
    }

}
