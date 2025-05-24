public class SinglyLinkedList {

    // Node class (inner class)
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the list
    private Node head;

    // Insert node at end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode; // first node
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next; // go to last node
            }
            temp.next = newNode; // link last node to new node
        }
    }

    // Display the list
    public void display() {
        Node temp = head;
        if (temp == null) {
            System.out.println("List is empty.");
            return;
        }

        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method to test
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display();  // Output: Linked List: 10 -> 20 -> 30 -> null
    }
}
