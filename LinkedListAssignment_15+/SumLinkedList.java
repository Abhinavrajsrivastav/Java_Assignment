class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class SumLinkedList {
    public static void main(String[] args) {
        Node list1 = new Node(5);
        list1.next = new Node(6);
        list1.next.next = new Node(3);

        Node list2 = new Node(8);
        list2.next = new Node(4);
        list2.next.next = new Node(2);

        Node result = addTwoNumbers(list1, list2);

        // Print the resultant linked list
        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }

    static Node addTwoNumbers(Node l1, Node l2) {
        Node dummyHead = new Node(0);
        Node current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.data : 0;
            int y = (l2 != null) ? l2.data : 0;

            int sum = carry + x + y;
            carry = sum / 10;

            current.next = new Node(sum % 10);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carry > 0) {
            current.next = new Node(carry);
        }

        return dummyHead.next;
    }
}
