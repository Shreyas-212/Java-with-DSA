import java.util.LinkedList;
import java.util.Stack;

public class javaCollectionsFramework {
    public static void main(String[] args) {
        // LinkedList<Integer> ll = new LinkedList<>();
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addFirst(0);
        // System.out.println(ll);
        // ll.removeLast();
        // ll.removeFirst();
        // System.out.println(ll);

        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
