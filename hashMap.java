import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("China", 150); 
        hm.put("US", 50);

        System.out.println(hm);

        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("Indonesia"));

        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));

        System.out.println(hm.remove("China"));
        System.out.println(hm);

        System.out.println(hm.size());
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}
