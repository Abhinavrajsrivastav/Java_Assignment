class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class InsertNodeAtPosition {
    static Node head;

    public static void main(String[] args) {
        // Assume the linked list is already created.
        Node newNode = new Node(15); // The node to be inserted
        Node pointerNode = head.next; // The node after which the new node is to be inserted

        insertNodeAfterPosition(pointerNode, newNode);

        // Print the updated linked list
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    static void insertNodeAfterPosition(Node pointer, Node newNode) {
        if (pointer == null) {
            System.out.println("Invalid position");
            return;
        }

        newNode.next = pointer.next;
        pointer.next = newNode;
    }
}
