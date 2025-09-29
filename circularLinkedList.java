public class circularLinkedList {
    static class Node {
        int data;
        Node next;
    }

    // Add to empty list
    static Node addToEmpty(Node last, int data) {
        if (last != null)
            return last;

        Node newNode = new Node();
        newNode.data = data;
        last = newNode;
        last.next = last;
        return last;
    }

    // Add at front
    static Node addFront(Node last, int data) {
        if (last == null)
            return addToEmpty(last, data);

        Node newNode = new Node();
        newNode.data = data;
        newNode.next = last.next;
        last.next = newNode;
        return last;
    }

    // Add at end
    static Node addEnd(Node last, int data) {
        if (last == null)
            return addToEmpty(last, data);

        Node newNode = new Node();
        newNode.data = data;
        newNode.next = last.next;
        last.next = newNode;
        last = newNode;
        return last;
    }

    // Add after a given item
    static Node addAfter(Node last, int data, int item) {
        if (last == null)
            return null;

        Node newNode, p;
        p = last.next;
        do {
            if (p.data == item) {
                newNode = new Node();
                newNode.data = data;
                newNode.next = p.next;
                p.next = newNode;

                if (p == last)
                    last = newNode;
                return last;
            }
            p = p.next;
        } while (p != last.next);

        System.out.println(item + " not present in the list.");
        return last;
    }

    // Delete a node
    static Node deleteNode(Node last, int key) {
        if (last == null)
            return null;

        // If list has only one node
        if (last.data == key && last.next == last) {
            last = null;
            return last;
        }

        Node temp = last, d;

        // If key is present in last node
        if (last.data == key) {
            while (temp.next != last) {
                temp = temp.next;
            }
            temp.next = last.next;
            last = temp.next;
            return last;
        }

        // Otherwise, find the key
        while (temp.next != last && temp.next.data != key) {
            temp = temp.next;
        }

        if (temp.next.data == key) {
            d = temp.next;
            temp.next = d.next;
        }
        return last;
    }

    // Traverse list
    static void traverse(Node last) {
        Node p;

        if (last == null) {
            System.out.println("List is empty.");
            return;
        }

        p = last.next; // start from head
        do {
            System.out.print(p.data + " ");
            p = p.next;
        } while (p != last.next);

        System.out.println();
    }

    public static void main(String[] args) {
        Node last = null;

        last = addToEmpty(last, 6);
        last = addEnd(last, 8);
        last = addFront(last, 2);
        last = addAfter(last, 10, 2);

        System.out.println("Circular Linked List:");
        traverse(last); // 2 10 6 8

        last = deleteNode(last, 8);
        System.out.println("After deleting 8:");
        traverse(last); // 2 10 6
    }
}