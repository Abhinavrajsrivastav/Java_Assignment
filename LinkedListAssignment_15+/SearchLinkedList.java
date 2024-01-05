class Node {
    int data;
    Node next;
  
    Node(int d) {
        data = d;
        next = null;
    }
}

public class SearchLinkedList {
    public static void main(String[] args) {
        Node head = new Node(14);
        head.next = new Node(21);
        head.next.next = new Node(11);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(10);

        int X = 14;
        boolean result = searchElement(head, X);

        System.out.println(result ? "Yes" : "No");
    }

    static boolean searchElement(Node head, int X) {
        while (head != null) {
            if (head.data == X) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
