public class zigZagLinkedList {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void zigZag() {
        if (head == null || head.next == null) return;

        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextLeft, nextRight;

        while (left != null && right != null) {
            nextLeft = left.next;
            left.next = right;
            nextRight = right.next;
            right.next = nextLeft;

            left = nextLeft;
            right = nextRight;
        }
    }

    public static void main(String[] args) {
        zigZagLinkedList ll = new zigZagLinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        System.out.println("Original List:");
        ll.print();

        ll.zigZag();

        System.out.println("Zig-Zag List:");
        ll.print();
    }
}