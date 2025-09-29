class practiceProblem51 {
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Function to find intersection point
    public Node getIntersectionNode(Node head1, Node head2) {
        while (head2 != null) {
            Node temp = head1;
            while (temp != null) {
                if (temp == head2) { // same node (by reference, not by value)
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;
    }

    public static void main(String[] args) {
        practiceProblem51 list = new practiceProblem51();
        Node head1, head2;

        // Creating first linked list
        head1 = new Node(10);

        // Creating second linked list
        head2 = new Node(3);
        Node newNode = new Node(6);
        head2.next = newNode;
        newNode = new Node(9);
        head2.next.next = newNode;

        // Create intersection
        newNode = new Node(15);
        head1.next = newNode;
        head2.next.next.next = newNode;

        newNode = new Node(30);
        head1.next.next = newNode;
        head1.next.next.next = null;

        // Find intersection point
        Node intersectionPoint = list.getIntersectionNode(head1, head2);

        if (intersectionPoint == null) {
            System.out.print("No Intersection Point\n");
        } else {
            System.out.print("Intersection Point: " + intersectionPoint.data);
        }
    }
}