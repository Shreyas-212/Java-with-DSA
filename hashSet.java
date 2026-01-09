import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(4);
        hs.add(2);
        hs.add(1);

        System.out.println(hs);

        if(hs.contains(2)) {
            System.out.println("Set contains 2");
        }

        hs.remove(2);
        if (hs.contains(2)) {
            System.out.println("Set contains 2");
        }
    }
}